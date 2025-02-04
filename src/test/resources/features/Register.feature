@TestExecution
Feature: Testing Register feature in dsAlgo portal

@positiveflow
Scenario: The user will land on the register page
Given Users can open the register page
When When user click register tab
Then Then user will land to register page

@negativeflow
Scenario Outline: User will get alert to fill password
Given The user is in the Registration page
When The user clicks Register button after entering Username from sheet <Rownumber> with other fields empty
Then then user will be display an error Please fill out this field below Password textbox
Examples:
|Rownumber|
|4|

@negativeflow
Scenario Outline: User will get alert to confirm password
Given The user is in the Registration page
When The user clicks Register button after entering Username and password from sheet <Rownumber> with Password Confirmation field empty
Then then user will be display an error Please fill out this field below Password Confirmation textbox
Examples:
|Rownumber|
|5|

@negativeflow
Scenario Outline: User will get alert to enter valid username
Given The user is in the Registration page
When The user enters a name  from sheet <Rownumber> with invalid characters other than Letters digits
Then Then user will be display an error message Please enter a valid username
Examples:
|Rownumber|
|6|

@negativeflow
Scenario Outline: User have type same password
Given The user is in the Registration page
When The user clicks Register button after entering different passwords for Password and Password confirmation fields using <Rownumber> from sheet
Then Then the user will display an error message password_mismatch The two password fields did not match
Examples:
|Rownumber|
|7|

@negativeflow
Scenario Outline: User have meet the criteria of password
Given The user is in the Registration page
When The user enters a Password with characters less than 8 from sheet <Rownumber> 
Then then the user will be displayed an error message Password should contain at least eight characters
Examples:
|Rownumber|
|8|

@positiveflow
Scenario Outline: Users have logged in and are redirected to the home page
Given The user is in the Registration page
When The user opens Register Page using credentials from <Rownumber> 
Then The user should be redirected to Homepage with the message New Account Created. You are logged in as username from <Rownumber>
Examples:
|Rownumber|
|9|