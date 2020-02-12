package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String>menuOptions){
        System.out.println("menuOptions.size = " + menuOptions.size());
        System.out.println("menuOptions = " + menuOptions);

        DashboardPage dashboardPage = new DashboardPage();

       List<String> actualMunuOptions = BrowserUtils.getElementsText(dashboardPage.menuOptions);
        System.out.println(actualMunuOptions);

        Assert.assertEquals(menuOptions,actualMunuOptions);

    }

    @When("the user logs in using following credentials")
    public void theUserLogsInUsingFollowingCredentials(Map<String,String> userData) {
        //System.out.println("userData = " + userData);
        //System.out.println(userData.get("firstname"));

        new LoginPage().login(userData.get("username"),userData.get("password"));

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();
        //System.out.println(dashboardPage.userName.getText());
        String actualFullname = dashboardPage.getUserName();
        String expectedFullname = userData.get("firstname")+ " "+ userData.get("lastname");

        Assert.assertEquals(expectedFullname,actualFullname);





    }
}
