package com.canavarro.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"com.canavarro.stepDefinitions","com.canavarro.hooks"},
    snippets = CucumberOptions.SnippetType.CAMELCASE
    )
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
