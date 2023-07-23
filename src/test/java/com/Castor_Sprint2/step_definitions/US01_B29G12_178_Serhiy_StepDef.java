package com.Castor_Sprint2.step_definitions;

import com.Castor_Sprint2.pages.US01_B29G12_178_Serhiy_HomePage;
import com.Castor_Sprint2.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_B29G12_178_Serhiy_StepDef {

US01_B29G12_178_Serhiy_HomePage us01_b29G12_178_serhiy_homePage = new US01_B29G12_178_Serhiy_HomePage();

    @When("the user hovers over the main menu")
    public void theUserHoversOverTheMainMenu() throws InterruptedException {


        Thread.sleep(2000);
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(0));
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(1));
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(2));
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(3));

    }

    @Then("the user sees the expectedModules are displayed")
    public void theUserSeesTheExpectedModulesAreDisplayed() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(0).isDisplayed());
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(1).isDisplayed());
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(2).isDisplayed());
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(3).isDisplayed());

    }

    @When("user hovers over the main menu")
    public void userHoversOverTheMainMenu() throws InterruptedException {
        Thread.sleep(2000);
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(0));
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(1));
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(2));
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(3));
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(4));
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(5));
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(6));
        BrowserUtils.hover(us01_b29G12_178_serhiy_homePage.menuOptions.get(7));

    }

    @Then("user sees the expectedModules are displayed")
    public void userSeesTheExpectedModulesAreDisplayed() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(0).isDisplayed());
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(1).isDisplayed());
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(2).isDisplayed());
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(3).isDisplayed());
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(4).isDisplayed());
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(5).isDisplayed());
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(6).isDisplayed());
        Assert.assertTrue(us01_b29G12_178_serhiy_homePage.menuOptions.get(7).isDisplayed());

    }

}
