package com.Castor_Sprint2.pages;

import com.Castor_Sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeoDor_QL_Pages {
    public TeoDor_QL_Pages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='help no-hash']")
    public WebElement qsign;

    @FindBy(xpath = "//i[@class='mail-icon']")
    public WebElement recentEmails;

    @FindBy(xpath = "(//span[contains(text(), 'Activities')])")
    public WebElement activitiesBTN;


    @FindBy(xpath = "(//span[contains(text(),'Calendar')])[1]")
    public WebElement calendarEvents;


    @FindBy(xpath = "(//div//a[contains(@class,'btn-primary')]/../..)")
    public WebElement createEvent;

    @FindBy(xpath = "((//label[contains(text(),'Repeat')])[1])")
    public WebElement repeatBox;


    @FindBy(xpath = "((//input[@class='recurrence-subview-control__number'])[1])")
    public WebElement repeatEveryValue;

    @FindBy(xpath = "//span[contains(text(),'should')]")
    public WebElement errorMsg;

    @FindBy(xpath = "//a[@data-action-name='new-event']")
    public WebElement storeEventBTN;

}
