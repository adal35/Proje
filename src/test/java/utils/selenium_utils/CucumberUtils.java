package utils.selenium_utils;


import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Step_Impl.Hooks;
import utils.DateUtils;
import utils.Driver;

public class CucumberUtils {
    //private static WebDriver driver = Driver.getDriver();

    public static void logInfo(String msg, boolean takeScreenshot){
        Scenario scenario = Hooks.currentScenario;
        scenario.write(DateUtils.currentDateTime() + " INFO: " + msg);

        if (takeScreenshot)
            scenario.embed(((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
    }


}
