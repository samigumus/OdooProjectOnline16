package com.odoo.step_definitions.CRM;

import com.odoo.pages.CRM.CRMPage;
import com.odoo.pages.CRM.CustomersPage;
import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CustomersStepDefinition {

     LoginPage loginpage = new LoginPage();
     CustomersPage customersPage = new CustomersPage();


//
//    @Given("user is on the login page")
//    public void user_is_on_the_login_page() {
//        System.out.println("I am on the login page");
//        Driver.get().get(ConfigurationReader.getProperty("url"));
//    }
//    @Then("user logs in as event crm manager")
//    public void user_logs_in_as_event_crm_manager() {
//
//        System.out.println("Login as event crm manager");
//        String userName = ConfigurationReader.getProperty("user_name2");
//        String password = ConfigurationReader.getProperty("password2");
//        loginpage.login(userName,password);
//    }

    @Then("user navigates to {string} then to {string}")
    public void user_navigates_to_then_to(String module, String tab) {
        customersPage.navigateTo("CRM");
        System.out.println("I am in CRM module");
        BrowserUtils.wait(3);
        customersPage.navigateToTab("customers");
        System.out.println("I am in customers tab under CRM module");
        BrowserUtils.wait(3);

    }

    @When("user type a exciting customer account into search button and push the enter key")
    public void user_type_a_exciting_customer_account_into_search_button_and_push_the_enter_key() {
        BrowserUtils.wait(3);
customersPage.search_button.sendKeys("Delli1", Keys.ENTER);
        BrowserUtils.wait(4);
    }

    @Then("user should be able to see responding account")
    public void user_should_be_able_to_see_responding_account() {
        Assert.assertTrue("Expected Account is not found by the search button!",customersPage.Delli1AccountFound.isDisplayed());
        BrowserUtils.wait(4);
        System.out.println("Expected Account Delli1 is found by the search button!");

    }

    @When("user type a not exciting customer account into search button and push the enter key")
    public void user_type_a_not_exciting_customer_account_into_search_button_and_push_the_enter_key() {
        BrowserUtils.wait(3);
        customersPage.search_button.sendKeys("Delli123456789", Keys.ENTER);
        BrowserUtils.wait(3);
    }

    @Then("user should be able to see not existing account warning message")
    public void user_should_be_able_to_see_not_existing_account_warning_message() {
        String expectedMsj = "Click to add a contact in your address book.";
        Assert.assertEquals("Unexpected Account is found by the search button!",expectedMsj,customersPage.noSuchAccountMsj.getText());
        BrowserUtils.wait(3);
        System.out.println("Unexpected Account Delli123456789 is not found by the search button!");

    }
}
