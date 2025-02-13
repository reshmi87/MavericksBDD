@login
Feature: Auto-Generated Feature File

@login1
Scenario: User have login and back to the home page
Given User can open Sign in page ds-Algo 
When User click sign in button
Then User will be redirected to the in-page

@login2
Scenario Outline: User have vaild Id password
Given Users can open Sign in page
When User enter Username and Password without register from excel sheet <Rownumber>
Then The user will see a pop-up that says Invalid Username and Password
Examples:
|Rownumber|
|8|

@login3
Scenario Outline: User have already registed account
Given Users can open Sign in page
When User enter Username and Password without register from excel sheet <Rownumber>
Then The user will see a pop-up that says If you don't have an account, please Register
Examples:
|Rownumber|
|8|

@login4
Scenario: User has given Username
Given Users can open Sign in page
When User try to sign in without entering Username Password
Then Then the User will display an error message Please fill out this field in a username

@login5
Scenario Outline: User have enter Password
Given Users can open Sign in page
When User try to sign in without entering  Password from excel sheet <Rownumber>
Then Then the User will display an error message Please fill out this field in a Password
Examples:
|Rownumber|
|4|

@login6
Scenario Outline: User has entered the right ID
Given Users can open Sign in page
When The user enters an invalid user id and password combination from excel sheet <Rownumber>
Then Then user will display Please check your user id
Examples:
|Rownumber|
|2|

@login7
Scenario Outline: User has entered the right password
Given Users can open Sign in page
When The user enters an valid user id and invalid password from excel sheet <Rownumber>
Then Then user will display Please check your password
Examples:
|Rownumber|
|10|

@login8
Scenario Outline: User have vaild Id password
Given Users can open Sign in page
When The user enters an invalid user id and valid password from excel sheet <Rownumber>
Then Then user will display Invalid username and password
Examples:
|Rownumber|
|11|
 
@login9
Scenario Outline: User have vaild Id password
Given Users can open Sign in page
When The user enters an valid user id and password from excel sheet <Rownumber>
Then Then user should be redirected to Home Page with the message You are logged in and with the user name on the top
Examples:
|Rownumber|
|1|

@login10
Scenario Outline: User has logged out
Given User is login using <Rownumber> and see the sign out
When User try to click sign out
Then then user we see message on home page Logged out succcessfully
Examples:
|Rownumber|
|1|