package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println(" \t this is coming form Before ");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @After("@store-manager")
    public void tearDownStoreManager() {
        System.out.println("\t this is coming form After store manager");
        System.out.println("\t --------------------------");

    }
}
