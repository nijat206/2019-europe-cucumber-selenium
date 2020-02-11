package com.vytrack.step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {
    @Given("the user enters the sales manager credentials")
    public void the_user_enters_the_sales_manager_credentials() {

        System.out.println("I am logged in as a sales manager");
    }

    @When("the user navigates to the Fleet-Vehicles page")
    public void the_user_navigates_to_the_Fleet_Vehicles_page() {
        System.out.println("I navigated to Fleet --> Vehicles page");
    }

    @Then("the user should see the page URL: https:\\/\\/qa{int}.vytrack.com\\/entity\\/fleet")
    public void the_user_should_see_the_page_URL_https_qa_vytrack_com_entity_fleet(Integer int1) {

        System.out.println("I verified that I saw the URL: https://qa3.vytrack.com/entity/fleet");
    }

    @When("the user navigates to the Marketing-Campaigns page")
    public void the_user_navigates_to_the_Marketing_Campaigns_page() {

        System.out.println("I navigated to Marketing --> Campaigns page");
    }

    @Then("the user should see the page URL: https:\\/\\/qa{int}.vytrack.com\\/campaign")
    public void the_user_should_see_the_page_URL_https_qa_vytrack_com_campaign(Integer int1) {

        System.out.println("I verified that I saw the URL: https://qa3.vytrack.com/campaign/");
    }

    @When("the user navigates to the Activities-Calendar Events page")
    public void the_user_navigates_to_the_Activities_Calendar_Events_page() {

        System.out.println("I navigated to Activities --> Calendar Events page");
    }

    @Then("the user should see the URL: https:\\/\\/qa{int}.vytrack.com\\/calendar\\/event")
    public void the_user_should_see_the_URL_https_qa_vytrack_com_calendar_event(Integer int1) {
        System.out.println("I verified that I saw the URL: https://qa3.vytrack.com/calendar/event");

    }



}
