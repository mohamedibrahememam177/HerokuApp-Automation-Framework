package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    private WebDriver driver;
    private By locator=By.linkText("Nested Frames");

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickOnNestedFramesLink(){
        driver.findElement(locator).click();
        return new NestedFramesPage(driver) ;
    }

}
