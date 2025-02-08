Feature: Testing Linkedlist Module in dsAlgo portal 

Scenario Outline: Verify if User is able to navigate to LinkedList Page 
	Given User is in Home screen after logging in for LinkedList <Rownumber> 
	When User clicks on Get Started button in Linked List panel 
	Then User should be redirected to the LinkedList page 
	Examples: 
		|Rownumber|
		|1|
		
		
Scenario Outline: 
	Verify if User is able to navigate to Introduction Page for LinkedList 
	Given User is in LinkedList Page <Rownumber> 
	When User clicks on Introduction link for LinkedList 
	Then User should be redirected to the Introduction page for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify User is able to navigate to TryEditor Page of Introduction for LinkedList 
	Given User is in Introduction Page of LinkedList <Rownumber> 
	When User clicks on Try here>>> button for LinkedList 
	Then User should be redirected to TryEditor page for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if user is able to successfully run the python code in Try Editor for Introduction LinkedList
	Given User is in TryEditor page of Introduction and provided valid python code for LinkedList <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Python code should be successfully executed without any error for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
		
Scenario Outline: 
	Verify if alert message is popping up when user provided invalid input in Try Editor panel of Introduction and clicked Run button for LinkedList 
	Given User is in TryEditor page of Introduction and provided invalid python code for LinkedList <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Alert message should be popped up for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if User is able to navigate to Creating LinkedList Page  
	Given User is in LinkedList Page <Rownumber> 
	When User clicks on Creating LinkedList link 
	Then User should be redirected to Creating LinkedList page 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify User is able to navigate to TryEditor Page of Creating LinkedList Page 
	Given User is in Creating LinkedList Page <Rownumber> 
	When User clicks on Try here>>> button for LinkedList 
	Then User should be redirected to TryEditor page for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if user is able to successfully run the python code in TryEditor of Creating LinkedList Page 
	Given User is in TryEditor page of Creating LinkedList Page and provided valid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Python code should be successfully executed without any error for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if alert message is popping up when user provided invalid input in TryEditor of Creating LinkedList Page  and clicked Run button
	Given User is in TryEditor page of Creating LinkedList Page and provided invalid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Alert message should be popped up for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
		
Scenario Outline: Verify if User is able to navigate to Types of LinkedList Page 
	Given User is in LinkedList Page <Rownumber> 
	When User clicks on Types of LinkedList link 
	Then User should be redirected to Types of LinkedList page 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify User is able to navigate to TryEditor Page of Types of LinkedList Page 
	Given User is in Types of LinkedList Page <Rownumber> 
	When User clicks on Try here>>> button for LinkedList 
	Then User should be redirected to TryEditor page for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if user is able to successfully run the python code in TryEditor of Types of LinkedList Page 
	Given User is in TryEditor page of Types of LinkedList Page and provided valid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Python code should be successfully executed without any error for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if alert message is popping up when user provided invalid input in TryEditor of Types of LinkedList Page  and clicked Run button
	Given User is in TryEditor page of Types of LinkedList Page and provided invalid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Alert message should be popped up for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
		
Scenario Outline: 
	Verify if User is able to navigate to Implement LinkedList in Python Page
	Given User is in LinkedList Page <Rownumber> 
	When User clicks on Implement LinkedList in Python link 
	Then User should be redirected to Implement LinkedList in Python page 
	Examples: 
		|Rownumber|
		|1| 
		
Scenario Outline: 
	Verify User is able to navigate to TryEditor Page of Implement LinkedList Page 
	Given User is in Implement LinkedList Page <Rownumber> 
	When User clicks on Try here>>> button for LinkedList 
	Then User should be redirected to TryEditor page for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if user is able to successfully run the python code in TryEditor of Implement LinkedList Page 
	Given User is in TryEditor page of Implement LinkedList Page and provided valid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Python code should be successfully executed without any error for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if alert message is popping up when user provided invalid input in TryEditor of Implement LinkedList Page  and clicked Run button
	Given User is in TryEditor page of Implement LinkedList Page and provided invalid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Alert message should be popped up for LinkedList 
	Examples: 
		|Rownumber|
		|1| 
		
		
