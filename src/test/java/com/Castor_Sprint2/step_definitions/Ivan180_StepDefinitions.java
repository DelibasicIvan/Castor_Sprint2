package com.Castor_Sprint2.step_definitions;

import com.Castor_Sprint2.pages.Ivan180_Pages;
import com.Castor_Sprint2.pages.LoginPage;
import com.Castor_Sprint2.utilities.BrowserUtils;
import com.Castor_Sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ivan180_StepDefinitions extends LoginPage{
LoginPage loginPage = new LoginPage();
Ivan180_Pages ivan180Pages = new Ivan180_Pages();

    @Given("User is logged in as Driver and on home page")
    public void user_is_logged_in_as_driver_and_on_home_page() {


        loginPage.login("User20","UserUser123");

    }



    @When("User click on Learn how to use space")
    public void user_click_on_learn_how_to_use_space() {

        ivan180Pages.button_HowToUsePinbar.click();
    }
    @Then("User sees How To Use Pinbar")
    public void user_sees_how_to_use_pinbar() {


        String actualMessage1 = ivan180Pages.message_HowToUsePinbar.getText();
        String expectedMessage1 = "How To Use Pinbar";

        Assert.assertEquals(actualMessage1,expectedMessage1);

    }
    @Then("User sees help message")
    public void userSeesHelpMessage() {



        String actualMessage2 = ivan180Pages.message_Help.getText();
        String expectedMessage2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        Assert.assertEquals(expectedMessage2,actualMessage2);
    }


    @Given("User is logged in as Store manager and on home page")
    public void userIsLoggedInAsStoreManagerAndOnHomePage() {


        loginPage.login("storemanager55","UserUser123");
        BrowserUtils.sleep(5);
    }

    @When("Store manager click on Learn how to use space")
    public void storeManagerClickOnLearnHowToUseSpace() {

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       ivan180Pages.button_HowToUsePinbar.click();
    }

    @Then("Store manager How To Use Pinbar")
    public void storeManagerHowToUsePinbar() {


        String actual = ivan180Pages.message_HowToUsePinbar.getText();
        String expected ="How To Use Pinbar";
        Assert.assertEquals(expected,actual);


    }

    @Then("Store manager sees help message")
    public void storeManagerSeesHelpMessage() {

        String actual1 = ivan180Pages.message_Help.getText();
        String expected2 ="Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        Assert.assertTrue(actual1.contains(expected2));


    }

    @Given("User is logged in as Sales manager and on home page")
    public void userIsLoggedInAsSalesManagerAndOnHomePage() {


        loginPage.login("salesmanager101","UserUser123");
        BrowserUtils.sleep(8);
    }

    @When("Sales manager click on Learn how to use space")
    public void salesManagerClickOnLearnHowToUseSpace() {


        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        ivan180Pages.button_HowToUsePinbar.click();
    }

    @Then("Sales manager sees How To Use Pinbar")
    public void salesManagerSeesHowToUsePinbar() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String actual = ivan180Pages.message_HowToUsePinbar.getText();
        String expected ="How To Use Pinbar";
        Assert.assertEquals(expected,actual);

    }

    @Then("Sales manager sees help message")
    public void salesManagerSeesHelpMessage() {

        String actual1 = ivan180Pages.message_Help.getText();
        String expected2 ="Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        Assert.assertTrue(actual1.contains(expected2));
    }


    @Then("Driver sees an image")
    public void driverSeesAnImage() {

        ivan180Pages.image1.isDisplayed();

    }

    @Then("Store manager sees an image")
    public void storeManagerSeesAnImage() {

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        ivan180Pages.image1.isDisplayed();
    }

    @Then("Sales manager sees an image")
    public void salesManagerSeesAnImage() {

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        ivan180Pages.image1.isDisplayed();
    }
}
