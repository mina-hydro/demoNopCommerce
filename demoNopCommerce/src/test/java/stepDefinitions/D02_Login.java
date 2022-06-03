package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_Registration;
import pages.P02_Login;

public class D02_Login {

    WebDriver driver = Hooks.driver;
    P02_Login loginE = new P02_Login(driver);
    P01_Registration regElements = new P01_Registration(driver);

    @And("user go to login page")
    public void go_to_login_page() {
        loginE.login_page().click();
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void log_in(String uname,String pass) throws InterruptedException {
        loginE.login(uname,pass);
        Thread.sleep(3000);
    }

    @And("hit the login button")
    public void hit_login() throws InterruptedException {
        loginE.loginButton().click();
        Thread.sleep(1000);
    }

    @Then("user should be logged in successfully")
    public void logged_in_successful() {
        String expected = "https://demo.nopcommerce.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual,expected);
    }

    @And("user should be directed to home page")
    public void user_home_page() {
        Assert.assertEquals(loginE.myAccount().isDisplayed(),true);
    }
}
