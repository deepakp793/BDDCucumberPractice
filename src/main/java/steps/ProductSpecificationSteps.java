package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductSpecificationPage;


public class ProductSpecificationSteps {

    ProductSpecificationPage productSpecificationPage = ProductSpecificationPage.getObject();
    @When("User select size as {string} and color as {string}")
    public void user_select_size_as_and_color_as(String size, String color) {
        productSpecificationPage.selectColor();
        productSpecificationPage.selectSize(size);
    }

    @When("click on Add to Cart")
    public void click_on_add_to_cart() {
        productSpecificationPage.clickOnAddToCart();
    }

    @Then("Verify successfully added message displays")
    public void verify_successfully_added_message_displays() {
        String str= productSpecificationPage.getSuccessfulMessage();
        System.out.println(str);
        Assert.assertTrue(str.contains("You added "));
    }

    @Then("User click on shopping cart")
    public void user_click_on_shopping_cart() {
        productSpecificationPage.clickOnCart();
    }

    @Then("click on proceed to checkout")
    public void click_on_proceed_to_checkout() {
        productSpecificationPage.clickOnProceedToCheckout();
    }



}
