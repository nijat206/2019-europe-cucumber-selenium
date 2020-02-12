package com.vytrack.step_definitions;


import com.vytrack.pages.ContactInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @Given("The sales manager should be main page")
    public void the_sales_manager_should_be_main_page() {
        System.out.println("The sales manager should be main page");
    }

    @When("the sales manager should be able to navigate Fleet --> Vehicles modules")
    public void the_sales_manager_should_be_able_to_navigate_Fleet_Vehicles_modules() {
        System.out.println("the sales manager should be able to navigate Fleet --> Vehicles modules");
    }

    @Then("the sales manager should see correct page url")
    public void the_sales_manager_should_see_correct_page_url() {
        System.out.println("the sales manager should see correct page url");
    }

    @When("the sales manager should be able to navigate Marketing --> Campaigns modules")
    public void the_sales_manager_should_be_able_to_navigate_Marketing_Campaigns_modules() {
        System.out.println("the sales manager should be able to navigate Marketing --> Campaigns modules");
    }

    @When("the sales manager should be able to navigate Activities --> Calendar Events modules")
    public void the_sales_manager_should_be_able_to_navigate_Activities_Calendar_Events_modules() {
        System.out.println("the sales manager should be able to navigate Activities --> Calendar Events modules");
    }


    @When("the user navigates {string} {string}")
    public void the_user_navigates(String tab, String module) {
        new DashboardPage().navigateToModule(tab, module);

    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer ePageNumber) {
        ContactsPage contactsPage = new ContactsPage();

        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(actualNumber, ePageNumber);
    }
}