package com.vigil.automation.repositories;

import com.vigil.automation.entity.cucumber.TestResult;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestResultsRepository extends MongoRepository<TestResult, String> {

   TestResult findResultsById(String id);

   TestResult findFirstByBuildNumberAndFeatureID(String buildNumber,String featureID);
}

