Feature: Contact Page Functionality of Practice Test Automation Website

Background: 
Given user is on contact page of Practice Test Automation Website

@ContactTest
Scenario: Send message with invalid e mail
Given user enters first name and last name
Then user enters invalid e mail and message
Then user click on submit
Then user gets error message for invalid e mail

@ContactTest
Scenario: Send message with no first name
Given user enters last name
Then user enters valid e mail and message
Then user click on submit
Then user gets error message for empty first name