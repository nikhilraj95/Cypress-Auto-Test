package pages;

import java.awt.Desktop.Action;
import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver ;
	
	WebDriverWait wait; //explicit wait -this check page element also is it satisfy condition.
	
	@FindBy (xpath = "//*[@id ='nav-cart']")
	WebElement cart_Icon;
	
	@FindBy(xpath = "//*[@class='a-carousel-card']//img[@alt='Unrec']")
	WebElement fitnessCarousel;
	
//	@FindBy(xpath = "//*[@class='a-carousel-card']//img[@alt='op']")
//	WebElement mobile_Carousel_page;
	
	@FindBy(xpath="//* [@cel_widget_id='MAIN-SEARCH_RESULTS-2']")
	WebElement fitness_watch;
	
	
	@FindBy(xpath="//*[@id='nav-link-accountList']")
	WebElement signinHover;
	
	@FindBy(xpath="//*[@id='nav-flyout-ya-signin']/a[@class='nav-action-signin-button']")   
	WebElement signin_Button;
	
	@FindBy(xpath="//*[@id='ap_email']")
	WebElement email;
	
	@FindBy(xpath="//span[@id='continue']")
	WebElement continue_Button;
	
	@FindBy(xpath = "//*[@id='ap_password']")
	WebElement user_Password;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	WebElement final_Sign_in;
	
	public HomePage() {           //Constructor 
		
		wait= new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public String get_Title_Of_Page() {
		
		String title_Of_page = driver.getTitle(); 
		
		return title_Of_page;
	
	}
	
	public boolean is_Cart_Icon_Displayed() {
		
	boolean is_Displayed = cart_Icon.isDisplayed();
		
		return is_Displayed;
	}
	
	public void carousel_Navigation()
	{
		wait.until(ExpectedConditions.visibilityOf(fitnessCarousel));
			
		fitnessCarousel.click();
	}
	
	public boolean fitness_Module() {
		
		wait.until(ExpectedConditions.visibilityOf(fitness_watch));
		
		 boolean is_Display=fitness_watch.isDisplayed();
		 
		return is_Display;
	}
	
	
	public void enter_User_Name(String uname) {
		
		Actions act= new Actions (driver);
		
		act.moveToElement(signinHover).perform();
		
		signin_Button.click();
		
		email.sendKeys(uname);
		
		continue_Button.click();
		}
	
	public void enter_User_Password(String upwd) {
		
		user_Password.sendKeys(upwd);
		
		final_Sign_in.click();
		
		
	}
	
	
}
