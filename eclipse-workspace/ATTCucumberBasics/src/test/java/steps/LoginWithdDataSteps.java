package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithdDataSteps {
	
	@Given("User is at {int} logged in page")
	public void user_is_at_logged_in_page(Integer int1) {
	   System.out.println("User is at server:"+ int1);
	}



	@When("User enters username as {string}")
	public void user_enters_username_as(String Uname) {
		
	  System.out.println("User enter username:"+Uname);
	}

	@When("User provide login password as {string}")
	public void user_provide_login_password_as(String Upassword) {
	   
		System.out.println("User enter password:"+Upassword);
	}

	@When("User click login button")
	public void user_click_login_button() {
	    System.out.println("User has click on login button");
	}

	@Then("User should redirect to application")
	public void user_should_redirect_to_application() {
	    System.out.println("user verified to application page");
	}




}
