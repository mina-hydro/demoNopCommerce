package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P06_Hover {
    WebDriver driver;
    public P06_Hover(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement computer_category() {
        return driver.findElement(By.cssSelector("ul.top-menu:nth-child(1) > li:nth-child(1) > a:nth-child(1)"));
    }

    public WebElement desktop(){
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
    }

}
