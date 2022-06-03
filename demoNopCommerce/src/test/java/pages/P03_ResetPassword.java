package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_ResetPassword {
    WebDriver driver;

    public P03_ResetPassword(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement forgot_password() {
       return driver.findElement(By.cssSelector(".forgot-password > a:nth-child(1)"));
    }

    public WebElement recover_msg(){
        return driver.findElement(By.cssSelector(".content"));
    }

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(css = "button.button-1:nth-child(1)")
    WebElement recover_button;


    public void rest_password(String email) {
        this.email.clear();
        this.email.sendKeys(email);
        recover_button.click();


    }
}
