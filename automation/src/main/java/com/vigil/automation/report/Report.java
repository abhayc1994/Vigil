package com.vigil.automation.report;

import com.vigil.automation.entity.cucumber.Feature;
import com.vigil.automation.report.dto.Example;
import com.vigil.automation.report.dto.Row;
import com.vigil.automation.report.dto.Scenario;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class Report {

   private List<com.vigil.automation.report.dto.Feature> features = new ArrayList<>();
   private List<String> errors = new ArrayList<>();
   private Duration duration = Duration.ofNanos(0);

   /**
	* Build consolidated list of features from given cucumber json reports
	*
	* @param cucumberJsonReports list of json files or directory containing json files or json file
	*                            urls or json strings or json objects
	*/
   public void buildReport(List<Feature> results) {


	  Map<String, com.vigil.automation.report.dto.Feature> featuresMap = new HashMap<>();
	  for (com.vigil.automation.report.dto.Feature feature : features) {
		 if (featuresMap.get(feature.getId()) == null) {
			featuresMap.put(feature.getId(), feature);
		 } else {
			featuresMap.get(feature.getId()).getScenarios().addAll(feature.getScenarios());
		 }
	  }
	  features = new ArrayList<>(featuresMap.values());
	  for (com.vigil.automation.report.dto.Feature feature : features) {
		 Map<String, Scenario> scenariosMap = new HashMap<>();
		 List<Row> examples = new ArrayList<>();
		 for (Scenario scenario : feature.getScenarios()) {
			if (scenario.getExamples() != null) {
			   for (Example e : scenario.getExamples()) {
				  examples.addAll(e.getRows());
			   }
			   continue;
			}
			if ((scenariosMap.get(scenario.getId()) == null || scenario.getStatus()
				.equals("passed"))) {
			   if (scenario.getKeyword().equals("Scenario Outline")) {
				  examples.stream().filter(e -> e.getId().equals(scenario.getId())).findFirst()
					  .ifPresent(
						  row -> scenario.setName(scenario.getName() + " " + row.getCells()));
			   }
			   String error = scenario.getError();
			   if (error != null && !errors.contains(error)) {
				  errors.add(error);
			   }
			   scenariosMap.put(scenario.getId(), scenario);
			}
		 }
		 feature.setScenarios(new ArrayList<>((scenariosMap.values())));
		 duration = duration.plus(feature.getDuration());
	  }
   }

   /**
	* Try to decode the given string to "UTF-8"
	*
	* @param json string for decoding
	* @return decode string if successful else original string
	*/
   private String decode(String json) {
	  CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
	  decoder.onMalformedInput(CodingErrorAction.REPLACE);
	  decoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
	  ByteBuffer data = ByteBuffer.wrap(json.getBytes());
	  try {
		 return decoder.decode(data).toString();
	  } catch (CharacterCodingException e) {
		 System.out.println("Error:: While decoding JSON report");
		 e.printStackTrace();
		 return json;
	  }
   }


   /**
	* Returns list of feature for building report
	*
	* @return List of feature
	*/
   public List<com.vigil.automation.report.dto.Feature> getFeatures() {
	  return features;
   }

   /**
	* Returns list of error for building report
	*
	* @return List of errors
	*/
   public List<String> getErrors() {
	  return errors;
   }

   /**
	* Returns total execution duration
	*
	* @return Duration of execution
	*/
   public Duration getDuration() {
	  return duration;
   }

   /**
	* Returns total execution duration string
	*
	* @param duration total execution duration
	* @return Duration of execution as string
	*/
   public String getDurationString(Duration duration) {
	  return duration.withNanos(0).toString().substring(2);
   }
}