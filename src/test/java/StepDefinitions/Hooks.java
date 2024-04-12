package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Hooks {
    @After
    public void after(Scenario scenario){
        // taking screenshot
        if(scenario.isFailed()){
// The following section is only activated if the extent report plugin is enabled.
//            TakesScreenshot ts = (TakesScreenshot) GWD.getDriver();
//            byte[] output = ts.getScreenshotAs(OutputType.BYTES);
//            scenario.attach(output,"image/png","screenshot name");
        }
        GWD.quitDriver();
    }
}