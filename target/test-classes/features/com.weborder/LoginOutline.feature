
@smokeLoginTest
Feature: Login Functionality for WebOrder Page

  Background:
    Given the user navigates to the WebOrder website

  Scenario: validation of WebOrder Login Positive Scenario
    When the user provide credentials
    Then the user is on the home page


  Scenario Outline: Validation of WebOrder Login Negative Scenarios
    When the user provides wrong "<username>" and "<password>"
    Then the user validates the "<errorMessage>" error message
    Examples:
      | username              | password     | errorMessage   |
      | guest1@microworks.com | ahmet123     | Sign in Failed |
      | ahmet@gmail.com       | Guest1!      | Sign in Failed |
      | ahmet@gmail.com       | ahmet123     | Sign in Failed |
      |                       |              | Sign in Failed |
      |                       | Guest1!      | Sign in Failed |
      | guest1@microworks.com |              | Sign in Failed |
      | ahmet                 | @+%kjhkjh    | Sign in Failed |
      | *&^(&*^&^%#^%&        | ahmet        | Sign in Failed |
      | AHMETJLAKDF           | JKHFAHLJKADF | Sign in Failed |

# here we did nothing with the fist 2 scenarios.
 # we only created negative scenarios for the third one using the SCENARIO OUTLINE.










