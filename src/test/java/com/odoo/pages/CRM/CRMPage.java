package com.odoo.pages.CRM;

import com.odoo.pages.BasePage;
import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMPage extends BasePage {

//    public CRMPage() {
//        PageFactory.initElements(Driver.get(),this);
//    }

    @FindBy(xpath = "//a[@data-menu='274']")
    public WebElement PipelineButton;
    @FindBy(xpath = "//a[@data-menu='536']")
    public WebElement QuotationsButton;
    @FindBy(xpath = "//a[@data-menu='272']")
    public WebElement CustomersButton;

}
