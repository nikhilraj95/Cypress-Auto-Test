package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\RegistrationApp.feature"},
		glue = {"steps"},
		//plugin = {"pretty"},
		publish = true
		
		)




public class RegistationRunner extends AbstractTestNGCucumberTests{

}
