package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewWindowTabPage {
    private WebDriver driver;
    private By locatorOfResultText= By.tagName("h3");

    public NewWindowTabPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getText(){
        return driver.findElement(locatorOfResultText).getText();
    }

}
