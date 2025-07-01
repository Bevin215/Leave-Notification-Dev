#validating the Login page
Feature: Login Functionality

#execute the step write under background before each scenario
Background:
Given user is on Login page

@smoke
Scenario: Validating login page with valid credentials
When User enter valid username and password
And User click on login button
Then User landed on homepage
@regression
Scenario: Validating login page with invalid credentials
When User enter invalid username and password
And User click on login button
Then User gets error message
@important
Scenario: Validating login page with invalid username credentials
When User enter invalid username and valid password
And User click on login button
Then User gets error message
@optional
Scenario: Validating login page with invalid password credentials
When User enter valid username and invalid password
And User click on login button
Then User gets error message