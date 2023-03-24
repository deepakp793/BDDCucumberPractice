package steps;

import io.cucumber.java.en.When;
import pages.FirstLoginPage;

public class FirstLoginPageSteps {


    FirstLoginPage firstLoginPage = FirstLoginPage.getObject();
    @When("on successful login user click dropdown arrow and select My Account")
    public void on_successful_login_user_click_dropdown_arrow_and_select_my_account() {
        firstLoginPage.clickOnDropDown();
        firstLoginPage.clickOnMyAccount();
    }


    @When("User select Tees from Dropdown")
    public void user_select_tees_from_dropdown() {
        firstLoginPage.hoverOnMenMenu();
        firstLoginPage.hoverToTopMenu();
        firstLoginPage.clickOnTees();
    }

}
