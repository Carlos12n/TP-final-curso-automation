package com.canavarro.opencart.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"com.canavarro.opencart.stepDefinitions","com.canavarro.opencart.hooks"},
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    tags = "@FAV-123"
    )
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
