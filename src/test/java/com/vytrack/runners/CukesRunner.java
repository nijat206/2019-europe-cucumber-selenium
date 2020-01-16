package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com/vytrack/step_definitions/",
        //dryRun = true ,
        dryRun = false ,
      //  tags = "@driver and @smoke"
       // tags = {"@driver","@smoke"}
      //  tags = "@driver or @storeManager"
       // tags = "@driver,@storeManager" old
        tags = "@Navigate "
        // tags = {"@login","~@smoke"}  old



)
public class CukesRunner {

}