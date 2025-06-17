import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KalkulackaTest {

    int prvCislo;
    int druCislo;
    int vypocitanyVysledok;


    @Given("Uzivatel ma zadane dve cisla {int} a {int}")
    public void uzivatelMaZadaneDveCislaA(int prveCislo, int druheCislo) {
        prvCislo = prveCislo;
        druCislo = druheCislo;
    }

    @When("Uzivatel spocita tieto dve cisla")
    public void uzivatelSpocitaTietoDveCisla() {
        vypocitanyVysledok = prvCislo + druCislo;

    }

    @Then("Uzivatel vidi vysledok {int}")
    public void uzivatelVidiVysledok(int predpokladanyVysledok) {

    }
}