Scenario Outline: 
	Verify if User is able to navigate to Traversal Page for LinkedList 
	Given User is in LinkedList Page <Rownumber> 
	When User clicks on Traversal link for LinkedList 
	Then User should be redirected to Traversal page for LinkedList 
	Examples: 
		|Rownumber|
		|1|	
		
		
Scenario Outline: 
	Verify User is able to navigate to TryEditor Page of Traversal LinkedList Page 
	Given User is in Traversal LinkedList Page <Rownumber> 
	When User clicks on Try here>>> button for LinkedList 
	Then User should be redirected to TryEditor page for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if user is able to successfully run the python code in TryEditor of Traversal LinkedList Page 
	Given User is in TryEditor page of Traversal LinkedList Page and provided valid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Python code should be successfully executed without any error for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if alert message is popping up when user provided invalid input in TryEditor of Traversal LinkedList Page  and clicked Run button
	Given User is in TryEditor page of Traversal LinkedList Page and provided invalid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Alert message should be popped up for LinkedList 
	Examples: 
		|Rownumber|
		|1|  
		
		
		
Scenario Outline: 
	Verify if User is able to navigate to Insertion Page for LinkedList 
	Given User is in LinkedList Page <Rownumber> 
	When User clicks on Insertion link for LinkedList 
	Then User should be redirected to Insertion page for LinkedList 
	Examples: 
		|Rownumber|
		|1|  
		
Scenario Outline: 
	Verify User is able to navigate to TryEditor Page of Insertion LinkedList Page 
	Given User is in Insertion LinkedList Page <Rownumber> 
	When User clicks on Try here>>> button for LinkedList 
	Then User should be redirected to TryEditor page for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if user is able to successfully run the python code in TryEditor of Insertion LinkedList Page 
	Given User is in TryEditor page of Insertion LinkedList Page and provided valid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Python code should be successfully executed without any error for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if alert message is popping up when user provided invalid input in TryEditor of Insertion LinkedList Page  and clicked Run button
	Given User is in TryEditor page of Insertion LinkedList Page and provided invalid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Alert message should be popped up for LinkedList 
	Examples: 
		|Rownumber|
		|1| 
		
		
		
Scenario Outline: 
	Verify if User is able to navigate to Deletion Page for LinkedList 
	Given User is in LinkedList Page <Rownumber> 
	When User clicks on Deletion link for LinkedList 
	Then User should be redirected to Deletion page for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
		
Scenario Outline: 
	Verify User is able to navigate to TryEditor Page of Deletion LinkedList Page 
	Given User is in Deletion LinkedList Page <Rownumber> 
	When User clicks on Try here>>> button for LinkedList 
	Then User should be redirected to TryEditor page for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if user is able to successfully run the python code in TryEditor of Deletion LinkedList Page 
	Given User is in TryEditor page of Deletion LinkedList Page and provided valid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Python code should be successfully executed without any error for LinkedList 
	Examples: 
		|Rownumber|
		|1|
		
Scenario Outline: 
	Verify if alert message is popping up when user provided invalid input in TryEditor of Deletion LinkedList Page  and clicked Run button
	Given User is in TryEditor page of Deletion LinkedList Page and provided invalid python code <Rownumber> 
	When User clicks on Run button for LinkedList 
	Then Alert message should be popped up for LinkedList 
	Examples: 
		|Rownumber|
		|1| 
		
		
		
Scenario Outline: 
	Verify if User is able to navigate to Practice Questions Page and view the content for LinkedList 
	Given User is in LinkedList Page <Rownumber> 
	When User clicks Practice Questions link for LinkedList 
	Then User should be able to navigate to Practice Questions page and page content should be displayed for LinkedList 
	Examples: 
		|Rownumber|
		|1| 	
		
		
	