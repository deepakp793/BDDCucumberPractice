package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MyAccountPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyAccountSteps {

    MyAccountPage myAccountPage = MyAccountPage.getObject();


    @Then("customer should see expected options on My Account page")
    public void customer_should_see_expected_options_on_my_account_page() {
        List<String> myAccountOptions = myAccountPage.getOptionList();
        String[] accOptinArr = {"My Orders", "My Downloadable Products", "My Wish List", "Address Book", "Account Information", "Stored Payment Methods", "My Product Reviews", "Newsletter Subscriptions"};
        List<String> expectedOptionList = new ArrayList<String>(Arrays.asList(accOptinArr));
        System.out.println(myAccountOptions);
        System.out.println(expectedOptionList);
        Assert.assertTrue(myAccountOptions.equals(expectedOptionList));
    }




}
