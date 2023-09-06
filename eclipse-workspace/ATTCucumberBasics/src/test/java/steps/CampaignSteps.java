package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignSteps {

	@Given("user is at the campaigns page")
	public void user_is_at_the_campaigns_page() {
	   
		System.out.println("User is at campaign home page");
	}

	@When("user click on create campaign button")
	public void user_click_on_create_campaign_button() {
	    
		System.out.println("User click on create new campaign");
	}

	@When("user enters information")
	public void user_enters_information() {
	    System.out.println("User enter info");
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
	    System.out.println("User click the saved");
	}

	@Then("Campaign should get created")
	public void campaign_should_get_created() {
	    System.out.println("Campaign just get created");
	}

	@When("user click on edit campaign")
	public void user_click_on_edit_campaign() {
	    System.out.println("User click on edit campaign bbutton");
	}

	@When("user enters the schedule")
	public void user_enters_the_schedule() {
 	    System.out.println("User enter the schedule on page");
	}

	@Then("Campaign should get schedule")
	public void campaign_should_get_schedule() {
		System.out.println("campaign is get schedule on page");
	    
	}

	@When("user click on send campaign")
	public void user_click_on_send_campaign() {
	    System.out.println("User click on send campaign from page");
	}

	@Then("Campaign should get sent")
	public void campaign_should_get_sent() {
	    System.out.println("Campaign get sent succesfully");
	}

	
}
