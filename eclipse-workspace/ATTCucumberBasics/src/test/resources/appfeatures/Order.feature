Feature: Order information
Background:
Given User should be logged into the application
When User Click on order link
Then User redirects to the order page  	

Scenario: Fetching currently placed order 	 
When User click on currently placed order
Then User should see the current order information

Scenario: Fetching past placed order
When User click on past placed order
Then User should see the Past order information 

Scenario: Fetching cancelled placed order
When User click on cancel placed order
Then User should see the cancelled order information 
  