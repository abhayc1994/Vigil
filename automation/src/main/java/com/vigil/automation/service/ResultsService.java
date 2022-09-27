package com.vigil.automation.service;

import com.vigil.automation.entity.cucumber.TestResult;
import com.vigil.automation.exceptions.ResourceNotFoundException;
import java.util.List;
import java.util.Optional;

public interface ResultsService {

   TestResult save(TestResult result);

   TestResult updateResultByID(TestResult result) throws ResourceNotFoundException;

   List<TestResult> getAllResults();

   Optional<TestResult> getResultByBuildNumberAndFeatureId(String buildNumber,
       String featureID);

   TestResult findResultsById(String resultId) throws ResourceNotFoundException;

   List<String> getAllModuleNamesList();
   List<String> getExecutedBuildsByModuleName(String moduleName);
}