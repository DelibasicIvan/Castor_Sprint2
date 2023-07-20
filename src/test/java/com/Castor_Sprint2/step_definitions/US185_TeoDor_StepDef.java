package com.Castor_Sprint2.step_definitions;

import com.Castor_Sprint2.pages.TeoDor_QL_Page;
import com.Castor_Sprint2.utilities.BrowserUtils;
import com.Castor_Sprint2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US185_TeoDor_StepDef {
    TeoDor_QL_Page CalendarPage = new TeoDor_QL_Page ();
    Actions actions = new Actions(Driver.getDriver());


    @Then("user hover on {string} button")
    public void user_hover_on_button(String activities) {
        actions.moveToElement(CalendarPage.activitiesBTN).click();
        CalendarPage.activitiesBTN.click();
    }

    @Then("user click {string} button")
    public void user_click_button(String calendarEvents) {
        BrowserUtils.waitForClickablility(CalendarPage.calendarEvents, 20);
        actions.moveToElement(CalendarPage.calendarEvents).click().perform();
    }
    @Then("user click create {string} button")
    public void user_click_create_button(String createNewEvent) {
        BrowserUtils.waitForClickablility(CalendarPage.createEvent, 20);
        Assert.assertTrue(CalendarPage.createEvent.isDisplayed());
        CalendarPage.createEvent.click();
    }
    @Then("user see {string} checkbox and click it")
    public void user_see_checkbox_and_click_it(String checkbox) {
        BrowserUtils.waitForClickablility(CalendarPage.repeatBox, 20);
        Assert.assertTrue(CalendarPage.repeatBox.isDisplayed());
        CalendarPage.repeatBox.click();
    }
    @Then("user see {string} button with value {int} by default")
    public void user_see_button_with_value_by_default(String actual, Integer num) {
        BrowserUtils.waitForVisibility(CalendarPage.repeatEveryValue, 10);
        CalendarPage.repeatEveryValue.isDisplayed();
        String actualValue = CalendarPage.repeatEveryValue.getAttribute("Value");
        String expectedValue = "1";
        //System.out.println("value = " + actualValue);
        Assert.assertTrue(actualValue.equals(expectedValue));
    }
    @When("user delete number {string} in checkbox")
    public void user_delete_number_in_checkbox(String deleteNum) {
        CalendarPage.repeatEveryValue.clear();
    }
    @Then("user see error message : {string}")
    public void user_see_error_message(String errorMSG) {
        CalendarPage.errorMsg.isDisplayed();
        String expected = "This value should not be blank.";
        String actual = CalendarPage.errorMsg.getText();
        Assert.assertEquals(expected,actual);
    }

}
