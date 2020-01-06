package com.odoo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchasesPage extends BasePage {

        public WebElement incomingProducts;


        public WebElement createButton;


        @FindBy(xpath = "//button[contains(text(),'Import')]")
        public WebElement importButton;

        @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[contains(text(),'Save')]")
        public WebElement saveButton;

        @FindBy(xpath = "//button[contains(text(),'Discard')]")
        public WebElement discardButton;

        @FindBy(xpath = "//button[contains(text(),'Discard')]")
        public WebElement reference;
    }
