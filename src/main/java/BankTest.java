import Product.BankAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    BankAccount firstBankAccount;
    BankAccount secondBankAccount;


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

    @And("another Bank account with {int} kc")
    public void anotherBankAccountWithKc(int inicialBalance) {
        secondBankAccount = new BankAccount(inicialBalance);
    }

    @When("A user transfer from first bank account to second one {int} kc")
    public void aUserTransferFromFirstBankAccountToSecondOneKc(int transferAmount) {
        firstBankAccount.withdraw(transferAmount);
        secondBankAccount.transfer(transferAmount);
    }

    @And("A user second account balance is {int} kc")
    public void aUserSecondAccountBalanceIsKc(int expectedBalance) {
        assertEquals(expectedBalance, secondBankAccount.getAccountBalance());
    }
}
