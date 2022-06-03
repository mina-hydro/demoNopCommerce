package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.P08_FollowUs;

import java.util.ArrayList;

public class D08_FollowUs {

    WebDriver driver = Hooks.driver;
    P08_FollowUs follow = new P08_FollowUs(driver);

    @When("^user click on \"(.*)\" icon$")
    public void follow(String website) {
        follow.website(website).click();
    }

    @Then("^user should be redirected to \"(.*)\" in new tap$")
    public void confitm_it(String link) throws InterruptedException {
        Thread.sleep(2000);
        //redirection succeed assertion step
        //redirection happened in new tap assertion step
        driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(1));
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains(link));
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(0));

    }
}
