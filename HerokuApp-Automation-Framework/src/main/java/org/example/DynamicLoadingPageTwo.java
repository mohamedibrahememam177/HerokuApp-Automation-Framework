package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Waits;

import java.time.Duration;

public class DynamicLoadingPageTwo {
    private WebDriver driver;
    private Waits waits;
    private By locatorOfStartButton = By.cssSelector("#start button");
    private By locatorOfMessage = By.id("finish");
    private By locatorOfBar = By.id("loading");

    public DynamicLoadingPageTwo(WebDriver driver) {
        this.driver = driver;
        this.waits=new Waits(driver);
    }

    public void clickOnStart() {
        driver.findElement(locatorOfStartButton).click();
    }

    public String getHelloWorldMessageText(){
      return waits.visibilityOfElement(locatorOfMessage).getText();
    }

}

