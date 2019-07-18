package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/eruku/git/FreeCRMTest/FreeCRMBDDFramework/src/main/java/Features/Login.feature" ,glue= {"stepDefinitions"}
              //format= {"pretty","html:test-output"}     
		)


 public class TestRunner {
	
	


 }
