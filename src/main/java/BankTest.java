import Product.BankAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BankTest {

    BankAccount firstBankAccount;

    @Given("Bank account with {int} eur")
    public void bankAccountWithEur(int initialBalance) {
        firstBankAccount = new BankAccount(initialBalance);

    }

    @Then("A user account balance is {int} eur")
    public void aUserAccountBalanceIsEur(int expectedBalance) {


    }
}
