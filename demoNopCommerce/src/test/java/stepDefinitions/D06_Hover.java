package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.P06_Hover;

public class D06_Hover {
    WebDriver driver = Hooks.driver;
    P06_Hover hover = new P06_Hover(driver);

    @When("user hover on any category")
    public void hover_on_category() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(hover.computer_category()).perform();
        Thread.sleep(3000);
    }

    @And("select an subcategory")
    public void select_subcategory(){
       String desktops = hover.desktop().getText().toLowerCase().trim();
        System.out.println(desktops);
        Assert.assertTrue(desktops.contains("desktops"));
        hover.desktop().click();
    }

    @Then("user should be directed to that sub category")
    public void confirmation() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/desktops";
        Assert.assertTrue(actualURL.contains(expectedURL));
    }
}
