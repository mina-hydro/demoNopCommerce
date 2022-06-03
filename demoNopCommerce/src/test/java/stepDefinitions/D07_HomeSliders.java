package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.util.TimeUtils;
import pages.P07_HomeSliders;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D07_HomeSliders {
    WebDriver driver = Hooks.driver;
    P07_HomeSliders home = new P07_HomeSliders(driver);

    @When("^user click on slider \"(.*)\"$")
    public void select_slider(String num) {
        home.sliders(num).click();
    }
    @Then("user should be directed to page with relative products")
    public void confirmation_step() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertTrue(wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/nokia-lumia-1020")));
    }

    @Then("user should be directed to page with relative products to second slider")
    public void confirmation_step_scenario2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertTrue(wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/iphone-6")));
    }
}
