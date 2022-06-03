package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.P03_ResetPassword;

public class D03_ResetPassword {
    WebDriver driver = Hooks.driver;
    P03_ResetPassword resetPassword = new P03_ResetPassword(driver);

    @When("user click on 'forgot password'")
    public void forget_passwrd () {
        resetPassword.forgot_password().click();
    }

    @And("^enter his valid email \"(.*)\" and click on \"recover\" button")
    public void reset_password(String mail) throws InterruptedException {
        resetPassword.rest_password(mail);
        Thread.sleep(3000);
    }

    @Then("email with instructions should be sent to him")
    public void recover_messsage(){
        String acual = resetPassword.recover_msg().getText();
        String expected = "Email with instructions has been sent to you";
        Assert.assertTrue(acual.contains(expected));
    }
}
