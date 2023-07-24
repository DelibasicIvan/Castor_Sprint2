package com.Castor_Sprint2.pages;

import com.Castor_Sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Ivan182_Pages {
   public Ivan182_Pages(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

  // @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
  @FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement button_Fleet;

    @FindBy (xpath = "//span[text()='Vehicles Model']")
    public WebElement button_VehicleModel;

    @FindBy (xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement error_Message;

   // @FindBy (xpath = "//tr[@class='grid-header-row']")
   @FindBy (xpath = "//th")
  public List<WebElement> modules_10;

   @FindBy(xpath = "(//span [@class = 'title title-level-1'])[1]")
    public WebElement buttonfleetDriver;

    @FindBy(xpath = "//span [.='Vehicles Model']")
    public WebElement vechicle_modul_driver;








}
