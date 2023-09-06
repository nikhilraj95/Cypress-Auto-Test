package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"src\\test\\resources\\appfeatures\\login.feature"},   //feature file path 
		
		glue = {"steps"}   //[package name where we have glue code 
		
	//	dryRun = true
		)



public class LoginRunner extends AbstractTestNGCucumberTests{

	
	
	
	
	
	
}
