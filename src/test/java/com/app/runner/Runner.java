package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Hari\\eclipse-workspace-latestnew\\Flipkart\\src\\test\\resources", 
glue="com.app.stepdefinition", dryRun=false,publish=true)
public class Runner {

}
