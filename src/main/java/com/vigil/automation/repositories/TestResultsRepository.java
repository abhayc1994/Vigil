package com.vigil.automation.repositories;

import com.vigil.automation.entity.cucumber.Feature;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestResultsRepository extends MongoRepository<Feature, String> {

   Feature findResultsById(String id);

   Feature findFirstByBuildNumberAndFeatureID(String buildNumber, String featureID);

   List<Feature> findResultsByModuleName(String moduleName);

   List<Feature> findResultsByBuildNumber(String moduleName);
   List<Feature> findResultsByModuleNameAndBuildNumber(String moduleName ,String buildNumber);
}

