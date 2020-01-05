package com.odoo.step_definitions;

import com.odoo.pages.AttendancesPage;
import com.odoo.pages.BasePage;
import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TopMenuStepDefinitions {

    LoginPage loginPage = new LoginPage();
    AttendancesPage attendancesPage = new AttendancesPage();

    @Then("user navigates to {string}")
    public void user_navigates_to(String subModule) {
        loginPage.navigateTo(subModule);
        // BrowserUtils.wait(3); //for demo
    }

    @Then("user verifies that error message")
    public void user_verifies_that_error_message() {
        BrowserUtils.wait(2);
        Assert.assertTrue(attendancesPage.error.getText().contains("Error"));
        System.out.println("Verify error message: " +attendancesPage.error.getText());
    }

}
