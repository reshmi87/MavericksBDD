Feature: Testing the Stack Module in dsAlgo Portal

Scenario: Verify the user is able to navigate Stack page.
Given User is in the Home Page after logged in.
When User clicks the Get Started button in the Stack panel.
Then User should be directed to the Stack page.

Scenario: Verify that the user is able to navigate to the Operations in Stack page
Given User is in the Stack page 
When User clicks on the hyperlink Operations in Stack
Then User lands on the Operations in Stack page.

Scenario: Verify that the user is able to navigate to the Practice Questions page and view the content.	
Given User is in the Operations in Stack page	
When  User clicks on the Practice Questions from the side navigation bar	
Then User lands on the Practice Questions page and is able to view the content successfully.

Scenario: Verify that the Try here>>> button is functional
Given User is in the Operations in Stack page
When User clicks on the Try here>>> button
Then User lands on the Try Editor page.

Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Operations in Stack page	
Given User is in Try Editor page from Operations in Stack page
When User clicks on Run Button without entering the code	
Then An Alert window with the error message is displayed.

Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Operations in Stack page	
Given User is in Try Editor page from Operations in Stack page
When User clicks on Run Button after entering a invalid python code.	
Then An Alert window with the error message is displayed.

Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Operations in Stack page	
Given User is in Try Editor page from Operations in Stack page
When User clicks on Run Button after entering a valid python code.	
Then Correct output is displayed in the console.

Scenario: Verify that the user is able to navigate to the Implementation page	
Given User is in Stack page	
When User clicks on the hyperlink Implementation.	
Then User lands on the Implementation page

Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Implementation page	
Given User is in Try Editor page from Implementation page
When User clicks on Run Button without entering the code	
Then An Alert window with the error message is displayed.

Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Implementation page	
Given User is in Try Editor page from Implementation page
When User clicks on Run Button after entering a invalid python code.	
Then An Alert window with the error message is displayed.

Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Implementation page	
Given User is in Try Editor page from Implementation page	
When User clicks on Run Button after entering a valid python code.	
Then Correct output is displayed in the console.

Scenario: Verify that the user is able to navigate to the Applications page	
Given User is in Stack page	
When User clicks on the hyperlink Applications.	
Then User lands on the Applications page.

Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Applications page	
Given User is in Try Editor page from Applications page
When User clicks on Run Button without entering the code	
Then An Alert window with the error message is displayed.

Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Applications page.
Given User is in Try Editor page from Applications page
When User clicks on Run Button after entering a invalid python code.	
Then An Alert window with the error message is displayed.

Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Applications page.
Given User is in Try Editor page from Applications page
When User clicks on Run Button after entering a valid python code.	
Then Correct output is displayed in the console.
