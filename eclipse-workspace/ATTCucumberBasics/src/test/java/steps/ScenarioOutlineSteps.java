package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {

	@Given("User is at sign up page")
	public void user_is_at_sign_up_page() {
	   System.out.println("User is logged in the page");
	  
	}

	@When("User enter name {string} in the form")
	public void user_enter_name_in_the_form(String Uname) {
	   System.out.println("User enter the name:"+Uname);
	}

	@When("User enter the age {int}")
	public void user_enter_the_age(Integer int1) {
	   System.out.println("User enter the age:"+ int1);
	}

	@When("User confirms the gender as {string}")
	public void user_confirms_the_gender_as(String gender) {
	  System.out.println("User enter is gender:"+gender);
	}

	@Then("User will get create in application")
	public void user_will_get_create_in_application() {
	   System.out.println("User new account get create in application");
	}


	
}
