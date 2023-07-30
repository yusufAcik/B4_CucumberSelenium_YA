package com.krafttech.stepDefinitions;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DashboardMenu_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String>expectedList) {
        System.out.println(expectedList.size());
        System.out.println("expectedList = " + expectedList);
        /*List<String> actualList=new ArrayList<>();
        for (WebElement ele: dashboardPage.upTitles) {
            actualList.add(ele.getText());
        }  Hazır method varken method yazılmaz  */
        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.upTitles);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList,actualList);
    }

    @When("The user logs in using following menu")
    public void the_user_logs_in_using_following_menu(Map<String,String> userCredentials) {
        LoginPage loginPage=new LoginPage();
        System.out.println("userCredentials = " + userCredentials);
        loginPage.login(
                userCredentials.get("username"),
                userCredentials.get("password")
        );
        BrowserUtils.waitFor(2);
        Assert.assertEquals(userCredentials.get("name"),
               dashboardPage.userAccountName.getText()
                );
    }

    @When("The user navigates to {string} and {string} sub menu")
    public void the_user_navigates_to_and_sub_menu(String menu, String subMenu) {
        dashboardPage.navigateToModule(menu,subMenu);
    }


}
