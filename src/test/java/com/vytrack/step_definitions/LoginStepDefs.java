package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I opened the browser and navigate to qa3.vytrack.com");
        System.out.println();

    }

    @When("the users enter the driver information")
    public void the_users_enter_the_driver_information() {
        System.out.println("I entered user1 and UserUser123");

        System.out.println();
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        System.out.println(" I verified that i see the dashboard page");
        System.out.println("-----------------------------------------------");
        System.out.println();
    }

    @When("the users enter the sales manger information")
    public void the_users_enter_the_sales_manger_information() {

        System.out.println("I entered Sales manger 123 and UserUser123");
        System.out.println();
    }

    @When("the users enter the store manger information")
    public void the_users_enter_the_store_manger_information() {
        System.out.println(" I entered Store Manager 123");
        System.out.println();
    }
}
