package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPageTwo {
    private WebDriver driver;
    private By locatorOfStartButton = By.cssSelector("#start button");
    private By locatorOfMessage = By.id("finish");
    private By locatorOfBar = By.id("loading");

    public DynamicLoadingPageTwo(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnStart() {
        driver.findElement(locatorOfStartButton).click();
    }

    public void waitForHelloWorldText(){
        FluentWait<WebDriver> wait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
    }

    public String getHelloWorldText() {
        return driver.findElement(locatorOfMessage).getText();
    }
}

