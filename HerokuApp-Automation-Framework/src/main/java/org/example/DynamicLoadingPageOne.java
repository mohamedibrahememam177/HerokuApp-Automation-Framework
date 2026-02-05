package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPageOne {
    private WebDriver driver;
    private By locatorOfStartButton=By.cssSelector("#start button");
    private By locatorOfMessage=By.cssSelector("#finish h4");
    private By locatorOfBar = By.id("loading");
    public DynamicLoadingPageOne(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnStart(){
        driver.findElement(locatorOfStartButton).click();
    }
    public void waitForHelloWorldText(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatorOfMessage));
    }

    public String getHelloWorldText(){
        return driver.findElement(locatorOfMessage).getText();
    }







}
