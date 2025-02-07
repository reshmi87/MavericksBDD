@Graph
Feature: Graph Module

@Background
Scenario Outline: The user will graph the module in the ds-portal home page
Given The user is in the Home page after logged in using Excel <Rownumber>
When The user clicks the Getting Started button in Graph Pane or select Graph item from the drop down menu
Then The user should be directed to Graph Page
Examples:
|Rownumber|
|1|
|2|
|3|

@Graph2
Scenario Outline: User will redirect to graph home page
Given The user is in the Graph page after logged in using Excel <Rownumber>
When The user clicks Graph button
Then The user should be directed to Graph Page
Examples:
|Rownumber|
|1|

@Graph3
Scenario: User will redirect to Try here page
Given The user is in the Graph page after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

@Graph4
Scenario Outline: User will redirect to Graph Representation page
Given The user is in the Graph page after logged in using Excel <Rownumber>
When The user clicks Graph Representations button
Then The user should be directed to Graph Representations Page
Examples:
|Rownumber|
|1|

@Graph5
Scenario: User will redirect to Try here page
Given The user is in the Graph Representations page after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

@Graph6
Scenario: User will redirect to Practice  page
Given The user is in the Graph page after logged in
When The user clicks Practise Question button
Then The user should be directed to Practise Questions Page