package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Waits;

import java.time.Duration;

public class DynamicLoadingPageOne {
    private WebDriver driver;
    private Waits waits;
    private By locatorOfStartButton=By.cssSelector("#start button");
    private By locatorOfMessage=By.cssSelector("#finish h4");
    private By locatorOfBar = By.id("loading");

    public DynamicLoadingPageOne(WebDriver driver) {
        this.driver = driver;
        this.waits=new Waits(driver);
    }

    public void clickOnStart(){
        driver.findElement(locatorOfStartButton).click();
    }

    public String getHelloWorldMessageText(){
      return waits.visibilityOfElement(locatorOfMessage).getText();
    }
   public boolean isBarInVisible(){
     return waits.invisibilityOfElement(locatorOfBar);
   }








}
