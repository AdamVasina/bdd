Feature: Bank

  Scenario: Bank account balance
    Given Bank account with 1000 eur
    Then A user account balance is 1000 eur

    Scenario Outline: : Bank account transfer
      Given Bank account with <initialBalance> eur
      When A user withdraw <withdrawAmount> eur
      And A user transfer <transferAmount> eur to this account
      Then A user account balance is <expectedBalance> eur

      Examples:
      | initialBalance | withdrawAmount | transferAmount | expectedBalance |
      | 500            | 250            | 1250           | 1500            |
      | 1000           | 500            | 1000           | 1500            |




