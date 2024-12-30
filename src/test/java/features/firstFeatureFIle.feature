Feature: Test Application Login Functionality
	This feature file will cover all possible logins


#Background keyword - Any steps written under Background keyword 
#will be executed before each test case in that feature file
#Remember : Scope of Background keyword is only within the feature 
#file and another feature file would require another Background keyword. So as to remove this drawback we can user Hooks.
# Hooks like @Before and @After will execute before every scenario in all feature files.
# There are a few drawbacks of Background keyword. For ex : If in the same feature file - 
# pre steps or precondition for 2 scenarios is different. But we can use Hooks in this case.
# Execution sequence : Hooks (@Before) >> Background >> Scenario
Background:

Given User with valid credentials
When User launches the browser
And Clears the cookies in browser

@SmokeTest
Scenario: Admin page default login
Given User is on net-banking landing page
When User logs-in into application with "admin" and "pass1234"
Then Home page is displayed
And Cards are displayed
@SmokeTest @RegressionTest
Scenario: User page default login
Given User is on net-banking landing page
When User logs-in into application with "user001" and "pass001"
Then Home page is displayed
And Cards are displayed
@SanityTest
#Regular Expressions Usage
Scenario: This scenario explains regular expressions usage in stepDefinitions file
Given User is on net-banking landing page
When User logs-in into application with "user001" and "pass001"
Then Home page is displayed
And 5 Debit Cards are displayed
And User Code 991.112 is displayed
And User Code "user001" is displayed
And User Code user001 is displayed
@SanityTest @RegressionTest
#Parameterisation using Scenario Outline. This is just like DataProvider in TestNG.
#This test will run 2 times since 2 data sets are provided
Scenario Outline: "<username>" User page default login
Given User is on net-banking landing page
When User logs-in into application with "<username>" and "<password>"
Then Home page is displayed
And Cards are displayed
Examples: 
	|	username		| password 				|
	|	debituser		|	passdebit1234		|
	|	credituser	|	passcredit1234	|
@SmokeTest @SanityTest @RegressionTest
#Data Table Usage as List<String>
Scenario: User Signup
Given User is on Signup page
When User signs up into application
|	Ujjwal 								|
|	Vats									|
|	ujjwalvats@gmail.com	|
|	8888888888						|
Then Home page is displayed
And Cards are displayed