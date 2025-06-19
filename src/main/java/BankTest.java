import Product.BankAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    BankAccount firstBankAccount;

    @Given("Bank account with {int} eur")
    public void bankAccountWithEur(int initialBalance) {
        firstBankAccount = new BankAccount(initialBalance);

    }

    @Then("A user account balance is {int} eur")
    public void aUserAccountBalanceIsEur(int expectedBalance) {
        assertEquals(expectedBalance, firstBankAccount.getAccountBalance());


    }

    @When("A user withdraw {int} eur")
    public void aUserWithdrawEur(int withdrawAmount) {
        firstBankAccount.withdraw(withdrawAmount);
    }

    @And("A user transfer {int} eur to this account")
    public void aUserTransferEurToThisAccount(int transferAmount) {
        firstBankAccount.transfer(transferAmount);

    }
}
