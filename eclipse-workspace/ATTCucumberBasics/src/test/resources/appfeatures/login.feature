Feature: Login functionality 
Scenario: Login to the application
Given User is at login page
When User enters username
And User provide login credentials
And User clicks login button
Then User should redirect to homepage 


Scenario: Verify title
Given User is at login page
Then Page should get displayed