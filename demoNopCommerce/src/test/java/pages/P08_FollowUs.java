package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class P08_FollowUs {

    WebDriver driver;

    public P08_FollowUs(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement website(String website){
        return driver.findElement(By.cssSelector("."+website+" > a:nth-child(1)"));
    }



}
