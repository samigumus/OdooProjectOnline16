package com.odoo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventPage extends BasePage {

    @FindBy(css = "button[class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createEventBtn; // create new event from default page

    @FindBy(css = "button[class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveEventBtn;

    @FindBy(css = "button[class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement discardEventBtn;

    @FindBy(css = "button[class='btn btn-sm btn-default oe_highlight']")
    public WebElement confirmEventBtn;

    @FindBy(css = "button[class='btn btn-sm btn-default']")
    public WebElement cancelEventBtn; // 2 type of button: 1 is "Cancel Event". 2 is after cancel event "Set To Draft" button.

    @FindBy(css = "button[class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editEventBtn;

    @FindBy(css = "button[class='btn btn-default btn-sm o_form_button_create']")
    public WebElement createInEventBtn; // create new event from inside of any event

    @FindBy(css = "input[class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement eventName;

    @FindBy(css = "input[name='date_begin']")
    public WebElement startDate;

    @FindBy(css = "input[name='date_end']")
    public WebElement endDate;

}
