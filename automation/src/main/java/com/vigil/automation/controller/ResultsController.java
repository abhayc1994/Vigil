package com.vigil.automation.controller;

import com.vigil.automation.entity.cucumber.Feature;
import com.vigil.automation.exceptions.ResourceNotFoundException;
import com.vigil.automation.service.ResultsService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/results")
public class ResultsController {

   private Logger logger =
	   LoggerFactory.getLogger(ResultsController.class);
   @Autowired
   ResultsService service;

   @GetMapping(value = "/")
   public List<Feature> getAllResults() {
	  logger.info("Getting all results.");
	  return service.getAllResults();
   }

   @GetMapping(value = "/{resultId}")
   public Feature getResultById(@PathVariable String resultId) throws ResourceNotFoundException {
	  logger.info("Getting result with ID: {}", resultId);
	  return service.findResultsById(resultId);
   }

   @PostMapping(value = "/create")
   public Feature addResult(@RequestBody Feature result) {
	  logger.info("Saving result.");
	  return service.save(result);
   }

   @GetMapping(value = "/getAllModuleList")
   public List<String> getAllModuleList() {
	  logger.info("Getting List of All Modules");
	  return service.getAllModuleNamesList();
   }

   @GetMapping(value = "/getExecutedBuildsByModuleName")
   public List<String> getExecutedBuildsByModuleName(@RequestParam String moduleName) {
	  logger.info("Getting Executed Builds For Module {}", moduleName);
	  return service.getExecutedBuildsByModuleName(moduleName);
   }

   @GetMapping(value = "/getTestResultByModuleNameAndBuildNumber")
   public List<Feature> getTestResultByModuleNameAndBuildNumber(@RequestParam String moduleName,
	   @RequestParam String buildNumber
   ) {
	  logger.info("Getting Test Results For Module: {} Build : {}", moduleName,buildNumber);
	  return service.getTestResultByModuleNameAndBuildNumber(moduleName,buildNumber);
   }
}
