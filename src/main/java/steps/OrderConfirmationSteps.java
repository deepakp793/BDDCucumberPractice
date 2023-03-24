package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.OrderConfirmationPage;

public class OrderConfirmationSteps {

    OrderConfirmationPage orderConfirmationPage=OrderConfirmationPage.getObject();
    @Then("verify order is successfully placed")
    public void verify_order_is_successfully_placed() throws InterruptedException {
        String confirmationText = orderConfirmationPage.getConfirmationText();
        Assert.assertEquals("Thank you for your purchase!", confirmationText);
        System.out.println(confirmationText);
    }
}
