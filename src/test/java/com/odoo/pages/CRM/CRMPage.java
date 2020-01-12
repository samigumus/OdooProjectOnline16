package com.odoo.pages.CRM;

import com.odoo.pages.BasePage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CRMPage extends BasePage {

    public CRMPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@data-menu='274']")
    public WebElement PipelineButton;
    @FindBy(xpath = "//a[@data-menu='536']")
    public WebElement QuotationsButton;
    @FindBy(xpath = "//a[@data-menu='272']")
    public WebElement CustomersButton;

    public void navigateToTab(String TabName){
        switch (TabName){
            case "pipeline":
                BrowserUtils.clickWithWait(PipelineButton);
                break;
            case "quotations":
                BrowserUtils.clickWithWait(QuotationsButton);
                break;
            case "customers":
                BrowserUtils.clickWithWait(CustomersButton);
                break;
            default:
                throw new NoSuchElementException("Invalid Tab Name!");
        }
    }

    @FindBy(css = ".o_column_title")
    public List<WebElement> columnNames;

    public List<String> getColumnNames(List<WebElement> columnNames) {
        List<String> columnList = new ArrayList<>();
        for (WebElement column : columnNames) {
            columnList.add(column.getText());
        }
        return columnList;
    }
}
