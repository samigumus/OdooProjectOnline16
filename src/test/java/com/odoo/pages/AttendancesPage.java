package com.odoo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttendancesPage extends BasePage{

    //div[class='o_hr_attendance_kiosk_mode']
    @FindBy(css = "div[class='o_hr_attendance_kiosk_mode']")
    public WebElement error;


}
