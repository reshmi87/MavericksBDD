@Graph
Feature: Graph Module

Background:
Given User has signed in dsAlgoPortal

@positiveflow @crossbrowser
Scenario: Verify that the user is able to land in Graph page
Given Graph - User is in the Home page
When User clicks on Get Started button under the section Graph
Then User lands on the Graph page

@positiveflow @crossbrowser
Scenario: Verify that the user is able to navigate to the Graph Sub page
Given User is in the Graph home page.
When User clicks on the hyperlink Graph
Then User lands on the Graph Sub page

@positiveflow
Scenario: Graph - Verify that the user is able to navigate to the Practice Questions page and view the content.	
Given User is in the Graph Sub page
When Graph - User clicks on the Practice Questions from the side navigation bar	
Then Graph - User lands on the Practice Questions page and is able to view the content successfully


@positiveflow
Scenario: Graph - Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Graph page	
Given User is in Try Editor page from Graph Sub page
When Graph - User clicks on Run Button without entering the code
Then Graph - An Alert window with the error message is displayed

@negativeflow
Scenario Outline: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Graph page	
Given User is in Try Editor page from Graph Sub page
When User clicks on Run Button after entering a invalid python code from Excel <Rownumber> for Graph Module
Then An Alert window with the error message from Excel <Rownumber> for Graph Module is displayed
Examples:
|Rownumber|
|2|

@positiveflow
Scenario Outline: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Graph page
Given User is in Try Editor page from Graph Sub page
When User clicks on Run Button after entering a valid python code from Excel <Rownumber> for Graph Module
Then Correct output is displayed in the console from Excel <Rownumber> for Graph Module
Examples:
|Rownumber|
|1|

@positiveflow @crossbrowser
Scenario: Verify that the user is able to navigate to the Graph Representation Sub page
Given User is in the Graph home page.
When User clicks on the hyperlink Graph Representation
Then User lands on the Graph Representation Sub page

@positiveflow
Scenario: Graph - Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Graph Representation page
Given User is in Try Editor page from Graph Representation Sub page
When Graph - User clicks on Run Button without entering the code
Then Graph - An Alert window with the error message is displayed

@negativeflow
Scenario Outline: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Graph Representation page	
Given User is in Try Editor page from Graph Representation Sub page
When User clicks on Run Button after entering a invalid python code from Excel <Rownumber> for Graph Module
Then An Alert window with the error message from Excel <Rownumber> for Graph Module is displayed
Examples:
|Rownumber|
|2|

@positiveflow
Scenario Outline: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Graph Representation page
Given User is in Try Editor page from Graph Representation Sub page
When User clicks on Run Button after entering a valid python code from Excel <Rownumber> for Graph Module
Then Correct output is displayed in the console from Excel <Rownumber> for Graph Module
Examples:
|Rownumber|
|1|

@positiveflow @crossbrowser
Scenario: Verify that the user is able to navigate to Graph page from dropdown at the top and navigate further
Given Graph - User signed in dsAlgo Portal and is on the home page
When User clicks on Graph from the drop down above.
Then User navigates to Graph page.