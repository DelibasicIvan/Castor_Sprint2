package com.Castor_Sprint2.step_definitions;

import com.Castor_Sprint2.pages.TeoDor_QL_Pages;
import com.Castor_Sprint2.utilities.BrowserUtils;
import com.Castor_Sprint2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class US179_TeoDor_StepDef {
    TeoDor_QL_Pages vytrackQuickLaunchpad = new TeoDor_QL_Pages();

    @When("user click {string} icon")
    public void user_click_icon(String mark) {


//        BrowserUtils.waitForClickablility(vytrackQuickLaunchpad.qsign,15);
//        vytrackQuickLaunchpad.qsign.click();
//
        if (mark.equalsIgnoreCase("questionMark")) {
            BrowserUtils.waitForClickablility(vytrackQuickLaunchpad.qsign, 15);
            vytrackQuickLaunchpad.qsign.click();
        }else if (mark.equalsIgnoreCase("recentEmails")){
            vytrackQuickLaunchpad.recentEmails.click();
        }
    }

    @Then("user should be redirected to the {string} page")
    public void user_should_be_redirected_to_the_page(String expectedURL) {

        Set<String> windowIDs = Driver.getDriver().getWindowHandles();
        for (String eachWindow : windowIDs) {
            Driver.getDriver().switchTo().window(eachWindow);
        }
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedURL));

    }


}
