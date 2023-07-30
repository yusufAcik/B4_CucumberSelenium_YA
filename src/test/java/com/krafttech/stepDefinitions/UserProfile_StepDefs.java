package com.krafttech.stepDefinitions;

import com.krafttech.pages.EditProfilePage;
import com.krafttech.pages.UserProfilePage;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class UserProfile_StepDefs {

    UserProfilePage userProfilePage=new UserProfilePage();
    EditProfilePage editProfilePage = new EditProfilePage();
    @Then("The user should be able to see following subMenu")
    public void theUserShouldBeAbleToSeeFollowingSubMenu(List<String> subMenu) {
    List<String>actualSubMenu = BrowserUtils.getElementsText(userProfilePage.tabList);
        System.out.println("actualSubMenu = " + actualSubMenu);
        System.out.println("subMenu = " + subMenu);
        Assert.assertEquals(subMenu,actualSubMenu);
    }
    @When("The user navigates to {string}")
    public void the_user_navigates_to(String subMenu) {
userProfilePage.navigateToOverviewMenu(subMenu);
    }
    @When("The user adds {string} {string}")
    public void the_user_adds(String profileBox, String userInfo) {
   editProfilePage.editProfileInfo(profileBox,userInfo);
   BrowserUtils.waitFor(1);
    }
    @When("The user selects {string} from menu")
    public void the_user_selects_from_menu(String job) {
        editProfilePage.selectJob(job);
    }
    @When("The user clicks on save changes button")
    public void the_user_clicks_on_save_changes_button() {
        // scroll down eklenmeli
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("window.scrollBy(0,500)");
        BrowserUtils.waitFor(1);
        editProfilePage.saveChangeButton.click();
    }

}
