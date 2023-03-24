package steps;

import io.cucumber.java.en.Then;
import pages.ShippingPage;

public class ShippingPageSteps {

    ShippingPage shippingPage=ShippingPage.getObject();
    @Then("click on next on Shipping Page")
    public void click_on_next_on_shipping_page() throws InterruptedException {
        Thread.sleep(3000);
        shippingPage.clickOnNext();
    }
}
