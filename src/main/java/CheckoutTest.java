import Product.Checkout;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {

    private Checkout myCheckout;
    @Before
    public void totSeProvedePreKazdymTestom(){
        myCheckout = new Checkout();
    }

    @After
    public void totSaSpraviPoKazdomTeste(){
        myCheckout = null;
    }


    @Given("The price of {string} is {int}c")
    public void thePriceOfIsC(String name, int price) {
        myCheckout.addItem(name, price);

    }

    @When("A user checkout {string} {int}")
    public void aUserCheckout(String name, int count) {
        myCheckout.scanItems(name, count);

    }

    @Then("The total price should be {int}c")
    public void theTotalPriceShouldBeC(int expectedTotalPrice) {
        assertEquals(expectedTotalPrice, myCheckout.totalCart());

    }
}
