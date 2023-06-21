package runner;

import java.io.*;
import org.junit.runner.RunWith;

import org.junit.AfterClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Users/kataria99/Desktop/QA/CucumberWorkspace/PracticeTestAutomationBDD/src/main/java/features"
		},
		glue= "stepDefinitions",
	    stepNotifications = true,
		plugin= {"pretty","html:target/reports.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		dryRun = false
		)


public class TestRunner {



}
