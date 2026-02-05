package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecureArea {
    private WebDriver driver;
    private By secureAreaMessage = By.id("flash");

    // Constructor
    public SecureArea(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public String getSecureAreaMessage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement flashMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));
        return flashMessage.getText();
    }
}
