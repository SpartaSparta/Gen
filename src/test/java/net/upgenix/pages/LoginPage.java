package net.upgenix.pages;

import net.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement email_fld;

    @FindBy(id = "password")
    public WebElement password_fld;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement login_btn;

    public void login(String email, String password){
        email_fld.sendKeys(email);
        password_fld.sendKeys(password);
        login_btn.click();
    }


}
