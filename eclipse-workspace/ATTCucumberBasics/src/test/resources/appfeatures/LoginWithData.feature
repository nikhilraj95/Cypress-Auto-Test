Feature: Login functionality with data
Scenario: Login to the application with data
Given User is at 1 logged in page 
When User enters username as "testuser"
And User provide login password as "test@1234"
And User click login button
Then User should redirect to application  