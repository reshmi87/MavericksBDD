Feature: Testing the Queue Module in dsAlgo Portal

Scenario: Verify the user is able to navigate Queue page.
Given User is in the Home Page after logged in.
When User clicks the Get Started button in the Queue panel.
Then User should be directed to the Queue page.

Scenario: Verify that the user is able to navigate to the Implementation of Queue in Python page
Given User is in the Queue page 
When User clicks on the hyperlink Implementation of Queue in Python
Then User lands on the Implementation of Queue in Python page.

Scenario: Verify that the user is able to navigate to the Practice Questions page and view the content.	
Given User is in the Implementation of Queue in Python  page	
When  User clicks on the Practice Questions from the side navigation bar	
Then User lands on the Practice Questions page and is able to view the content successfully.

Scenario: Verify that the Try here>>> button is functional
Given User is in the Implementation of Queue in Python page
When User clicks on the Try here>>> button
Then User lands on the Try Editor page.

Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Operations in Queue page	
Given User is in Try Editor page from Implementation of Queue in Python page
When User clicks on Run Button without entering the code	
Then An Alert window with the error message is displayed.

Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Implementation of Queue in Python page	
Given User is in Try Editor page from Implementation of Queue in Python page
When User clicks on Run Button after entering a invalid python code.	
Then An Alert window with the error message is displayed.

Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Implementation of Queue in Python page	
Given User is in Try Editor page from Implementation of Queue in Python page
When User clicks on Run Button after entering a valid python code.	
Then Correct output is displayed in the console.

Scenario: Verify that the user is able to navigate to the Implementations using collections.deque page	
Given User is in Queue page	
When User clicks on the hyperlink Implementations using collections.deque	
Then User lands on the Implementation using collections.deque page

Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Implementations using collections.deque page	
Given User is in Try Editor page from Implementations using collections.deque page
When User clicks on Run Button without entering the code	
Then An Alert window with the error message is displayed.

Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Implementations using collections.deque page	
Given User is in Try Editor page from Implementations using collections.deque page
When User clicks on Run Button after entering a invalid python code.	
Then An Alert window with the error message is displayed.

Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Implementations using collections.deque page	
Given User is in Try Editor page from Implementations using collections.deque page	
When User clicks on Run Button after entering a valid python code.	
Then Correct output is displayed in the console.

Scenario: Verify that the user is able to navigate to the Implementation using Array page	
Given User is in Queue page	
When User clicks on the hyperlink Implementation using Array.	
Then User lands on the Implementation using Array page.

Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Implementation using Array page	
Given User is in Try Editor page from Implementation using Array page
When User clicks on Run Button without entering the code	
Then An Alert window with the error message is displayed.

Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Implementation using Array page.	
Given User is in Try Editor page from Implementation using Array page.
When User clicks on Run Button after entering a invalid python code.	
Then An Alert window with the error message is displayed.

Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Implementation using Array page.	
Given User is in Try Editor page from Types of Trees page
When User clicks on Run Button after entering a valid python code.	
Then Correct output is displayed in the console.

Scenario: Verify that the user is able to navigate to the Queue Operations page	
Given User is in Queue page	
When User clicks on the hyperlink Queue Operations.	
Then User lands on the Queue Operations page

Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Queue Operations page	
Given User is in Try Editor page from Queue Operations page
When User clicks on Run Button without entering the code	
Then An Alert window with the error message is displayed.

Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Queue Operations page	
Given User is in Try Editor page from Queue Operations page
When User clicks on Run Button after entering a invalid python code.	
Then An Alert window with the error message is displayed.

Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Queue Operations page.	
Given User is in Try Editor page from Queue Operations page	
When User clicks on Run Button after entering a valid python code.	
Then Correct output is displayed in the console.



