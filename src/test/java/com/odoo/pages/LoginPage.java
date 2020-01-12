package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;


    @FindBy(css = ".btn.btn-primary")
    public WebElement loginBtn;

    public void login(String userName, String Password){
        email.sendKeys(userName);
        //Keys.ENTER to replace login click
        password.sendKeys(Password, Keys.ENTER);
    }
}
