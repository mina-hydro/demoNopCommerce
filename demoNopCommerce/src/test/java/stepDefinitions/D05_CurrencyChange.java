package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.P04_Search;
import pages.P05_CurrencyChange;

public class D05_CurrencyChange {
    WebDriver driver = Hooks.driver;
    P05_CurrencyChange changeCurrency = new P05_CurrencyChange(driver);

    @When("user select euro from currency dropdown")
    public void Change_Currency() {
        changeCurrency.select_euro();
    }

    @Then("the currency should be changed to euro")
    public void confirm_changes(){
        P04_Search search = new P04_Search(driver);
        search.search("mac");
         String actual = search.currencies().getText();
         String expected = "€";
        Assert.assertTrue(actual.contains(expected));
    }
}
