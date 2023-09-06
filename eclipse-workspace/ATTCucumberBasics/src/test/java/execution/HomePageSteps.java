package execution;

import org.openqa.selenium.WebDriver;

import driverconfig.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
	    WebDriver driver=DriverFactory.getDriver();   //calling method classname.methodname (getDriver)
	  
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String string) {
	    
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	    
	}

	@When("user clicks on fashion link")
	public void user_clicks_on_fashion_link() {
	    
	}

	@Then("user should redirect  to fashion page")
	public void user_should_redirect_to_fashion_page() {
	   
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String string) {
	   
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
	    
	}


}
