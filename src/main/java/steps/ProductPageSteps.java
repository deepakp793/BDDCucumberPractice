package steps;

import io.cucumber.java.en.When;
import pages.ProductPage;

public class ProductPageSteps {

    ProductPage productPage = ProductPage.getObject();
    @When("User select Tees as {string}")
    public void user_select_tees_as(String teeName) {
        productPage.selectTees(teeName);
    }
}

