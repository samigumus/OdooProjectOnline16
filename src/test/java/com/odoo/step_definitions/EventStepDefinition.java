package com.odoo.step_definitions;

import com.odoo.pages.EventPage;
import com.odoo.utilities.BrowserUtils;
import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

public class EventStepDefinition {

    EventPage eventPage = new EventPage();

    @Given("click Create button")
    public void click_Create_button() {
        eventPage.waitUntilLoaderMaskDisappear();
        eventPage.createEventBtn.click();

    }

    @Then("adds new event information:")
    public void adds_new_event_information(List<Map<String, String>> dataTable) {
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.

        eventPage.waitUntilLoaderMaskDisappear();
        for (Map<String, String> map : dataTable) {
            eventPage.eventName.sendKeys(map.get("Event Name"));
            eventPage.startDate.sendKeys(map.get("Start Date"));
            eventPage.endDate.sendKeys(map.get("End Date"));
        }
        BrowserUtils.wait(1); // for demo
    }

    @Then("click Save button")
    public void click_Save_button() {
        eventPage.waitUntilLoaderMaskDisappear();
        eventPage.saveEventBtn.click();
        System.out.println("Event saved");
    }

    @Then("click Confirm Event button")
    public void click_Confirm_Event_button() {
        eventPage.waitUntilLoaderMaskDisappear();
        eventPage.confirmEventBtn.click();
        System.out.println("Event confirmed");

    }
}
