#implementing data driven testing

Feature: Login Functionality

Scenario Outline: Validating Login Page with different set of data

Given User is on login page
When User enters "<username>" and "<password>"
And User clicks on login button
Then User may login or may get error message

Examples:
|username     |password    |
|standard_user|secret_sauce|
|standarduser |secretsauce |
|standarduser |secret_sauce|
|standard_user|secretsauce |