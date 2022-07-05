package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {

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
