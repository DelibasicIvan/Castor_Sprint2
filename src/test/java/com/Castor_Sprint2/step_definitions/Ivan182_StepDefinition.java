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
        BrowserUtils.sleep(7);
    }
    @When("Store manager click on Fleet")
    public void store_manager_click_on_fleet() {
        ivan182_pages.button_Fleet.click();
    }
    @When("Store manager click on Vehicles Model")
    public void store_manager_click_on_vehicles_model() {
        ivan182_pages.button_VehicleModel.click();
    }
    @Then("Store manager sees  modelName")
    public void store_manager_sees_model_name() {
        String actual = ivan182_pages.modelName.getText();
        String expected = "Model Name";
        Assert.assertEquals(actual,expected);
    }
    @Then("Store manager sees  make")
    public void store_manager_sees_make() {
        String actual = ivan182_pages.make.getText();
        String expected = "Make";
        Assert.assertEquals(actual,expected);
    }
    @Then("Store manager sees  canBeRequested")
    public void store_manager_sees_can_be_requested() {
        String actual = ivan182_pages.canBeRequested.getText();
        String expected = "Can be requested";
        Assert.assertEquals(actual,expected);
    }
    @Then("Store manager sees  cVVI")
    public void store_manager_sees_c_vvi() {
        String actual = ivan182_pages.cVVI.getText();
        String expected = "CVVI";
        Assert.assertEquals(actual,expected);
    }
    @Then("Store manager sees  cO2_FEE_MONTH")
    public void store_manager_sees_c_o2_fee_month() {
        String actual = ivan182_pages.cO2_FEE_MONTH.getText();
        String expected = "CO2 Fee (/month)";
        Assert.assertEquals(actual,expected);
    }
    @Then("Store manager sees  cost_DEPRECIATED")
    public void store_manager_sees_cost_depreciated() {
        String actual = ivan182_pages.cost_DEPRECIATED.getText();
        String expected = "Cost (Depreciated)";
        Assert.assertEquals(actual,expected);
    }
    @Then("Store manager sees  total_COST_DEPRECIATED")
    public void store_manager_sees_total_cost_depreciated() {
        String actual = ivan182_pages.total_COST_DEPRECIATED.getText();
        String expected = "Total Cost (Depreciated)";
        Assert.assertEquals(actual,expected);
    }
    @Then("Store manager sees  co2_EMISSIONS")
    public void store_manager_sees_co2_emissions() {
        String actual = ivan182_pages.co2_EMISSIONS.getText();
        String expected = "CO2 Emissions";
        Assert.assertEquals(actual,expected);
    }
    @Then("Store manager sees  fuel_TYPE")
    public void store_manager_sees_fuel_type() {
        String actual = ivan182_pages.fuel_TYPE.getText();
        String expected = "Fuel Type";
        Assert.assertEquals(actual,expected);
    }
    @Then("Store manager sees  vendors")
    public void store_manager_sees_vendors() {
        String actual = ivan182_pages.vendors.getText();
        String expected = "Vendors";
        Assert.assertEquals(actual,expected);
    }

//-------------------------------------------------------------------------

    @Given("Sales manager is logged in as Store manager and on home page")
    public void sales_manager_is_logged_in_as_store_manager_and_on_home_page() {
        loginPage.login("salesmanager140","UserUser123");
        BrowserUtils.sleep(7);
    }
    @When("Sales manager click on Fleet")
    public void sales_manager_click_on_fleet() {
        ivan182_pages.button_Fleet.click();
    }
    @When("Sales manager click on Vehicles Model")
    public void sales_manager_click_on_vehicles_model() {
        ivan182_pages.button_VehicleModel.click();
    }
    @Then("Sales manager sees  modelName")
    public void sales_manager_sees_model_name() {
        String actual = ivan182_pages.modelName.getText();
        String expected = "Model Name";
        Assert.assertEquals(actual,expected);
    }
    @Then("Sales manager sees  make")
    public void sales_manager_sees_make() {
        String actual = ivan182_pages.make.getText();
        String expected = "Make";
        Assert.assertEquals(actual,expected);

    }
    @Then("Sales manager sees  canBeRequested")
    public void sales_manager_sees_can_be_requested() {
        String actual = ivan182_pages.canBeRequested.getText();
        String expected = "Can be requested";
        Assert.assertEquals(actual,expected);
    }
    @Then("Sales manager sees  cVVI")
    public void sales_manager_sees_c_vvi() {
        String actual = ivan182_pages.cVVI.getText();
        String expected = "CVVI";
        Assert.assertEquals(actual,expected);
    }
    @Then("Sales manager sees  cO2_FEE_MONTH")
    public void sales_manager_sees_c_o2_fee_month() {
        String actual = ivan182_pages.cO2_FEE_MONTH.getText();
        String expected = "CO2 Fee (/month)";
        Assert.assertEquals(actual,expected);
    }
    @Then("Sales manager sees  cost_DEPRECIATED")
    public void sales_manager_sees_cost_depreciated() {
        String actual = ivan182_pages.cost_DEPRECIATED.getText();
        String expected = "Cost (Depreciated)";
        Assert.assertEquals(actual,expected);
    }

    @Then("Sales manager sees  total_COST_DEPRECIATED")
    public void salesManagerSeesTotal_COST_DEPRECIATED() {
        String actual = ivan182_pages.total_COST_DEPRECIATED.getText();
        String expected = "Total Cost (Depreciated)";
        Assert.assertEquals(actual,expected);
    }


    @Then("Sales manager sees  co2_EMISSIONS")
    public void sales_manager_sees_co2_emissions() {
        String actual = ivan182_pages.co2_EMISSIONS.getText();
        String expected = "CO2 Emissions";
        Assert.assertEquals(actual,expected);

    }
    @Then("Sales manager sees  fuel_TYPE")
    public void sales_manager_sees_fuel_type() {
        String actual = ivan182_pages.fuel_TYPE.getText();
        String expected = "Fuel Type";
        Assert.assertEquals(actual,expected);

    }
    @Then("Sales manager sees  vendors")
    public void sales_manager_sees_vendors() {
        String actual = ivan182_pages.vendors.getText();
        String expected = "Vendors";
        Assert.assertEquals(actual,expected);
    }

    @When("Driver click on Fleet")
    public void driver_click_on_fleet() {
        ivan182_pages.button_Fleet.click();
    }
    @When("Driver click on Vehicles Model")
    public void driver_click_on_vehicles_model() {
        ivan182_pages.button_VehicleModel.click();
    }
    @Then("Driver sees a message You do not have permission to perform this action.")
    public void driver_sees_a_message_you_do_not_have_permission_to_perform_this_action() {

        String actualMessage = ivan182_pages.error_Message.getText();
        String expectedMessage = "You do not have permission to perform this action.";

        Assert.assertEquals(actualMessage,expectedMessage);
    }


}
