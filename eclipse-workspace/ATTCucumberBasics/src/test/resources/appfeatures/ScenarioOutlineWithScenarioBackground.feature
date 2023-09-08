Feature: Sign Up Login Functionality
Background:
Given User is at sign up paged

Scenario Outline: Sign up to application with multiple data 
##Given User is at sign up page
When User enterd name "<name>" in the form
And User enterd the age <age>
And User confirmed the gender as "<gender>"
Then User will get new account create in application

Examples:
| name | age | gender |
| Raju | 25 | Male |
| Ritu | 26 | Female |
| Raj | 30 | Male |

## we can add a simple scenario also here it will also can get execute in this feature file 




