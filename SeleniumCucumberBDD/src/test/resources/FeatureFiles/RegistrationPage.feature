Feature: Registration Fuctionality

Scenario: Validating registration page
		Given user is on registration page
		When the user enters first name 
    And the user enters last name 
    And the user enters date of birth 
    And the user enters phone number 
    And the user enters email 
    And the user selects gender 
    And the user selects age group 
    And the user enters weight 
    And the user selects sports 
    And the user uploads file 
    And the user enters address 
    And the user enters zipcode 
    And the user checks the agreement checkbox
    And the user clicks the submit button
    Then the user is Registered

 