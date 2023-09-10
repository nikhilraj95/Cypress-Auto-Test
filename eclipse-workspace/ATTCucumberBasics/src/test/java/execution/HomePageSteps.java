package execution;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverconfig.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	
	HomePage homepage =new HomePage (DriverFactory.getDriver());
	
	//HomePage homepage =new HomePage (DriverFactory2.getDriver());  for parallel execution on web browser
	
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
	    WebDriver driver=DriverFactory.getDriver();   //calling method classname.methodname (getDriver)
	  
	    //WebDriver driver=DriverFactory2.getDriver();   // for parallel execution on web browser
	    
	    driver.get("https://www.amazon.in/");
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String Word) {
	   String title= homepage.get_Title_Of_Page();
	   boolean is_Word_present = title.contains(Word);
	   Assert.assertTrue(is_Word_present);
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	    boolean is_Display = homepage.is_Cart_Icon_Displayed();
	    Assert.assertTrue(is_Display);
	}

	@When("user clicks on fashion link")
	public void user_clicks_on_fashion_link() {
		 homepage.carousel_Navigation();
	}

	@Then("user should redirect  to fashion page")
	public void user_should_redirect_to_fashion_page() {
	  boolean is_Displayed = homepage.fitness_Module();
	  
	  Assert.assertTrue(is_Displayed);
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String Uname) {
	   homepage.enter_User_Name(Uname);	
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String upwd) {
	    homepage.enter_User_Password(upwd);
	}


}
