Feature: pokus


  Scenario: Pokusny test 1
    Given nastavenie pociatocnych podmienok
    And dalsi nastavovaci krok
    When toto je nejaka akce
    And toto je dalsia akce
    Then overenie vysledku
    And dalsie overenie vysledku



    Scenario: Pokusny test 2
      Given nastavenie pociatocnych podmienok
      When toto je dalsia akce
      Then dalsie overenie vysledku



      Scenario: Kalkulacka - sucet dvoch cisel
        Given Uzivatel ma zadane dve cisla 5 a 8
        When Uzivatel spocita tieto dve cisla
        Then Uzivatel vidi vysledok 13


        Scenario: Kalkulacka - delenie dvoch cisiel
          Given Uzivatel ma zadane dve cisla 15 a 5
          When Uzivatel vydeli tieto dve cisla
          Then Uzivatel vidi vysledok 3

          Scenario Outline: Kalkulacka - scitanie viac scenarov
            Given Uzivatel ma zadane dve cisla <prveCislo> a <druheCislo>
            When Uzivatel spocita tieto dve cisla
            Then Uzivatel vidi vysledok <vysledok>

            Examples:
            | prveCislo | druheCislo | vysledok |
            | 120       | 24         | 144      |
            | 1011      | 10         | 1021     |
            | 0         | -24        | -24      |


