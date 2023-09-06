package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given ("User is at login page")
	public void preCondition() {
		
	System.out.println("Precondition got executed");
		
	}
	
	@When("User enters username")
	public void enterUsername() 
	{		System.out.println("User enter username");
		
}
	
	@When("User provide login credentials")
	public void enterPassword() {
		
		System.out.println("User enter password");
	}

	
	@When("User clicks login button")
	public void clickingOnLoginButton() 
	{
		
		System.out.println("click on login button");
	}
	
	@Then("User should redirect to homepage")
	
	public void loginHomePage()
	{
		System.out.println("redirected to homepage");
	}
	
	@Then ("Page should get displayed")
	public void titleDisplay() {
		
		System.out.println("Title is displayed");
	}
	
	
}



