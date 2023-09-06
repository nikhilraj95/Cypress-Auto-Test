package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
	
	@Given("User should be logged into the application")
	public void user_should_be_logged_into_the_application() {
	   
		System.out.println("User should be logged in app");
	}

	@When("User Click on order link")
	public void user_click_on_order_link() {
		System.out.println("User should be click on order link");  
	}

	@Then("User redirects to the order page")
	public void user_redirects_to_the_order_page() {
		System.out.println("User should redirect to order page");
	}

	@When("User click on currently placed order")
	public void user_click_on_currently_placed_order() {
	   System.out.println("User should click currently placed order");
	}

	@Then("User should see the current order information")
	public void user_should_see_the_current_order_information() {
	   System.out.println("User should get current order information");
	}

	@When("User click on past placed order")
	public void user_click_on_past_placed_order() {
		System.out.println("User should click past placed order");
	}

	@Then("User should see the Past order information")
	public void user_should_see_the_past_order_information() {
		 System.out.println("User should get past order information");
	}

	@When("User click on cancel placed order")
	public void user_click_on_cancel_placed_order() {
		System.out.println("User should click cancel placed order");
	}

	@Then("User should see the cancelled order information")
	public void user_should_see_the_cancelled_order_information() {
		 System.out.println("User should get cancel order information");
	}


	

}
