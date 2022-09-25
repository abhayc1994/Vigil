package com.vigil.automation.service;

import com.vigil.automation.entity.cucumber.TestResult;
import com.vigil.automation.exceptions.ResourceNotFoundException;
import com.vigil.automation.repositories.TestResultsRepository;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultsServiceImpl implements ResultsService {

   private Logger logger =
	   LoggerFactory.getLogger(ResultsService.class);
   @Autowired
   private TestResultsRepository resultsRepository;

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
