package com.vigil.automation.service;

import com.vigil.automation.entity.cucumber.Feature;
import com.vigil.automation.exceptions.ResourceNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ResultsService {

   Feature save(Feature result);

   Feature updateResultByID(Feature result) throws ResourceNotFoundException;

   List<Feature> getAllResults();

   Optional<Feature> getResultByBuildNumberAndFeatureId(String buildNumber,
	   String featureID);

   Feature findResultsById(String resultId) throws ResourceNotFoundException;

   List<String> getAllModuleNamesList();

   List<String> getExecutedBuildsByModuleName(String moduleName);

   List<Feature> getTestResultByModuleNameAndBuildNumber(String moduleName, String buildNumber);

}