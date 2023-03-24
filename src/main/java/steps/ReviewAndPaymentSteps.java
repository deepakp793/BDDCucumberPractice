package steps;

import io.cucumber.java.en.Then;
import pages.ReviewAndPaymentPage;

public class ReviewAndPaymentSteps {

    ReviewAndPaymentPage reviewAndPaymentPage = ReviewAndPaymentPage.getObject();
    @Then("click on place order")
    public void click_on_place_order() throws InterruptedException {
        Thread.sleep(5000);
        reviewAndPaymentPage.clickOnPlaceOrder();
    }
}
