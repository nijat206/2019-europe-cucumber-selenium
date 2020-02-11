package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);


    }

    @When("the users enter the driver information")
    public void the_users_enter_the_driver_information() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        String actualTitle = Driver.get().getTitle();
        BrowserUtils.waitFor(2);
        Assert.assertEquals("Dashboard",actualTitle);
    }

    @When("the users enter the sales manger information")
    public void the_users_enter_the_sales_manger_information() {

        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        loginPage.login(username,password);
    }

    @When("the users enter the store manger information")
    public void the_users_enter_the_store_manger_information() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        loginPage.login(username,password);
    }

// -----------------------------LoginWithParameters--------------------------------------------------------------
    @When("user logs in using {string} and {string}")
    public void userLogsInUsingAnd(String username, String password) {

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Given("login as a driver")
    public void loginAsADriver() {
        System.out.println("Opening the login page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Then("the title should contains {string}")
    public void theTitleShouldContains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }
}
