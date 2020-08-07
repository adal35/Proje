package utils.selenium_utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Step_Impl.Hooks;
import utils.DateUtils;
import utils.Driver;

public class Screenshots{
    private static WebDriver driver = Driver.getDriver();

    public static void captureScreenShot(){
        String date = DateUtils.currentDateTime();
        Scenario currentScenario = Hooks.currentScenario;

        try {
            currentScenario.write("Current Page URL is " + driver.getCurrentUrl());
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            currentScenario.embed(screenshot, "image/png");  // Stick it in the report
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
