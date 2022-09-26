package com.vigil.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
	features = "src/test/resources/",
	plugin = {
		"com.vigil.automation.plugin.cucumber.JsonBuilder:target/cucumber-reports/Cucumber.json"}
)
@RunWith(Cucumber.class)
public class VigilRunner {

}
