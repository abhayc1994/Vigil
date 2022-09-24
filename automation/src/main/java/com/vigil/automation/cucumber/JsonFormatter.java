//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.vigil.automation.cucumber;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.stream.writers.UTF8OutputStreamWriter;
import com.vigil.automation.entitity.cucumber.TestResult;
import io.cucumber.core.exception.ExceptionUtils;
import io.cucumber.messages.types.Background;
import io.cucumber.messages.types.Feature;
import io.cucumber.messages.types.Scenario;
import io.cucumber.messages.types.Step;
import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.Argument;
import io.cucumber.plugin.event.DataTableArgument;
import io.cucumber.plugin.event.DocStringArgument;
import io.cucumber.plugin.event.EmbedEvent;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.HookTestStep;
import io.cucumber.plugin.event.HookType;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.Result;
import io.cucumber.plugin.event.Status;
import io.cucumber.plugin.event.StepArgument;
import io.cucumber.plugin.event.TestCase;
import io.cucumber.plugin.event.TestCaseFinished;
import io.cucumber.plugin.event.TestCaseStarted;
import io.cucumber.plugin.event.TestRunFinished;
import io.cucumber.plugin.event.TestSourceRead;
import io.cucumber.plugin.event.TestStep;
import io.cucumber.plugin.event.TestStepFinished;
import io.cucumber.plugin.event.TestStepStarted;
import io.cucumber.plugin.event.WriteEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class JsonFormatter implements EventListener {

   private static final String before = "before";
   private static final String after = "after";
   private final List<Map<String, Object>> featureMaps = new ArrayList();
   private final Map<String, Object> currentBeforeStepHookList = new HashMap();
   private final Writer writer;
   private final TestSourcesModel testSources = new TestSourcesModel();
   private final ObjectMapper mapper;
   private URI currentFeatureFile;
   private List<Map<String, Object>> currentElementsList;
   private Map<String, Object> currentElementMap;
   private Map<String, Object> currentTestCaseMap;
   private List<Map<String, Object>> currentStepsList;
   private Map<String, Object> currentStepOrHookMap;
   private static final String uri = "http://localhost:8080/results/create";
   ;
   private static final String runID = null;
   private static String buildNumber = "1";


   public JsonFormatter(OutputStream out) {
	  this.writer = new UTF8OutputStreamWriter(out);
	  JsonFactory jsonFactory = new JsonFactory();
	  jsonFactory.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
	  mapper = new ObjectMapper(jsonFactory);
	  mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
   }

   public void setEventPublisher(EventPublisher publisher) {
	  publisher.registerHandlerFor(TestSourceRead.class, this::handleTestSourceRead);
	  publisher.registerHandlerFor(TestCaseStarted.class, this::handleTestCaseStarted);
	  publisher.registerHandlerFor(TestStepStarted.class, this::handleTestStepStarted);
	  publisher.registerHandlerFor(TestStepFinished.class, this::handleTestStepFinished);
	  publisher.registerHandlerFor(WriteEvent.class, this::handleWrite);
	  publisher.registerHandlerFor(EmbedEvent.class, this::handleEmbed);
	  publisher.registerHandlerFor(TestRunFinished.class, this::finishReport);
	  publisher.registerHandlerFor(TestCaseFinished.class, this::finishReportAfterTest);
   }

   private void finishReportAfterTest(TestCaseFinished event) {
	  Throwable exception = event.getResult().getError();
	  if (exception != null) {
		 this.featureMaps.add(this.createDummyFeatureForFailure(event));
	  }
	  List<TestResult> results = updateIDs();
	  results.forEach(result -> {
		 try {
			pushResult(mapper.writeValueAsString(result));
		 } catch (IOException e) {
			throw new RuntimeException(e);
		 }
	  });
   }

   private List<TestResult> updateIDs() {
	  return this.featureMaps.stream().map(fmap -> {
		 TestResult results = mapper.convertValue(fmap, TestResult.class);
		 String hex = generateHex(results.getUri().toString());
		 results.setBuildNumber(buildNumber);
		 results.setBuildId(hex);
		 return results;
	  }).collect(Collectors.toList());

   }

   private String generateHex(String string) {
	  StringBuffer hex = new StringBuffer();
	  for (char temp : string.toCharArray()) {
		 int decimal = (int) temp;
		 hex.append(Integer.toHexString(decimal));
	  }
	  return hex.toString();
   }

   private synchronized void pushResult(String results) throws IOException {
	  HttpClient client = HttpClients.createDefault();
	  HttpPost httpPost = new HttpPost(uri);
	  HttpEntity entity = new StringEntity(results, ContentType.APPLICATION_JSON);
	  httpPost.setEntity(entity);
	  HttpResponse response = client.execute(httpPost);
	  assertThat(response.getStatusLine().getStatusCode(), equalTo(200));
   }

   private void handleTestSourceRead(TestSourceRead event) {
	  this.testSources.addTestSourceReadEvent(event.getUri(), event);
   }

   private void handleTestCaseStarted(TestCaseStarted event) {
	  if (this.currentFeatureFile == null || !this.currentFeatureFile.equals(
		  event.getTestCase().getUri())) {
		 this.currentFeatureFile = event.getTestCase().getUri();
		 Map<String, Object> currentFeatureMap = this.createFeatureMap(event.getTestCase());
		 this.featureMaps.add(currentFeatureMap);
		 this.currentElementsList = (List) currentFeatureMap.get("elements");
	  }
	  this.currentTestCaseMap = this.createTestCase(event);
	  if (this.testSources.hasBackground(this.currentFeatureFile,
		  event.getTestCase().getLocation().getLine())) {
		 this.currentElementMap = this.createBackground(event.getTestCase());
		 this.currentElementsList.add(this.currentElementMap);
	  } else {
		 this.currentElementMap = this.currentTestCaseMap;
	  }
	  this.currentElementsList.add(this.currentTestCaseMap);
	  this.currentStepsList = (List) this.currentElementMap.get("steps");
   }

   private void handleTestStepStarted(TestStepStarted event) {
	  if (event.getTestStep() instanceof PickleStepTestStep) {
		 PickleStepTestStep testStep = (PickleStepTestStep) event.getTestStep();
		 if (this.isFirstStepAfterBackground(testStep)) {
			this.currentElementMap = this.currentTestCaseMap;
			this.currentStepsList = (List) this.currentElementMap.get("steps");
		 }
		 this.currentStepOrHookMap = this.createTestStep(testStep);
		 if (this.currentBeforeStepHookList.containsKey("before")) {
			this.currentStepOrHookMap.put("before", this.currentBeforeStepHookList.get("before"));
			this.currentBeforeStepHookList.clear();
		 }
		 this.currentStepsList.add(this.currentStepOrHookMap);
	  } else {
		 if (!(event.getTestStep() instanceof HookTestStep)) {
			throw new IllegalStateException();
		 }
		 HookTestStep hookTestStep = (HookTestStep) event.getTestStep();
		 this.currentStepOrHookMap = this.createHookStep(hookTestStep);
		 this.addHookStepToTestCaseMap(this.currentStepOrHookMap, hookTestStep.getHookType());
	  }

   }

   private void handleTestStepFinished(TestStepFinished event) {
	  this.currentStepOrHookMap.put("match",
		  this.createMatchMap(event.getTestStep(), event.getResult()));
	  this.currentStepOrHookMap.put("result", this.createResultMap(event.getResult()));
   }

   private void handleWrite(WriteEvent event) {
	  this.addOutputToHookMap(event.getText());
   }

   private void handleEmbed(EmbedEvent event) {
	  this.addEmbeddingToHookMap(event.getData(), event.getMediaType(), event.getName());
   }

   private void finishReport(TestRunFinished event) {
	  try {
		 this.writer.close();
	  } catch (Exception e) {
		 e.printStackTrace();
	  }
   }

   private Map<String, Object> createFeatureMap(TestCase testCase) {
	  Map<String, Object> featureMap = new HashMap();
	  featureMap.put("uri", TestSourcesModel.relativize(testCase.getUri()));
	  featureMap.put("elements", new ArrayList());
	  Feature feature = this.testSources.getFeature(testCase.getUri());
	  if (feature != null) {
		 featureMap.put("keyword", feature.getKeyword());
		 featureMap.put("name", feature.getName());
		 featureMap.put("description",
			 feature.getDescription() != null ? feature.getDescription() : "");
		 featureMap.put("line", feature.getLocation().getLine());
		 featureMap.put("id", TestSourcesModel.convertToId(feature.getName()));
		 featureMap.put("tags", feature.getTags().stream().map((tag) -> {
			Map<String, Object> json = new LinkedHashMap();
			json.put("name", tag.getName());
			json.put("type", "Tag");
			Map<String, Object> location = new LinkedHashMap();
			location.put("line", tag.getLocation().getLine());
			location.put("column", tag.getLocation().getColumn());
			json.put("location", location);
			return json;
		 }).collect(Collectors.toList()));
	  }
	  return featureMap;
   }

   private Map<String, Object> createTestCase(TestCaseStarted event) {
	  Map<String, Object> testCaseMap = new HashMap();
	  testCaseMap.put("start_timestamp", this.getDateTimeFromTimeStamp(event.getInstant()));
	  TestCase testCase = event.getTestCase();
	  testCaseMap.put("name", testCase.getName());
	  testCaseMap.put("line", testCase.getLine());
	  testCaseMap.put("type", "scenario");
	  TestSourcesModel.AstNode astNode = this.testSources.getAstNode(this.currentFeatureFile,
		  testCase.getLine());
	  if (astNode != null) {
		 testCaseMap.put("id", TestSourcesModel.calculateId(astNode));
		 Scenario scenarioDefinition = TestSourcesModel.getScenarioDefinition(astNode);
		 testCaseMap.put("keyword", scenarioDefinition.getKeyword());
		 testCaseMap.put("description",
			 scenarioDefinition.getDescription() != null ? scenarioDefinition.getDescription()
				 : "");
	  }
	  testCaseMap.put("steps", new ArrayList());
	  if (!testCase.getTags().isEmpty()) {
		 List<Map<String, Object>> tagList = new ArrayList();
		 Iterator var6 = testCase.getTags().iterator();
		 while (var6.hasNext()) {
			String tag = (String) var6.next();
			Map<String, Object> tagMap = new HashMap();
			tagMap.put("name", tag);
			tagList.add(tagMap);
		 }
		 testCaseMap.put("tags", tagList);
	  }
	  return testCaseMap;
   }

   private Map<String, Object> createBackground(TestCase testCase) {
	  TestSourcesModel.AstNode astNode = this.testSources.getAstNode(this.currentFeatureFile,
		  testCase.getLocation().getLine());
	  if (astNode != null) {
		 Background background = (Background) TestSourcesModel.getBackgroundForTestCase(astNode)
			 .get();
		 Map<String, Object> testCaseMap = new HashMap();
		 testCaseMap.put("name", background.getName());
		 testCaseMap.put("line", background.getLocation().getLine());
		 testCaseMap.put("type", "background");
		 testCaseMap.put("keyword", background.getKeyword());
		 testCaseMap.put("description",
			 background.getDescription() != null ? background.getDescription() : "");
		 testCaseMap.put("steps", new ArrayList());
		 return testCaseMap;
	  } else {
		 return null;
	  }
   }

   private boolean isFirstStepAfterBackground(PickleStepTestStep testStep) {
	  TestSourcesModel.AstNode astNode = this.testSources.getAstNode(this.currentFeatureFile,
		  testStep.getStepLine());
	  if (astNode == null) {
		 return false;
	  } else {
		 return this.currentElementMap != this.currentTestCaseMap
			 && !TestSourcesModel.isBackgroundStep(astNode);
	  }
   }

   private Map<String, Object> createTestStep(PickleStepTestStep testStep) {
	  Map<String, Object> stepMap = new HashMap();
	  stepMap.put("name", testStep.getStepText());
	  stepMap.put("line", testStep.getStepLine());
	  TestSourcesModel.AstNode astNode = this.testSources.getAstNode(this.currentFeatureFile,
		  testStep.getStepLine());
	  StepArgument argument = testStep.getStepArgument();
	  if (argument != null) {
		 if (argument instanceof DocStringArgument) {
			DocStringArgument docStringArgument = (DocStringArgument) argument;
			stepMap.put("doc_string", this.createDocStringMap(docStringArgument));
		 } else if (argument instanceof DataTableArgument) {
			DataTableArgument dataTableArgument = (DataTableArgument) argument;
			stepMap.put("rows", this.createDataTableList(dataTableArgument));
		 }
	  }
	  if (astNode != null) {
		 Step step = (Step) astNode.node;
		 stepMap.put("keyword", step.getKeyword());
	  }
	  return stepMap;
   }

   private Map<String, Object> createHookStep(HookTestStep hookTestStep) {
	  return new HashMap();
   }

   private void addHookStepToTestCaseMap(Map<String, Object> currentStepOrHookMap,
	   HookType hookType) {
	  String hookName;
	  if (hookType != HookType.AFTER && hookType != HookType.AFTER_STEP) {
		 hookName = "before";
	  } else {
		 hookName = "after";
	  }
	  Map mapToAddTo;
	  switch (hookType) {
		 case BEFORE:
			mapToAddTo = this.currentTestCaseMap;
			break;
		 case AFTER:
			mapToAddTo = this.currentTestCaseMap;
			break;
		 case BEFORE_STEP:
			mapToAddTo = this.currentBeforeStepHookList;
			break;
		 case AFTER_STEP:
			mapToAddTo = (Map) this.currentStepsList.get(this.currentStepsList.size() - 1);
			break;
		 default:
			mapToAddTo = this.currentTestCaseMap;
	  }
	  if (!mapToAddTo.containsKey(hookName)) {
		 mapToAddTo.put(hookName, new ArrayList());
	  }
	  ((List) mapToAddTo.get(hookName)).add(currentStepOrHookMap);
   }

   private Map<String, Object> createMatchMap(TestStep step, Result result) {
	  Map<String, Object> matchMap = new HashMap();
	  if (step instanceof PickleStepTestStep) {
		 PickleStepTestStep testStep = (PickleStepTestStep) step;
		 if (!testStep.getDefinitionArgument().isEmpty()) {
			List<Map<String, Object>> argumentList = new ArrayList();
			HashMap argumentMap;
			for (Iterator var6 = testStep.getDefinitionArgument().iterator(); var6.hasNext();
				argumentList.add(argumentMap)) {
			   Argument argument = (Argument) var6.next();
			   argumentMap = new HashMap();
			   if (argument.getValue() != null) {
				  argumentMap.put("val", argument.getValue());
				  argumentMap.put("offset", argument.getStart());
			   }
			}
			matchMap.put("arguments", argumentList);
		 }
	  }
	  if (!result.getStatus().is(Status.UNDEFINED)) {
		 matchMap.put("location", step.getCodeLocation());
	  }
	  return matchMap;
   }

   private Map<String, Object> createResultMap(Result result) {
	  Map<String, Object> resultMap = new HashMap();
	  resultMap.put("status", result.getStatus().name().toLowerCase(Locale.ROOT));
	  if (result.getError() != null) {
		 resultMap.put("error_message", ExceptionUtils.printStackTrace(result.getError()));
	  }
	  if (!result.getDuration().isZero()) {
		 resultMap.put("duration", result.getDuration().toNanos());
	  }
	  return resultMap;
   }

   private void addOutputToHookMap(String text) {
	  if (!this.currentStepOrHookMap.containsKey("output")) {
		 this.currentStepOrHookMap.put("output", new ArrayList());
	  }
	  ((List) this.currentStepOrHookMap.get("output")).add(text);
   }

   private void addEmbeddingToHookMap(byte[] data, String mediaType, String name) {
	  if (!this.currentStepOrHookMap.containsKey("embeddings")) {
		 this.currentStepOrHookMap.put("embeddings", new ArrayList());
	  }
	  Map<String, Object> embedMap = this.createEmbeddingMap(data, mediaType, name);
	  ((List) this.currentStepOrHookMap.get("embeddings")).add(embedMap);
   }

   private Map<String, Object> createDummyFeatureForFailure(TestCaseFinished event) {
	  Throwable exception = event.getResult().getError();
	  Map<String, Object> feature = new LinkedHashMap();
	  feature.put("line", 1);
	  Map<String, Object> scenario = new LinkedHashMap();
	  feature.put("elements", Collections.singletonList(scenario));
	  scenario.put("start_timestamp", this.getDateTimeFromTimeStamp(event.getInstant()));
	  scenario.put("line", 2);
	  scenario.put("name", "Failure while executing Cucumber");
	  scenario.put("description", "");
	  scenario.put("id", "failure;failure-while-executing-cucumber");
	  scenario.put("type", "scenario");
	  scenario.put("keyword", "Scenario");
	  Map<String, Object> when = new LinkedHashMap();
	  Map<String, Object> then = new LinkedHashMap();
	  scenario.put("steps", Arrays.asList(when, then));
	  Map<String, Object> whenMatch = new LinkedHashMap();
	  when.put("result", whenMatch);
	  whenMatch.put("duration", 0);
	  whenMatch.put("status", "passed");
	  when.put("line", 3);
	  when.put("name", "Cucumber failed while executing");
	  whenMatch = new LinkedHashMap();
	  when.put("match", whenMatch);
	  whenMatch.put("arguments", new ArrayList());
	  whenMatch.put("location", "io.cucumber.core.Failure.failure_while_executing_cucumber()");
	  when.put("keyword", "When ");
	  Map<String, Object> thenMatch = new LinkedHashMap();
	  then.put("result", thenMatch);
	  thenMatch.put("duration", 0);
	  thenMatch.put("error_message", ExceptionUtils.printStackTrace(exception));
	  thenMatch.put("status", "failed");
	  then.put("line", 4);
	  then.put("name", "Cucumber will report this error:");
	  thenMatch = new LinkedHashMap();
	  then.put("match", thenMatch);
	  thenMatch.put("arguments", new ArrayList());
	  thenMatch.put("location", "io.cucumber.core.Failure.cucumber_reports_this_error()");
	  then.put("keyword", "Then ");
	  feature.put("name", "Test run failed");
	  feature.put("description", "There were errors during the execution");
	  feature.put("id", "failure");
	  feature.put("keyword", "Feature");
	  feature.put("uri", "classpath:io/cucumber/core/failure.feature");
	  feature.put("tags", new ArrayList());
	  return feature;
   }

   private String getDateTimeFromTimeStamp(Instant instant) {
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
		  .withZone(ZoneOffset.UTC);
	  return formatter.format(instant);
   }

   private Map<String, Object> createDocStringMap(DocStringArgument docString) {
	  Map<String, Object> docStringMap = new HashMap();
	  docStringMap.put("value", docString.getContent());
	  docStringMap.put("line", docString.getLine());
	  docStringMap.put("content_type", docString.getMediaType());
	  return docStringMap;
   }

   private List<Map<String, List<String>>> createDataTableList(DataTableArgument argument) {
	  List<Map<String, List<String>>> rowList = new ArrayList();
	  Iterator var3 = argument.cells().iterator();
	  while (var3.hasNext()) {
		 List<String> row = (List) var3.next();
		 Map<String, List<String>> rowMap = new HashMap();
		 rowMap.put("cells", new ArrayList(row));
		 rowList.add(rowMap);
	  }
	  return rowList;
   }

   private Map<String, Object> createEmbeddingMap(byte[] data, String mediaType, String name) {
	  Map<String, Object> embedMap = new HashMap();
	  embedMap.put("mime_type", mediaType);
	  embedMap.put("data", Base64.getEncoder().encodeToString(data));
	  if (name != null) {
		 embedMap.put("name", name);
	  }
	  return embedMap;
   }
}
