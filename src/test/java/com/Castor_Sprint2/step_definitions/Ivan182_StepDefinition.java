package com.Castor_Sprint2.step_definitions;

import com.Castor_Sprint2.pages.Ivan182_Pages;
import com.Castor_Sprint2.pages.LoginPage;
import com.Castor_Sprint2.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Ivan182_StepDefinition {

    LoginPage loginPage = new LoginPage();
    Ivan182_Pages ivan182_pages = new Ivan182_Pages();


    @Given("Store manager is logged in as Store manager and on home page")
    public void store_manager_is_logged_in_as_store_manager_and_on_home_page() {
        loginPage.login("storemanager77","UserUser123");
        BrowserUtils.sleep(5);
    }
    @When("Store manager click on Fleet")
    public void store_manager_click_on_fleet() {
        BrowserUtils.hover(ivan182_pages.button_Fleet);
    }
    @When("Store manager click on Vehicles Model")
    public void store_manager_click_on_vehicles_model() {
        ivan182_pages.button_VehicleModel.click();
    }
    @Then("Store manager sees  moduls")
    public void storeManagerSeesModuls() {

        BrowserUtils.sleep(5);


        Assert.assertTrue(ivan182_pages.modules_10.get(2).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(3).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(4).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(5).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(6).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(7).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(8).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(9).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(10).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(11).isDisplayed());




    }








//-------------------------------------------------------------------------

    @Given("Sales manager is logged in as Store manager and on home page")
    public void sales_manager_is_logged_in_as_store_manager_and_on_home_page() {
        loginPage.login("salesmanager140","UserUser123");
        BrowserUtils.sleep(7);
    }
    @When("Sales manager click on Fleet")
    public void sales_manager_click_on_fleet() {

       BrowserUtils.hover(ivan182_pages.button_Fleet);
    }
    @When("Sales manager click on Vehicles Model")
    public void sales_manager_click_on_vehicles_model() {
        ivan182_pages.button_VehicleModel.click();
        BrowserUtils.sleep(5);
    }

    @Then("Sales manager sees moduls")
    public void salesManagerSeesModuls() {

        BrowserUtils.sleep(5);


        Assert.assertTrue(ivan182_pages.modules_10.get(2).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(3).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(4).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(5).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(6).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(7).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(8).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(9).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(10).isDisplayed());
        Assert.assertTrue(ivan182_pages.modules_10.get(11).isDisplayed());

    }


    @When("Driver click on Fleet")
    public void driverClickOnFleet() {
        BrowserUtils.hover(ivan182_pages.buttonfleetDriver);
    }

    @And("Driver click on Vehicles Model")
    public void driverClickOnVehiclesModel() {
        ivan182_pages.button_VehicleModel.click();
    }

    @Then("Driver sees a message You do not have permission to perform this action.")
    public void driverSeesAMessageYouDoNotHavePermissionToPerformThisAction() {
    String actual = ivan182_pages.error_Message.getText();
    String expected = "You do not have permission to perform this action.";
    Assert.assertEquals(actual,expected);
    }
}
