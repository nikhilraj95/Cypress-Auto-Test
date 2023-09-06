
## Feature file with multiple test data in scenario using "DataTable"

Feature: Registration Functionality  
##Background:
##Given User should obe at account opening page
##Scenario Outline: Sign up to application with multiple data 
Scenario: Registration with dependant
Given User should be at account opening page
When User enters the Infomation
 | Firstname | Lastname | Email | Mobile no |
| Roni | kumar| roni@gmail.com | 909090909098 |
| Raman | Kapoor | ramanu@gmail.com | 9604387766 |
| Ravi | Shetty | ravi@gmail.com | 9604354433 |

And User click submit buttion
Then User will get new account registration create
