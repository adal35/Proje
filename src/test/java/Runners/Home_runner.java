package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features= "src/test/resources/Features/",
        glue= "Step_Impl",
        plugin = {
                "pretty",
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },
        dryRun = false,
        tags = "@Smoke"
)
public class Home_runner extends AbstractTestNGCucumberTests{
}
