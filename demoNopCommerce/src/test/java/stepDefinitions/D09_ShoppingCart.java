package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P09_ShoppingCart;

public class D09_ShoppingCart {
    WebDriver driver = Hooks.driver;
    P09_ShoppingCart cart = new P09_ShoppingCart(driver);

    @When("user add any product to cart")
    public void add_to_cart() throws InterruptedException {
        cart.add_to_cart().click();
        Thread.sleep(1700);
    }


    @Then("the item is added successfully message should appear")
    public void confirmation() {

        Assert.assertTrue(cart.success_msg().getText().contains("The product has been added to your shopping cart"));
    }

    @And("the item is added successfully to user's shopping cart")
    public void confirm2() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        String a = cart.items_num().getText();
        String s = a.replace("(","");
        String r = s.replace(")","");
        int n = Integer.valueOf(r);
        soft.assertTrue(n > 0);

        cart.close().click();
        cart.shopping_cart().click();
        cart.phone_product().isDisplayed();
        soft.assertTrue(cart.phone_product().getText().contains("HTC One M8 Android L 5.0 Lollipop"));
        cart.phone_product().click();
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/htc-one-m8-android-l-50-lollipop"));
        soft.assertAll();
    }

    @When("user add any product to cart and go to product's page")
    public void add_to2() throws InterruptedException {
        cart.add2().click();
        Thread.sleep(3000);
    }

    @And("click on add to cart")
    public void add_to22() throws InterruptedException {
        cart.add22().click();
        Thread.sleep(1700);
    }

    @And("the product is added successfully to user's shopping cart")
    public void final_confirm() throws InterruptedException {

        cart.close().click();
        cart.shopping_cart().click();
        Assert.assertTrue(cart.finale().getText().contains("Apple MacBook Pro 13-inch"));

    }
}
