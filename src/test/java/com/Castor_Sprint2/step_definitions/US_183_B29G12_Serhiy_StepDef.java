package com.Castor_Sprint2.step_definitions;

import com.Castor_Sprint2.pages.US_183_B29G12_Serhiy_VehiclePage;
import com.Castor_Sprint2.utilities.BrowserUtils;
import com.Castor_Sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_183_B29G12_Serhiy_StepDef {

    US_183_B29G12_Serhiy_VehiclePage us06_b2912_183_serhiy_vehiclePage = new US_183_B29G12_Serhiy_VehiclePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("the user hovers over the Fleet option as first option from the main menu")
    public void theUserHoversOverTheFleetOptionAsFirstOptionFromTheMainMenu() {
        wait.until(ExpectedConditions.visibilityOf(us06_b2912_183_serhiy_vehiclePage.menuOptions.get(0)));
        BrowserUtils.hover(us06_b2912_183_serhiy_vehiclePage.menuOptions.get(0));

    }

    @When("user hovers over the Fleet option from the main menu")
    public void userHoversOverTheFleetOptionFromTheMainMenu(){

        wait.until(ExpectedConditions.visibilityOf(us06_b2912_183_serhiy_vehiclePage.menuOptions.get(1)));
        BrowserUtils.hover(us06_b2912_183_serhiy_vehiclePage.menuOptions.get(1));
    }



    @And("the user clicks the Vehicles option from the dropdown menu")
    public void theUserClicksTheVehiclesOptionFromTheDropdownMenu() throws InterruptedException {


        us06_b2912_183_serhiy_vehiclePage.vehiclesOption.click();
        Thread.sleep(1000);


    }
    @When("the user hovers over the ... dots icon in the right side of the page across each car selection")
    public void the_user_hovers_over_the_dots_icon_in_the_right_side_of_the_page_across_each_car_selection() throws InterruptedException {

        Thread.sleep(1000);
        BrowserUtils.hover(us06_b2912_183_serhiy_vehiclePage.dotsElement);

    }
    @Then("user sees the view, edit, delete icons from the pop-up menu")
    public void user_sees_the_view_edit_delete_icons_from_the_pop_up_menu() throws InterruptedException {

        Thread.sleep(1000);
        BrowserUtils.hover(us06_b2912_183_serhiy_vehiclePage.viewOption);
        Thread.sleep(1000);
        Assert.assertTrue(us06_b2912_183_serhiy_vehiclePage.viewOption.isDisplayed());

        BrowserUtils.hover(us06_b2912_183_serhiy_vehiclePage.editOption);
        Thread.sleep(1000);
        Assert.assertTrue(us06_b2912_183_serhiy_vehiclePage.editOption.isDisplayed());

        BrowserUtils.hover(us06_b2912_183_serhiy_vehiclePage.deleteOption);
        Thread.sleep(1000);
        Assert.assertTrue(us06_b2912_183_serhiy_vehiclePage.deleteOption.isDisplayed());
    }
}
