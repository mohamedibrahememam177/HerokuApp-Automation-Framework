package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver ;
    private By locatorOfEx1=By.linkText("Example 1: Element on page that is hidden");
    private By locatorOfEx2=By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
    public DynamicLoadingPageOne clickOnEx1(){
         driver.findElement(locatorOfEx1).click();
         return new DynamicLoadingPageOne(driver);
    }
    public DynamicLoadingPageTwo clickOnEx2(){
        driver.findElement(locatorOfEx2).click();
        return new DynamicLoadingPageTwo(driver);
    }
}
