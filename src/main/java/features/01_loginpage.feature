Feature: Login Functionality of Practice Test Automation Website

Background: 
Given user is on test login page of Practice Test Automation Website

@LoginTest
Scenario: Login with correct username and password
Given user enters correct username and password
Then user clicks on submit
Then user is on logged in

@LoginTest
Scenario: Login with incorrect username and password
Given user enters incorrect username and password
Then user clicks on submit
Then user gets error message for incorrect username