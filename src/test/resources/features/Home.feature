@Home
Feature: Home Module

Scenario: Users can open the Ds Algo portal
Given The user opens DS Algo portal link
When The user clicks the Get Started button
Then The user will be redirected to homepage

Scenario: Users can see the Home page
Given The user can open ds-algo page
When when user get the ds-algo link
Then Then user land on the home page

Scenario: The user will not be able to open without a login
Given The user can open ds-algo page
When user clicks the Data Structures Get Started Button
Then User will see the pop of You are not login

Scenario: User will can see all drop-down module
Given The user can open ds-algo page 
When user clicks the Data Structures drop-down button
Then Users will see Arrays, Linked list, Stack, Queue, trees and Graph different module names in drop down
