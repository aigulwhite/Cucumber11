Feature: Validation of Products

  @productproject
  Scenario: Validation of New Product Creation
    Given the user navigates to product website homepage and click orderButton
    When the user enters the product information "MyMoney" and "4"
    And the user enters the adress information "Techtorial", "2200 E Devon", "Des Plaines", "IL", "60018"
    And the user enters the card information "Visa", "132467585623", "06/24"
    Then the user validates success message
    And the user validates product details "Techtorial", "MyMoney", "4", "2200 E Devon", "Des Plaines", "IL", "60018", "Visa", "132467585623", "06/24"

  @productprojectOutline
  Scenario Outline: Validation of New Product Creation
    Given the user navigates to product website homepage and click orderButton
    When the user enters the product information "<productName>" and "<quantity>"
    And the user enters the adress information "<customerName>", "<street>", "<city>", "<state>", "<zipcode>"
    And the user enters the card information "<cardType>", "<cardNumber>", "<expireDate>"
    Then the user validates success message
    And the user validates product details "<customerName>", "<productName>", "<quantity>", "<street>", "<city>", "<state>", "<zipcode>", "<cardType>", "<cardNumber>", "<expireDate>"

    Examples:

      | productName |  | quantity |  | customerName |  | street       |  | city        |  | state |  | zipcode |  | cardType         |  | cardNumber   |  | expireDate |
      | MyMoney      |  | 4        |  | Techtorial   |  | 2200 E Devon |  | Des Plaines |  | IL    |  | 60018   |  | Visa             |  | 132467585623 |  | 06/24      |
      | FamilyAlbum |  | 6        |  | ahmet        |  | 560 Michigan |  | Michigaon   |  | MO    |  | 30062   |  | MasterCard       |  | 279401358735 |  | 08/22      |
      | ScreenSaver |  | 3        |  | aigul        |  | 2286 E Lake  |  | Grand Forks |  | ND    |  | 50821   |  | American Express |  | 984642871653 |  | 09/23      |
      | MyMoney     |  | 4        |  | Techtorial   |  | 2200 E Devon |  | Des Plaines |  | IL    |  | 60018   |  | Visa             |  | 132467585623 |  | 06/24      |
      | FamilyAlbum |  | 6        |  | ahmet        |  | 560 Michigan |  | Michigaon   |  | MO    |  | 30062   |  | MasterCard       |  | 279401358735 |  | 08/22      |
      | ScreenSaver |  | 3        |  | aigul        |  | 2286 E Lake  |  | Grand Forks |  | ND    |  | 50821   |  | American Express |  | 984642871653 |  | 09/23      |
      | MyMoney     |  | 4        |  | Techtorial   |  | 2200 E Devon |  | Des Plaines |  | IL    |  | 60018   |  | Visa             |  | 132467585623 |  | 06/24      |
      | FamilyAlbum |  | 6        |  | ahmet        |  | 560 Michigan |  | Michigaon   |  | MO    |  | 30062   |  | MasterCard       |  | 279401358735 |  | 08/22      |
      | ScreenSaver |  | 3        |  | aigul        |  | 2286 E Lake  |  | Grand Forks |  | ND    |  | 50821   |  | American Express |  | 984642871653 |  | 09/23      |
      | MyMoney     |  | 4        |  | Techtorial   |  | 2200 E Devon |  | Des Plaines |  | IL    |  | 60018   |  | Visa             |  | 132467585623 |  | 06/24      |
      | FamilyAlbum |  | 6        |  | ahmet        |  | 560 Michigan |  | Michigaon   |  | MO    |  | 30062   |  | MasterCard       |  | 279401358735 |  | 08/22      |
      | ScreenSaver |  | 3        |  | aigul        |  | 2286 E Lake  |  | Grand Forks |  | ND    |  | 50821   |  | American Express |  | 984642871653 |  | 09/23      |
      | MyMoney     |  | 4        |  | Techtorial   |  | 2200 E Devon |  | Des Plaines |  | IL    |  | 60018   |  | Visa             |  | 132467585623 |  | 06/24      |
      | FamilyAlbum |  | 6        |  | ahmet        |  | 560 Michigan |  | Michigaon   |  | MO    |  | 30062   |  | MasterCard       |  | 279401358735 |  | 08/22      |
      | ScreenSaver |  | 3        |  | aigul        |  | 2286 E Lake  |  | Grand Forks |  | ND    |  | 50821   |  | American Express |  | 984642871653 |  | 09/23      |
      | MyMoney     |  | 4        |  | Techtorial   |  | 2200 E Devon |  | Des Plaines |  | IL    |  | 60018   |  | Visa             |  | 132467585623 |  | 06/24      |
      | FamilyAlbum |  | 6        |  | ahmet        |  | 560 Michigan |  | Michigaon   |  | MO    |  | 30062   |  | MasterCard       |  | 279401358735 |  | 08/22      |
      | ScreenSaver |  | 3        |  | aigul        |  | 2286 E Lake  |  | Grand Forks |  | ND    |  | 50821   |  | American Express |  | 984642871653 |  | 09/23      |


















