package com.vigil.automation.controller;

import com.vigil.automation.entitity.cucumber.TestResult;
import com.vigil.automation.repositories.TestResultsRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/results")
public class ResultsController {

   private Logger logger =
	   LoggerFactory.getLogger(ResultsController.class);
   @Autowired
   private TestResultsRepository resultsRepository;

   @GetMapping(value = "/")
   public List<TestResult> getAllResults() {
	  logger.info("Getting all results.");
	  return resultsRepository.findAll();
   }

   @GetMapping(value = "/{resultId}")
   public TestResult getResultById(@PathVariable String resultId) {
	  logger.info("Getting result with ID: {}", resultId);
	  return resultsRepository.findResultsById(resultId);
   }

   @PostMapping(value = "/create")
   public TestResult addResult(@RequestBody TestResult result) {
	  logger.info("Saving result.");
	  return resultsRepository.save(result);
   }

   @PutMapping(value = "/update/{resultId}")
   public TestResult updateResult(@PathVariable String resultId, @RequestBody TestResult result) {
	  logger.info("Updating result with ID: {}", resultId);
	  return resultsRepository.save(result);
   }

   @DeleteMapping(value = "/delete/{resultId}")
   public void deleteResult(@PathVariable String resultId) {
	  logger.info("Deleting result with ID: {}", resultId);
	  resultsRepository.deleteById(resultId);
   }
}
