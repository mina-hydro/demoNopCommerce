package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P10_Wishlist;

public class D10_Wishlist {
    WebDriver driver = Hooks.driver;
    P10_Wishlist wish = new P10_Wishlist(driver);

    @When("user click on the heart icon below the product to add it to wishlist")
    public void add_to_wishlist1() {
        wish.wishlist1().click();
    }

    @Then("\"the product has been added successfully\" message appear")
    public void confirm_msg() throws InterruptedException {
        Thread.sleep(1700);
        Assert.assertTrue(wish.success_msg().getText().contains("The product has been added to your wishlist"));
    }

    @And("the product should be added to the wishlist")
    public void inside_wishlist() throws InterruptedException {

        SoftAssert soft = new SoftAssert();
        System.out.println(wish.item_count().getText());
        soft.assertTrue(wish.item_count().getText().contains("(1)"));
        wish.close3().click();
        wish.the_wish_list().click();
        System.out.println(wish.in_wishlist_1().getText());
        soft.assertTrue(wish.in_wishlist_1().getText().contains("HTC One M8 Android L 5.0 Lollipop"));
        soft.assertAll();
    }

    @When("user click on the heart icon below the product to add it to wishlist with need to go to product's page")
    public void Wish2() {
        wish.in_wish_list_2().click();
    }

    @And("click on it again in the product's page")
    public void wish22() throws InterruptedException {
        Thread.sleep(2000);
        wish.in_wish_22().click();
    }

    @And("the product chosen should be added to the wishlist")
    public void wish2() throws InterruptedException {

        wish.close3().click();
        wish.the_wish_list().click();
        Assert.assertTrue(wish.mac_lap().getText().contains("Apple MacBook Pro 13-inch"));
    }
}
