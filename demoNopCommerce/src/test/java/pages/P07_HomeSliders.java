package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07_HomeSliders {

    WebDriver driver;
    public P07_HomeSliders(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement sliders(String num) {
        return driver.findElement(By.cssSelector("a.nivo-imageLink:nth-child("+1+")"));
    }
}
