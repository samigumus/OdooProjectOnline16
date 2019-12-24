package com.odoo.step_definitions;

import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinition {

    LoginPage loginpage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as pos manager")
    public void user_logs_in_as_pos_manager() {

        System.out.println("Login as pos manager");
        String userName = ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");
        loginpage.login(userName,password);

    }

    @Then("user logs in as event manager")
    public void user_logs_in_as_event_manager() {

        System.out.println("Login as event manager");
        String userName = ConfigurationReader.getProperty("user_name2");
        String password = ConfigurationReader.getProperty("password2");
        loginpage.login(userName,password);
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {


        BrowserUtils.wait(4);
        Assert.assertEquals(string, loginpage.getPageSubTitle());
        System.out.println("Verifying page subtitle: " + string);

    }


}
