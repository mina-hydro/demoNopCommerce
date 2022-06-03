package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {
    WebDriver driver;

    public P02_Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement login_page() {
        return driver.findElement(By.cssSelector(".ico-login"));
    }

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    public WebElement loginButton() {
        return driver.findElement(By.cssSelector(".login-button"));
    }

    public WebElement myAccount() {
        return driver.findElement(By.cssSelector(".ico-account"));
    }

    public void login(String email,String password) {
        this.email.clear();
        this.email.sendKeys(email);
        this.password.clear();
        this.password.sendKeys(password);

    }


}
