package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import com.krafttech.utilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public abstract class BasePage  {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//li[contains(@class,'nav-item dropdown')]")
    public List <WebElement> upTitles;

    @FindBy(css = "[class='d-none d-md-block dropdown-toggle ps-2']")
    public WebElement userAccountName;

    public void navigateToModule(String menu){

        String locator = "//span[.='"+menu+"']";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public void navigateToModule(String tab,String module){
        String locator = "//span[.='"+tab+"']";
        Driver.get().findElement(By.xpath(locator)).click();

        BrowserUtils.waitFor(2);

        String locator2 = "//span[.='"+module+"']";
        WebElement moduleElement = Driver.get().findElement(By.xpath(locator2));
        BrowserUtils.clickWithJS(moduleElement);

    }

    public String getUserAccountName(){
        return userAccountName.getText();
    }

    public List<Map<String, String>> getDataList(String sheetName){
        ExcelUtil excelUtil = new ExcelUtil("src/test/resources/KT_B4_DDF_test.xlsx",sheetName);
        List<Map<String, String>> dataList = excelUtil.getDataList();
        return dataList;
    }
}
