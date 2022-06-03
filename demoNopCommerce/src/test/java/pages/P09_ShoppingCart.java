package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P09_ShoppingCart {

    WebDriver driver;
    public P09_ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement add_to_cart() {
        return driver.findElement(By.cssSelector("div.item-grid:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)"));

    }

    public WebElement shopping_cart() {
        return driver.findElement(By.cssSelector(".ico-cart"));
    }

    public WebElement add2() {
        return driver.findElement(By.cssSelector("div.item-grid:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)"));
    }
    public WebElement finale() {
        return driver.findElement(By.cssSelector(".cart > tbody:nth-child(3) > tr:nth-child(2) > td:nth-child(3) > a:nth-child(1)"));
    }
    public WebElement close() {
        return driver.findElement(By.cssSelector(".close"));
    }

    public WebElement add22() {
        return driver.findElement(By.cssSelector("#add-to-cart-button-4"));
    }

    public WebElement success_msg() {
        return driver.findElement(By.cssSelector(".content"));
    }

    public WebElement items_num() {
        return driver.findElement(By.cssSelector(".cart-qty"));
    }

    public WebElement phone_product() {
        return driver.findElement(By.cssSelector(".product-name"));
    }



}
