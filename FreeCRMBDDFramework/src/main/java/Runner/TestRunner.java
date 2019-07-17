package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Selenium/Projects/FreeCRMBDDFramework/src/main/java/Features/Login.feature" ,glue= {"stepDefinition"}
              //format= {"pretty","html:test-output"}     
		)


 public class TestRunner {
	
	


 }
