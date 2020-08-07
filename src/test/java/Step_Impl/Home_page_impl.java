package Step_Impl;

import Pages.Home_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import utils.Driver;
import utils.selenium_utils.SeleniumUtils;

public class Home_page_impl {

   Home_page home_page=new Home_page();
    private static WebDriver driver = Driver.getDriver();

    @Given("User navigates to Google home page")
    public void user_navigates_to_Google_home_page() {
        driver.navigate().to("https://www.google.com");
    }

    @When("User searches for something")
    public void user_searches_for_something() {
        SeleniumUtils.sendKeys(home_page.text_button,"Hello World");
        SeleniumUtils.sendKeys(home_page.text_button, Keys.ENTER.toString());
    }

    @Then("Verifies that")
    public void verifies_that() {
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[1]")).getText(),"All");
    }

}
