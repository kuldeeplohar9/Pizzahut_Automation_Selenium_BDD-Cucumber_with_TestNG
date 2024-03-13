package com.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources" }, glue = { "com.StepDef" },

		dryRun = false, monochrome = true, tags = "@ValidatePizzahutpizza", plugin = { "pretty",
				"html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json" })

public class Runner_Pizzahut extends AbstractTestNGCucumberTests {

}
