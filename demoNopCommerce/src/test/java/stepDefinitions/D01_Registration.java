package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.P01_Registration;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class D01_Registration {
WebDriver driver = Hooks.driver;
//    Hooks hooks = new Hooks();
SoftAssert soft;
P01_Registration regElements = new P01_Registration(driver);


    @And("user go to registration page")
    public void register_page() {
        regElements.registerpage().click();
    }
    @When("user enter valid data")
    public void user_register() throws InterruptedException {
        regElements.register("smelly","cat","smelly.cat.000c@gmail.com","monsters Co.","P@ssw0rd","P@ssw0rd");
        Thread.sleep(3000);
    }
    @And("user click on register button")
    public void user_click_on_register() {
        regElements.registerbutton().click();
    }
   @Then("user should be registered successfully")
    public void registration_success() {
       String actualR = regElements.registration_successful().getText();
       String expectedR = "Your registration completed";
       soft = new SoftAssert();
       soft.assertTrue(actualR.contains(expectedR));
      String color =  regElements.registration_successful().getCssValue("color");
       System.out.println(color);
      soft.assertEquals(color,"rgba(76, 177, 124, 1)");

       soft.assertAll();
   }

}
