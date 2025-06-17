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