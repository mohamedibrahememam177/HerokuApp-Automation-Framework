package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String locatorOfTopFrame="frame-top";
    private String locatorOfLeftFrame="frame-left";
    private String locatorOfBottomFrame="frame-bottom";
    private By locatorOfFrameText=By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTextOfLeftFrame(){
        driver.switchTo().frame(locatorOfTopFrame);
        driver.switchTo().frame(locatorOfLeftFrame);
        String text=driver.findElement(locatorOfFrameText).getText();
        driver.switchTo().defaultContent();
        return text ;
    }
    public String getTextOfBottomFrame(){
     driver.switchTo().frame(locatorOfBottomFrame);
     String text=driver.findElement(locatorOfFrameText).getText();
     driver.switchTo().parentFrame();
     return text;
    }
}
