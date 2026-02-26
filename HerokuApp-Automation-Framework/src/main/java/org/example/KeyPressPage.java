package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class KeyPressPage {
    private WebDriver driver;
    private By inputLocator = By.id("target");
    private By resultMessage =By.id("result");

    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void writeInInput(String input){
        driver.findElement(inputLocator).sendKeys(input);
    }
    public String getText(){
        return driver.findElement(resultMessage).getText();
    }

}
