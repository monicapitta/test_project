@regression
Feature: Adding a product to the basket on Amazon

  Scenario: User searches for and adds a greeting card to the basket
    Given the user launches the Amazon website
    When the user searches for "greeting card"
    And the user selects the first search result
  #  Then the user is navigated to the product page
 #   When the user adds the product to the basket
  #  Then the product is successfully added to the basket
