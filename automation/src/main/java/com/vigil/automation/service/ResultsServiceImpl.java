package com.vigil.automation.service;

import com.mongodb.client.DistinctIterable;
import com.mongodb.client.MongoCursor;
import com.vigil.automation.entity.cucumber.TestResult;
import com.vigil.automation.exceptions.ResourceNotFoundException;
import com.vigil.automation.repositories.TestResultsRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
   public TestResult save(TestResult result) {
	  Optional<TestResult> optionalTestResult = getResultByBuildNumberAndFeatureId(
		  result.getBuildNumber(),
		  result.getFeatureID());
	  if (optionalTestResult.isPresent()) {
		 TestResult existingResult = optionalTestResult.get();
		 result.setObjectID(existingResult.getObjectID());
	  }
	  return resultsRepository.save(result);
   }

   @Override
   public TestResult updateResultByID(TestResult result) throws ResourceNotFoundException {
	  Optional<TestResult> existingTestResult = this.resultsRepository.findById(result.getId());
	  if (existingTestResult.isPresent()) {
		 TestResult productUpdate = existingTestResult.get();
		 productUpdate.setId(result.getId());
		 return productUpdate;
	  } else {
		 throw new ResourceNotFoundException("Record not found with id : " + result.getId());
	  }
   }

   public TestResult findResultsById(String resultId) throws ResourceNotFoundException {
	  Optional<TestResult> resultOptional = resultsRepository.findById(resultId);
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
   public List<String> getExecutedBuildsByModuleName(String moduleName) {
	  List<TestResult> results = resultsRepository.findResultsByModuleName(moduleName);
	  return results.stream().map(TestResult::getBuildNumber)
		  .collect(Collectors.toList()).stream().distinct().collect(Collectors.toList());
   }

   @Override
   public List<TestResult> getAllResults() {
	  return resultsRepository.findAll();
   }

   @Override
   public Optional<TestResult> getResultByBuildNumberAndFeatureId(String buildNumber,
	   String featureID) {
	  return Optional.ofNullable(
		  resultsRepository.findFirstByBuildNumberAndFeatureID(buildNumber, featureID));
   }
}
