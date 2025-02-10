Feature: Testing the Array Module in dsAlgo Portal

@arraytest
Scenario: Verify that user is able to navigate to Array data structure page from Getting Started button in Array panel	
Given The user is in the Home page after Sign in	
When The user clicks the Getting Started button in Array panel	
Then The user should able to view Array Page
@A1
Scenario: Verify that user is able to navigate to Array data structure page from the drop down menu	
Given The Array-user is in the Home page after Sign in	
When The user select Array item from the drop down menu
Then The Array-user should able to view Array Page
@A2
Scenario: Verify that user is able to navigate to Arrays in Python page	
Given The user is in the Array page after Sign in	
When The user clicks Arrays in Python link	
Then The user should be redirected to Arrays in Python page
@A3
Scenario: Verify that user is able to navigate to try Editor page for Arrays in Python page	
Given The user is on the Arrays in Python page	
When The user clicks Try here button in Arrays in Python page	
Then The user should be redirected to a page having an try Editor with a Run button to test
@A4
Scenario: Verify that user receives error when click on Run button without entering code for Arrays in Python page	
Given The user1 is in the try Editor page	
When The user clicks the Run Button without entering the code in the Editor	
Then The user1 should able to see an error message in alert window
@A5
Scenario: Verify that user receives error for invalid python code for "Arrays in Python" page	
Given The user2 is in the try Editor page	
When The user2 write the invalid code in Editor and click the Run Button	
Then The user2 should able to see an error message in alert window
@A6
Scenario: Verify that user is able to see output for valid python code for "Arrays in Python" page	
Given The user3 is in the try Editor page	
When The user1 write the valid code in Editor and click the Run Button	
Then The user1 should able to see output in the console
@A7
Scenario: Verify that user is able to navigate to Practice Questions Page for Arrays in Python page	
Given The Array-user is in the Array page after Sign in	
When The user1 clicks Practice Questions button	
Then The user should be redirected to Practice page
@A8
Scenario: Verify that user is able to navigate to Arrays Using List page	
Given The Array-user is in the Array page after Sign in	
When The user clicks Arrays Using List link	
Then The user should be redirected to Arrays Using List page
@A9
Scenario: Verify that user is able to navigate to try Editor page for Arrays Using List page	
Given The user is on the Arrays Using List page	
When The user clicks Try here button in Arrays Using List page	
Then The Array-user should be redirected to a page having an try Editor with a Run button to test
@A10
Scenario: Verify that user receives error when click on Run button without entering code for Arrays Using List page	
Given The user4 is in the try Editor page	
When The user1 clicks the Run Button without entering the code in the Editor	
Then The user should able to see an error message in alert window
@A11
Scenario: Verify that user receives error for invalid python code for Arrays Using List page	
Given The user5 is in the try Editor page	
When The user3 write the invalid code in Editor and click the Run Button	
Then The user3 should able to see an error message in alert window
@A12
Scenario: Verify that user is able to see output for valid python code for Arrays Using List page	
Given The user6 is in the try Editor page	
When The user2 write the valid code in Editor and click the Run Button	
Then The user2 should able to see output in the console
@A13
Scenario: Verify that user is able to navigate to Practice Questions Page for Arrays Using List page	
Given The array-user1 is in the Array page after Sign in	
When The user2 clicks Practice Questions button	
Then The user1 should be redirected to Practice page
@A14
Scenario: Verify that user is able to navigate to Basic Operations in Lists page	
Given The user0 is in the Array page after Sign in	
When The user clicks Basic Operations in Lists link	
Then The user should be redirected to Basic Operations in Lists page
@A15
Scenario: Verify that user is able to navigate to try Editor page for Basic Operations in Lists page	
Given The user is on the Basic Operations in Lists page	
When The user clicks Try here button in Basic Operations in Lists page	
Then The user1 should be redirected to a page having an try Editor with a Run button to test
@A16
Scenario: Verify that user receives error when click on Run button without entering code for Basic Operations in Lists page	
Given The user7 is in the try Editor page	
When The user2 clicks the Run Button without entering the code in the Editor	
Then The user4 should able to see an error message in alert window
@A17
Scenario: Verify that user receives error for invalid python code for Basic Operations in Lists page	
Given The user8 is in the try Editor page	
When The user4 write the invalid code in Editor and click the Run Button	
Then The user5 should able to see an error message in alert window
@A18
Scenario: Verify that user is able to see output for valid python code for Basic Operations in Lists page	
Given The user9 is in the try Editor page	
When The user3 write the valid code in Editor and click the Run Button	
Then The user3 should able to see output in the console
@A19
Scenario: Verify that user is able to navigate to Practice Questions Page for Basic Operations in Lists page	
Given The user1 is in the Array page after Sign in	
When The user clicks Practice Questions button	
Then The user0 should be redirected to Practice page
@A20
Scenario: Verify that user is able to navigate to Applications of Array page	
Given The user01 is in the Array page after Sign in	
When The user clicks Applications of Array link	
Then The user should be redirected to Applications of Array page
@A21
Scenario: Verify that user is able to navigate to try Editor page for Applications of Array page	
Given The user is on the Applications of Array page	
When The user clicks Try here button in Applications of Array	
Then The user2 should be redirected to a page having an try Editor with a Run button to test
@A23
Scenario: Verify that user receives error when click on Run button without entering code for Applications of Array page	
Given The user10 is in the try Editor page	
When The user3 clicks the Run Button without entering the code in the Editor	
Then The user6 should able to see an error message in alert window
@A24
Scenario: Verify that user receives error for invalid python code for Applications of Array page	
Given The user11 is in the try Editor page	
When The user5 write the invalid code in Editor and click the Run Button	
Then The user7 should able to see an error message in alert window
@A25
Scenario: Verify that user is able to see output for valid python code for Applications of Array page	
Given The user12 is in the try Editor page	
When The user4 write the valid code in Editor and click the Run Button	
Then The user4 should able to see output in the console
@A26
Scenario: Verify that user is able to navigate to Practice Questions Page for Applications of Array page	
Given The user2 is in the Array page after Sign in	
When The user01 clicks Practice Questions button	
Then The user01 should be redirected to Practice page
@A27
Scenario: Verify that user receives error for invalid python code on running Search the array question	
Given The user1 is on the practice question editor	
When The user6 write the invalid code in Editor and Click the Run Button	
Then The user8 should able to see an error message in alert window
@A28
Scenario: Verify that user is able to run valid python code for Search the array question	
Given The user2 is on the practice question editor	
When The user5 write the valid code in Editor and Click the Run Button	
Then The user5 should able to see output in the console
@A29
Scenario: Verify that user receives error on submitting invalid python code for Search the array question	
Given The user3 is on the practice question editor	
When The user1 write the invalid code in Editor and Click the Submit Button	
Then The user see an error message "Error occurred during submission"
@A30
Scenario: Verify that user receives error on submitting valid python code for Search the array question	
Given The user4 is on the practice question editor	
When The user1 write the valid code in Editor and Click the Submit Button	
Then The user see "Some Tests failed. Please review code"
@A31
Scenario: Verify that user receives error for invalid python code on running Max Consecutive Ones question	
Given The user5 is on the practice question editor	
When The user7 write the invalid code in Editor and Click the Run Button	
Then The user9 should able to see an error message in alert window
@A32
Scenario: Verify that user is able to run valid python code for Max Consecutive Ones question	
Given The user6 is on the practice question editor	
When The user6 write the valid code in Editor and Click the Run Button	
Then The user6 should able to see output in the console
@A33
Scenario: Verify that user receives error on submitting invalid python code for Max Consecutive Ones question	
Given The user7 is on the practice question editor	
When The user2 write the invalid code in Editor and Click the Submit Button	
Then The user see an error message Error occurred during submission
@A35
Scenario: Verify that user receives error for invalid python code on running Find Numbers with Even Number of Digits question	
Given The user9 is on the practice question editor	
When The user8 write the invalid code in Editor and Click the Run Button	
Then The user10 should able to see an error message in alert window
@A36
Scenario: Verify that user is able to run valid python code for Find Numbers with Even Number of Digits question	
Given The user10 is on the practice question editor	
When The user7 write the valid code in Editor and Click the Run Button	
Then The user7 should able to see output in the console
@A37
Scenario: Verify that user receives error on submitting invalid python code for Find Numbers with Even Number of Digits question	
Given The user11 is on the practice question editor	
When The user3 write the invalid code in Editor and Click the Submit Button	
Then The user100 see an error message Error occurred during submission
@A38
Scenario: Verify that user receives error on submitting valid python code for Find Numbers with Even Number of Digits question	
Given The user12 is on the practice question editor	
When The user3 write the valid code in Editor and Click the Submit Button	
Then The user02 see success message Submission successful
@A39
Scenario: Verify that user receives error for invalid python code on running Square of a Sorted Array question	
Given The user13 is on the practice question editor	
When The user9 write the invalid code in Editor and Click the Run Button	
Then The user11 should able to see an error message in alert window
@A40
Scenario: Verify that user is able to run valid python code for Square of a Sorted Array question	
Given The user14 is on the practice question editor	
When The user8 write the valid code in Editor and Click the Run Button	
Then The user8 should able to see output in the console
@A41
Scenario: Verify that user receives error on submitting valid python code for Square of a Sorted Array question	
Given The user141 is on the practice question editor	
When The user14 write the valid code in Editor and Click the Submit Button	
Then The user see "No tests were collected"