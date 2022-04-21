Feature: Etsy Search Functionality

  Background: navigate
    Given the user navigates to "https://www.etsy.com/"

  @regressionoutline
  Scenario Outline: Validation of etsy search Hat
    When the user searches with "<searchvalue>"
    Then the user validates the title "<titlevalidation>"
    Examples:
      | searchvalue | titlevalidation |
      | Hat         | Hat \| Etsy     |
      | Key         | Key \| Etsy     |
      | Pin         | Pin \| Etsy     |
      | bag         | notitle         |
      | flowers     | flowers         |


     # searchvalue--> makes it dynamic (instead of one-time. ex. Hat)

        #ctrl+alt+L - to organize  ---> windows
        #command +option+L         ---> mac