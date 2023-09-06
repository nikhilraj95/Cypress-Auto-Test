Feature: Sign Up Functionality

Scenario Outline: Sign up to application with multiple data 
Given User is at sign up page
When User enter name "<name>" in the form
And User enter the age <age>
And User confirms the gender as "<gender>"
Then User will get create in application

Examples:
| name | age | gender |
| Rohit | 25 | Male |
| Ritu | 26 | Female |
| Raj | 30 | Male |
