@amazon
Feature: Testing Amazon Sign Up Functionality

  Background: navigate


  Scenario: Amazon SignUp with DataBase
    When the user clicks the sign in and creates your amazon account button
    Then the user validates the header
      | Create account |
    And the user provides the information
      | aigul           |
      | aigul@gmail.com |
      | aigul123        |
      | aigul123        |