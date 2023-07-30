package com.krafttech.pages;

import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserProfilePage extends BasePage{

    @FindBy(css = "[role='alert']")
    public WebElement updateMessage;

    @FindBy(css = "[role='tablist']>li")
    public List<WebElement> tabList;

    public void navigateToOverviewMenu(String tab){

        WebElement tabElement = Driver.get().findElement(By.xpath("//li/button[.='"+tab+"']"));
        tabElement.click();
    }

    public String updateMessageGetText() {
        return updateMessage.getText();
    }
}
