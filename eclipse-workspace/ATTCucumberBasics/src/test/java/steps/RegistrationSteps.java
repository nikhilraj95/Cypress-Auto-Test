package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {

	@Given("User should be at account opening page")
	public void user_should_be_at_account_opening_page() {
	   System.out.println("User is at account opening page");
	}

	@When("User enters the Infomation")
	public void user_enters_the_infomation(DataTable datatable) {
	   List<List<String>> data =  datatable.asLists();
	   
	   List<String> firstlist1= data.get(0);
	   
	   System.out.println(firstlist1);    //complete print of 1st list of 0th index
	   
	   String emailvalue = firstlist1.get(2);
	    
	   System.out.println(emailvalue);  //printing the email
	   
	   String  Firstname=data.get(2).get(0);  //getting 2nd list and 0th index
	   
	   //String  Lastname=firstlist1.get(1);
	 
	  // System.out.println(Lastname);
	
	   System.out.println(Firstname);
	   
	   //Reading the data-table with Map  here column need to be define in feature file 
	
	   	List<Map<String, String>> data1 =datatable.asMaps();	
	  
	  String lastname=data1.get(0).get("Lastname");
	  
	  System.out.println("Last name of values:"+lastname);
	  
	}   

	@When("User click submit buttion")
	public void user_click_submit_buttion() {
	    System.out.println("User clicking on submit button");
	}

	@Then("User will get new account registration create")
	public void user_will_get_new_account_registration_create() {
	    System.out.println("User will have new registraion get created");
	}


	
	
	
	
	
	
}
