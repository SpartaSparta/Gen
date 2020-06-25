package net.upgenix.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.upgenix.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setUpScenario(){
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @After
    public void tearDownScenario(){
        Driver.closeDriver();
    }
}
