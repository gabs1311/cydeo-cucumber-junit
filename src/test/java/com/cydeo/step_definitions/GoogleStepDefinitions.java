package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {


    GoogleSearchPage googleSearchPage= new GoogleSearchPage();

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }


    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
        String expectedTitle = "apple - Căutare Google";
        String actualTitle =Driver.getDriver().getTitle();


        //Junit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals( expectedTitle,actualTitle);
       // Assert.assertTrue(actualTitle.equals(expectedTitle));

    }



    @When("user is on Google search page")
    public void user_is_on_google_search_page() throws InterruptedException {
        Driver.getDriver().get("https://www.google.com");

        WebElement agreeButton=Driver.getDriver().findElement(By.id("L2AGLb"));
        agreeButton.click();
        Thread.sleep(1000);
    }
    @Then("user should see title is Google.")
    public void user_should_see_title_is_google() {
        String expectedTitle= "Google";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Driver.closeDriver();

    }


}
