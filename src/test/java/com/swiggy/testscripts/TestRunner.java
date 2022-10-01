package com.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature", 
glue = {"com.swiggy.testscripts"},
monochrome = true,
dryRun = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
