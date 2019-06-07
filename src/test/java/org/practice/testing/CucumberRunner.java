package org.practice.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features"},
        //glue = {"stepdefinitionproject"},
        //glue = {"src/test/java/org/practice/testing/stepdefinitionproject"}
        format = {"pretty",
                "html:build/cucumber",
                "json:build/cucumber/cucumber.json",
                "junit:build/test-report.xml"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests{
}

