package com.Castor_Sprint2.pages;

import com.Castor_Sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US01_B29G12_178_Serhiy_HomePage {

    public US01_B29G12_178_Serhiy_HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

}
