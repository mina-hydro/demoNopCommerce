package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P10_Wishlist {

    WebDriver driver;
    public P10_Wishlist(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement success_msg() {
        return driver.findElement(By.cssSelector(".content"));
    }

    public WebElement item_count() {
        return driver.findElement(By.cssSelector(".wishlist-qty"));
    }

    public WebElement wishlist1() {
        return driver.findElement(By.cssSelector("div.item-grid:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(3)"));
    }

    public WebElement the_wish_list(){
        return driver.findElement(By.cssSelector(".ico-wishlist"));
    }

    public WebElement in_wishlist_1() {
        return driver.findElement(By.cssSelector(".product-name"));
    }

    public WebElement in_wish_list_2(){
        return driver.findElement(By.cssSelector("div.item-grid:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(3)"));

    }
    public WebElement close3() {
        return driver.findElement(By.cssSelector(".close"));
    }

    public WebElement in_wish_22() {
        return driver.findElement(By.cssSelector("#add-to-wishlist-button-4"));
    }
    public WebElement mac_lap() {
        return driver.findElement(By.cssSelector(".cart > tbody:nth-child(3) > tr:nth-child(2) > td:nth-child(4) > a:nth-child(1)"));
    }

}
