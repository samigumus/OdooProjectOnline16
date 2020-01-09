package com.odoo.pages.CRM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCustomersPage extends CRMPage {

    @FindBy(className = "btn btn-primary btn-sm o-kanban-button-new btn-default")
    public WebElement CustomersCreateButton;
    @FindBy(css = "input[id='radio229_person']")
    public WebElement IndividualButton;
    @FindBy(css = "input[id='radio229_company']")
    public WebElement CompanyButton;
    @FindBy(className = "fa fa-pencil fa-lg pull-left o_select_file_button")
    public WebElement imageEditHoverButton;
    @FindBy(className = "fa fa-trash-o fa-lg pull-right o_clear_file_button")
    public WebElement imageClearHoverButton;
    @FindBy(className = "o_field_char o_field_widget o_input o_required_modifier")
    public WebElement nameinput;
    @FindBy(id = "o_field_input_232")
    public WebElement companyinput;
    /*
     Please skip adding Company name, it creates new company
     We dont need it when creating individual account
    */
    @FindBy(css = "input[id='o_field_input_235']")
    public WebElement streetInput1;
    @FindBy(css = "input[id='o_field_input_236']")
    public WebElement streetInput2;
    @FindBy(css = "input[id='o_field_input_237']")
    public WebElement cityInput;
    @FindBy(css = "input[id='o_field_input_238']")
    public WebElement stateInput;
    @FindBy(css = "input[id='o_field_input_239']")
    public WebElement zipInput;
    @FindBy(css = "input[id='o_field_input_38']")
    public WebElement countryInput;
    @FindBy(css = "input[id='o_field_input_39']")
    public WebElement TINInput;
    @FindBy(css = "input[id='o_field_input_40']")
    public WebElement tagsInput;
    @FindBy(css = "input[id='o_field_input_41']")
    public WebElement jobPositionInput;
    @FindBy(css = "input[id='o_field_input_42']")
    public WebElement phoneInput;
    @FindBy(css = "input[id='o_field_input_43']")
    public WebElement mobileInput;
    @FindBy(css = "input[id='o_field_input_45']")
    public WebElement emailInput;
    @FindBy(css = "input[id='o_field_input_46']")
    public WebElement websiteInput;
    @FindBy(css = "input[id='o_field_input_47']")
    public WebElement titleInput;
    @FindBy(css = "input[id='o_field_input_48']")
    public WebElement languageDropDown;
    @FindBy(css = "option[value='\"en_US\"']")
    public WebElement englishOption;
    @FindBy(className = "btn btn-primary btn-sm o-kanban-button-new")
    public WebElement CreateButton;
    @FindBy(linkText = "Contacts & Addresses")
    public WebElement contactsAndAddressesTab;
    @FindBy(linkText = "Internal Notes")
    public WebElement internalNotesTab;
    @FindBy(linkText = "Sales & Purchases")
    public WebElement salesAndPurchasesTab;
    @FindBy(css = "input[id='o_field_input_60']")
    public WebElement isACustomer;
    @FindBy(css = "input[id='o_field_input_61']")
    public WebElement salesPerson;
    @FindBy(css = "input[id='o_field_input_64']")
    public WebElement salePriselist;
    @FindBy(css = "input[id='o_field_input_65']")
    public WebElement isAVendor;
    @FindBy(css = "input[id='o_field_input_66']")
    public WebElement internalReferance;
    @FindBy(css = "input[id='o_field_input_69']")
    public WebElement barcode;
    @FindBy(css = "input[id='o_field_input_274']")
    public WebElement contactNameUnderCreateContacts;
    @FindBy(css = "input[id='o_field_input_275']")
    public WebElement titleUnderCreateContacts;
    @FindBy(css = "input[id='o_field_input_276']")
    public WebElement jobPositionUnderCreateContacts;
    @FindBy(css = "input[id='o_field_input_277']")
    public WebElement emailUnderCreateContacts;
    @FindBy(css = "input[id='o_field_input_278']")
    public WebElement phoneUnderCreateContacts;
    @FindBy(css = "input[id='o_field_input_279']")
    public WebElement mobileUnderCreateContacts;
    @FindBy(css = "input[id='o_field_input_280']")
    public WebElement notesUnderCreateContacts;
    @FindBy(linkText = "Save  & Close")
    public WebElement SaveAndCloseUnderCreateContacts;
    @FindBy(linkText = "Save & New")
    public WebElement SaveAndNewUnderCreateContacts;
    @FindBy(className = "btn btn-primary btn-sm o_form_button_save")
    public WebElement SAVE;
    @FindBy(className = "btn btn-default btn-sm o_form_button_cancel")
    public WebElement DISCARD;


    public void stateInput(String state) {
        stateInput.sendKeys(state, Keys.ENTER);
    }




}
