package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P05_CurrencyChange {

    WebDriver driver = null;
    public P05_CurrencyChange(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public Select currency_dropdown() {
        return new Select(driver.findElement(By.cssSelector("#customerCurrency")));
    }

    public void select_euro() {
        currency_dropdown().selectByVisibleText("Euro");
    }
}
