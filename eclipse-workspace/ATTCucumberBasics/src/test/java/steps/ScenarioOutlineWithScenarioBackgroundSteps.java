package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineWithScenarioBackgroundSteps {
	

@Given("User is at sign up paged")
public void user_is_at_sign_up_paged() {
   System.out.println("User is at login page");
}

@When("User enterd name {string} in the form")
public void user_enterd_name_in_the_form(String name) {
    System.out.println("User enter user name:"+name);
}

@When("User enterd the age {int}")
public void user_enterd_the_age(Integer int1) {
   System.out.println("User enter's age:"+int1); 
}

@When("User confirmed the gender as {string}")
public void user_confirmed_the_gender_as(String string) {
    System.out.println("User confirmed the gender:"+string);
}

@Then("User will get new account create in application")
public void user_will_get_new_account_create_in_application() {
   System.out.println("User gets new account created");
}
	
	
}
