package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.P04_Search;

public class D04_Search {
    WebDriver driver = Hooks.driver;
    P04_Search search = new P04_Search(driver);

    @When("^user search with a product name like \"(.*)\" in search bar$")
    public void search(String word) {
        search.search(word);
    }

    @Then("results related to the name searched should appear")
    public void search_success() {
        String expectedURL = "https://demo.nopcommerce.com/search?q=apple";
        String actualURL = driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualURL.contains(expectedURL));
        int actual = search.results().size();
        int expected = 2;
        soft.assertEquals(actual,expected);
        soft.assertAll();
    }

    @When("^user search using sku like \"(.*)\"$")
    public void search_sku(String sku) {
        search.search(sku);
    }

    @Then("a product related to the sku searched should appear")
    public void confirm_sku_search() {
        SoftAssert soft2 = new SoftAssert();
        soft2.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"));
        soft2.assertTrue(search.apple_lap().getText().contains("Apple MacBook Pro 13-inch"));
        soft2.assertAll();
    }

}
