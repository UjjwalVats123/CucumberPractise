Feature: Test Application Login Functionality
	This feature file is covering concept of hooks


# Execution sequence : Hooks (@Before) >> Background >> Scenario
Background:
When User launches the browser
And Clears the cookies in browser

@RegressionTest @GenericUserTest
Scenario: User page default login
Given User is on net-banking landing page
When User logs-in into application with "user001" and "pass001"
Then Home page is displayed
And Cards are displayed

@RegressionTest @MortgageUserTest
Scenario: Mortgage User page default login

Given User is on net-banking landing page
When User logs-in into application with "user001" and "pass001"
Then Home page is displayed
And Cards are displayed