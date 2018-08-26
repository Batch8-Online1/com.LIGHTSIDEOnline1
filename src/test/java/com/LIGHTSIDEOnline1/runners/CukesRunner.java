package com.LIGHTSIDEOnline1.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
		
		},
				
		tags="@retemp",
		features= {"src/test/resources/com.LIGHTSIDEOnline1/features",
		"src/test/resources/com.Db/features"},
		glue= {"com.LIGHTSIDEOnline1/step_definitions",
				"com.db/step_def"}
		//,dryRun = true
		)
public class CukesRunner {}
