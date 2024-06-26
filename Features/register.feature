#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: register
@regression
    Scenario: Verify User is able to register with correct credentials
    Given user launch chrome browser
    When user open the URL
    And user click on register
    And user select gender
    And User fill name
    And user fill DOB
    And user fill email 
    And user fill pass
    And user fill cnf pass
    Then user click on register button1
    And close the browser