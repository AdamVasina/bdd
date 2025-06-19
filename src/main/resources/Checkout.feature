Feature: Checkout

  Scenario: Checkout banana
    Given The price of "banana" is 45c
    When A user checkout "banana" 2
    Then The total price should be 90c


    Scenario: Checkout banana and apple
      Given The price of "banana" is 45c
      And The price of "apple" is 50c
      When A user checkout "banana" 2
      And A user checkout "apple" 3
      Then The total price should be 240c




