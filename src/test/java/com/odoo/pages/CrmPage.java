package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CrmPage extends BasePage{


    @FindBy(css = ".o_column_title")
    public List<WebElement> columnNames;

    public CrmPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public List<String> getColumnNames(List<WebElement> columnNames) {
        List<String> columnList = new ArrayList<>();
        for (WebElement column : columnNames) {
            columnList.add(column.getText());
        }
        return columnList;
    }


}