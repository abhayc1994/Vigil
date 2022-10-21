package com.vigil.automation.service;

import com.mongodb.client.DistinctIterable;
import com.mongodb.client.MongoCursor;
import com.vigil.automation.entity.cucumber.Feature;
import com.vigil.automation.entity.cucumber.Scenario;
import com.vigil.automation.entity.cucumber.Step;
import com.vigil.automation.exceptions.ResourceNotFoundException;
import com.vigil.automation.repositories.TestResultsRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class ResultsServiceImpl implements ResultsService {

   private Logger logger =
	   LoggerFactory.getLogger(ResultsService.class);
   @Autowired
   private TestResultsRepository resultsRepository;
   @Autowired
   MongoTemplate mongoTemplate;

   @Override
   public Feature save(Feature result) {
	  result.setTestStatsMap(
		  getStatsForFeature(result));
	  Optional<Feature> optionalTestResult = getResultByBuildNumberAndFeatureId(
		  result.getBuildNumber(),
		  result.getFeatureID());
	  if (optionalTestResult.isPresent()) {
		 Feature existingResult = optionalTestResult.get();
		 result.setObjectID(existingResult.getObjectID());
	  }
	  return resultsRepository.save(result);
   }

   @Override
   public Feature updateResultByID(Feature result) throws ResourceNotFoundException {
	  Optional<Feature> existingTestResult = this.resultsRepository.findById(result.getId());
	  if (existingTestResult.isPresent()) {
		 Feature feature = existingTestResult.get();
		 feature.setId(result.getId());
		 return feature;
	  } else {
		 throw new ResourceNotFoundException("Record not found with id : " + result.getId());
	  }
   }

   public Feature findResultsById(String resultId) throws ResourceNotFoundException {
	  Optional<Feature> resultOptional = resultsRepository.findById(resultId);
	  if (resultOptional.isPresent()) {
		 return resultOptional.get();
	  } else {
		 throw new ResourceNotFoundException("Record not found with id : " + resultId);
	  }
   }

   @Override
   public List<String> getAllModuleNamesList() {
	  List<String> moduleList = new ArrayList<>();
	  DistinctIterable<String> distinctIterable = mongoTemplate.getCollection(
			  "results")
		  .distinct("moduleName", String.class);
	  try (MongoCursor cursor = distinctIterable.iterator()) {
		 while (cursor.hasNext()) {
			String module = (String) cursor.next();
			moduleList.add(module);
		 }
	  }
	  return moduleList;

   }

   @Override
   public List<Map<String, String>> getExecutedBuildsByModuleName(String moduleName) {
	  List<Map<String, String>> list = new ArrayList<>();
	  List<Feature> results = resultsRepository.findResultsByModuleName(moduleName);
	  List<String> buildNumbers = results.stream().map(Feature::getBuildNumber)
		  .collect(Collectors.toList()).stream().distinct().collect(Collectors.toList());

	  for (String buildNumber : buildNumbers) {
		 long passed = 0;
		 long failed = 0;
		 long skipped = 0;
		 List<Feature> features = resultsRepository.findResultsByBuildNumber(buildNumber);
		 for (Feature feature : features) {
			Map<String, String> map = feature.getTestStatsMap();
			passed = passed + Long.parseLong(map.get("PASSED"));
			failed = failed + Long.parseLong(map.get("FAILED"));
			skipped = skipped + Long.parseLong(map.get("SKIPPED"));
		 }
		 Map<String, String> map = new HashMap<>();
		 map.put("buildNumber", buildNumber);
		 map.put("passed", passed + "");
		 map.put("failed", failed + "");
		 map.put("skipped", skipped + "");
		 list.add(map);
	  }
	  return list;
   }

   @Override
   public List<Feature> getTestResultByModuleNameAndBuildNumber(String moduleName,
	   String buildNumber) {
	  return resultsRepository.findResultsByModuleNameAndBuildNumber(moduleName, buildNumber);
   }

   private Map<String, String> getStatsForFeature(Feature feature) {
	  long passed = 0;
	  long failed = 0;
	  long skipped = 0;
	  List<Step> bgSteps = new ArrayList<>();
	  Predicate<Scenario> scenarioPredicate = scenario -> scenario.getType()
		  .equalsIgnoreCase("background");
	  Optional<Scenario> backgroundScenarioOptional = feature.getScenarios().stream()
		  .filter(scenarioPredicate).findFirst();
	  if (backgroundScenarioOptional.isPresent()) {
		 bgSteps.addAll((backgroundScenarioOptional.get().getSteps()));
	  }
	  for (Scenario scenario : feature.getScenarios()) {
		 if (scenario.getType()
			 .equalsIgnoreCase("background")) {
			continue;
		 }
		 List<Step> scenarioSteps = scenario.getSteps();
		 List<Step> modifiedSteps = new ArrayList<>();
		 if (bgSteps.size() > 0) {
			modifiedSteps.addAll(bgSteps);
		 }
		 modifiedSteps.addAll(scenarioSteps);
		 boolean isAnyStepFailedOrSkipped = false;
		 for (Step step : modifiedSteps) {
			if (step.getResult().getStatus().equalsIgnoreCase("failed")) {
			   failed++;
			   isAnyStepFailedOrSkipped = true;
			   break;
			} else if (step.getResult().getStatus().equalsIgnoreCase("undefined") ||
				step.getResult().getStatus().equalsIgnoreCase("skipped")) {
			   skipped++;
			   isAnyStepFailedOrSkipped = true;
			   break;
			}

		 }
		 if (!isAnyStepFailedOrSkipped) {
			passed++;
		 }
	  }
	  Map<String, String> statsmap = new HashMap<String, String>();
	  statsmap.put("PASSED", String.valueOf(passed));
	  statsmap.put("FAILED", String.valueOf(failed));
	  statsmap.put("SKIPPED", String.valueOf(skipped));
	  return statsmap;

   }

   @Override
   public List<Feature> getAllResults() {
	  return resultsRepository.findAll();
   }

   @Override
   public Optional<Feature> getResultByBuildNumberAndFeatureId(String buildNumber,
	   String featureID) {
	  return Optional.ofNullable(
		  resultsRepository.findFirstByBuildNumberAndFeatureID(buildNumber, featureID));
   }
}


