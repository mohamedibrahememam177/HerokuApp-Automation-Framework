package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDOMPage {
    private WebDriver driver;
    private By locatorOfTable=By.id("large-table");
    private By locatorOfTableText = By.tagName("h4");



    public LargeAndDeepDOMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToTable(){
        WebElement element= driver.findElement(locatorOfTable);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String script="arguments[0].scrollIntoView();";
        js.executeScript(script,element);
    }



}
