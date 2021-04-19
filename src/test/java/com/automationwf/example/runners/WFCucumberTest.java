package com.automationwf.example.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "junit:target/cucumber.xml"},
        features = "src/test/resources/com/automationWF/example/features",
        glue = {"com.automationwf.example.stepdefs"})
public class WFCucumberTest {
}
