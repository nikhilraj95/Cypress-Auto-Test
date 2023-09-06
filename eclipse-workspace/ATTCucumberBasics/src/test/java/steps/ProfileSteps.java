package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	@Given("User is at home page")
	public void user_is_at_home_page() {
	   System.out.println("User is at home page");
	}

	@When("User clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
	    System.out.println("User click on profile create button");
	}

	@When("User enter the information")
	public void user_enter_the_information() {
	    System.out.println("User enter the information");
	}

	@Then("User profile gets created")
	public void user_profile_gets_created() {
	    System.out.println("Profile gets generated..!");
	}

	@When("User clicks on edit profile button")
	public void user_clicks_on_edit_profile_button() {
	    System.out.println("User clicks edit button");
	}

	@When("User Updates the information")
	public void user_updates_the_information() {
	    System.out.println("User updates the info");
	}

	@Then("User profile gets Updated")
	public void user_profile_gets_updated() {
	    System.out.println("profile gets updated..!");
	}

	@When("User clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() {
	    System.out.println("User click delete button");
	}

	@Then("User profile gets deleted")
	public void user_profile_gets_deleted() {
	    System.out.println("Profile gets deleted..!");
	}


}
