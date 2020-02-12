package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){

        System.out.println(" \t this is coming form Before ");
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
       if(scenario.isFailed()){
           final byte[] screenshot= ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);

       }
        Driver.closeDriver();
    }

}
