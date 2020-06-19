package net.upgenix.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.upgenix.pages.LoginPage;
import net.upgenix.utilities.ConfigurationReader;
import net.upgenix.utilities.Driver;
import net.upgenix.utilities.UserConstants;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String url = null;
        if (System.getProperty("env") != null) {
            url = ConfigurationReader.getProperty("url");
        } else {
            url = ConfigurationReader.getProperty("url");
        }
        Driver.getDriver().get(url);
    }

    @When("I login as a POS manager")
    public void i_login_as_a_POS_manager() {
        String email = ConfigurationReader.getProperty("pos_manager_email");
        String password = ConfigurationReader.getProperty("pos_manager_password");
        loginPage.login(email, password);
    }

    @Then("Page title should contain {string}")
    public void page_title_should_contain(String expectedTitle) throws InterruptedException {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("I login as a {string}")
    public void i_login_as_a(String user) throws Exception {
        String email = null;
        String password = null;

        switch (user.toLowerCase()) {
            case UserConstants.CRM_MANAGER:
                email = ConfigurationReader.getProperty("events_crm_manager_email");
                password = ConfigurationReader.getProperty("events_crm_manager_password");
                break;
            case UserConstants.EXPENSES_MANAGER:
                email = ConfigurationReader.getProperty("expenses_manager_email");
                password = ConfigurationReader.getProperty("expenses_manager_password");
                break;
            case UserConstants.INVENTORY_MANAGER:
                email = ConfigurationReader.getProperty("inventory_manager_email");
                password = ConfigurationReader.getProperty("inventory_manager_password");
                break;
            case UserConstants.POS_MANAGER:
                email = ConfigurationReader.getProperty("pos_manager_email");
                password = ConfigurationReader.getProperty("pos_manager_password");
                break;
            case UserConstants.SALES_MANAGER:
                email = ConfigurationReader.getProperty("sales_manager_email");
                password = ConfigurationReader.getProperty("sales_manager_password");
                break;
            default:
                throw new Exception("USER TYPE DOES NOT EXIST: " + user);
        }
        loginPage.login(email, password);
    }

}
