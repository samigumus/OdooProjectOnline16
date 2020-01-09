package com.odoo.step_definitions;

import com.odoo.pages.CRM.CRMPage;
import com.odoo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class CrmStepDefinitions {

    CRMPage crm_page = new CRMPage();
    /*
    @Then("user navigates to {string} module")
    public void user_navigates_to_module(String moduleName) {
       crm_page.navigateTo(moduleName);
       System.out.println("You are on " + moduleName + " module!");
       BrowserUtils.wait(2);

   }
    */


    @Then("user verifies, that columns name columnNames are display")
    public void user_verifies_that_columns_name_columnNames_are_display(List<String> dataTable) {

        BrowserUtils.wait(3);

        Assert.assertEquals(dataTable, crm_page.getColumnNames(crm_page.columnNames));

    }

}

