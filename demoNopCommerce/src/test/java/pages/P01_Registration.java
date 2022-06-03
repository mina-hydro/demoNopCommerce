package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class P01_Registration {
   public String emaila = new Random().nextInt()+"smelly.cat.40s.0c@gmail.com";
    WebDriver driver = null;
    public P01_Registration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
 public WebElement registerpage() {
        return driver.findElement(By.cssSelector(".ico-register"));
 }
    @FindBy(css = "input[type='radio']")
    WebElement gender;

    @FindBy(id = "FirstName")
    WebElement firstname;

    @FindBy(id = "LastName")
    WebElement lastname;

     @FindBy(css = ".date-picker-wrapper > select:nth-child(1) > option:nth-child(5)")
     WebElement day;

    @FindBy(css = ".date-picker-wrapper > select:nth-child(2) > option:nth-child(4)")
    WebElement month;

    @FindBy(css = ".date-picker-wrapper > select:nth-child(3) > option:nth-child(3)")
    WebElement year;

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Company")
    WebElement company;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmpassword;

//    @FindBy(css = "#register-button")
//    WebElement registerbutton;
    public WebElement registerbutton() {
        return driver.findElement(By.cssSelector("#register-button"));
    }
    public WebElement registration_successful() {
        return driver.findElement(By.cssSelector("div[class='result']"));
    }

    public void register(String fName,String lName,String email,String company,String pass,String cPass) {
        gender.click();
        firstname.sendKeys(fName);
        lastname.sendKeys(lName);
        day.click();
        month.click();
        year.click();
        this.email.sendKeys(email);
        this.company.sendKeys(company);
        password.sendKeys(pass);
        confirmpassword.sendKeys(cPass);

    }
    public void oop() {
        gender.click();
        firstname.sendKeys("fName");
        lastname.sendKeys("lName");
    }
}
