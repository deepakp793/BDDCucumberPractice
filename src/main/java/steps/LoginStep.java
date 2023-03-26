package steps;

import base.PredefinedActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

import java.sql.SQLOutput;

public class LoginStep {

    @Given("user click on provided url")
    public void user_click_on_provided_url() {


    }

    @Then("Verify Luma website is launched")
    public void verify_luma_website_is_launched() {
        String actualPageTitle = PredefinedActions.getPageTitle();
        String expectedPageTitle = "Home Page";
        Assert.assertTrue("Actual Page Title is " + actualPageTitle, actualPageTitle.contains(expectedPageTitle));
    }

    LoginPage login = LoginPage.getObject();

    @Given("User click on Sign In")
    public void user_click_on_sign_in() {
        login.clickOnSign();
    }

    @When("User Enter Username as {string} and Password as {string}")
    public void user_enter_username_as_and_password_as(String userName, String password) {
        login.enterUserNamePassword(userName, password);
    }

    @When("click on Sign In button")
    public void click_on_sign_in_button() {
        login.clickOnLoginButton();
    }

    @Then("User should able to login")
    public void user_should_able_to_login() {
        String pageTitle = login.getTitle();
        String expectedTitle = "Test";
        Assert.assertTrue(pageTitle.contains("Home"));
    }

    @Then("User should not be login and error message displays")
    public void User_should_not_be_login_and_error_message_displays() {
        Assert.assertTrue(login.isLoginErrorMessageDisplays());
        System.out.println("Error message is: " + login.getErrorMessageText());
    }

    @Given("User login to WebSite with Username as {string} and Password as {string}")
    public void user_login_to_web_site_with_username_as_and_password_as(String userName, String password) {
        login.clickOnSign();
        login.enterUserNamePassword(userName, password);
        login.clickOnLoginButton();
    }

}
