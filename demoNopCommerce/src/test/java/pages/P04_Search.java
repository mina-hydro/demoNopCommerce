package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P04_Search {
    WebDriver driver = null;
    public P04_Search(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public List<WebElement> results() {
        return driver.findElements(By.cssSelector(".details"));
    }

    public WebElement search_bar () {
        return driver.findElement(By.cssSelector("#small-searchterms"));
    }
    public WebElement search_button() {
        return driver.findElement(By.cssSelector(".search-box-button"));
    }

    public WebElement apple_lap() {
        return driver.findElement(By.cssSelector(".product-title > a:nth-child(1)"));
    }
    public WebElement currencies() {
       return driver.findElement(By.cssSelector(".price"));
    }
    public void search(String word) {
        search_bar().clear();
        search_bar().sendKeys(word);
        search_button().click();
    }
}
