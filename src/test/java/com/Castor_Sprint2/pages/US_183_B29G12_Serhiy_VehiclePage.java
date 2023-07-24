package com.Castor_Sprint2.pages;

import com.Castor_Sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_183_B29G12_Serhiy_VehiclePage {

public US_183_B29G12_Serhiy_VehiclePage() {
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

    @FindBy (xpath = "//span[text()='Vehicles']")
    public WebElement vehiclesOption;

    @FindBy (xpath = "(//a[text()='...'])[1]")
    public WebElement dotsElement;

    @FindBy (xpath = "(//i[@class=\"fa-eye hide-text\"])[1]")
    public WebElement viewOption;

    @FindBy (xpath = "(//i[@class=\"fa-pencil-square-o hide-text\"])[1]")
    public WebElement editOption;

    @FindBy(xpath = "(//i[@class=\"fa-trash-o hide-text\"])[1]")
    public WebElement deleteOption;

}
