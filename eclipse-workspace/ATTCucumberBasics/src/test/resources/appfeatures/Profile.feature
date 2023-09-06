## Hooks concept 

Feature: Profile Functionality
Scenario: Create Profile
Given User is at home page
When User clicks on add profile button
And  User enter the information
Then User profile gets created

Scenario: Update Profile
Given User is at home page
When User clicks on edit profile button
And  User Updates the information
Then User profile gets Updated


Scenario: Delete Profile
Given User is at home page
When User clicks on delete profile button
Then User profile gets deleted
