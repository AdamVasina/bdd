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


      Scenario: Multiple Bank account transfer
        Given Bank account with 1000 eur
        And Another Bank account with 2000 eur
        When A user transfer from first bank account to second one 500 eur
        Then A user account balance is 500 eur
        And A user second account balance is 2500 eur





