package com.odoo.pages.CRM;

import com.odoo.pages.BasePage;
import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage extends CRMPage {
    public CustomersPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(className = "o_searchview_input")
    public WebElement search_button;
    @FindBy(css = "div[class='oe_kanban_global_click o_res_partner_kanban o_kanban_record']")
    public WebElement Delli1AccountFound;
    @FindBy(className = "oe_view_nocontent_create")
    public WebElement noSuchAccountMsj;




}
