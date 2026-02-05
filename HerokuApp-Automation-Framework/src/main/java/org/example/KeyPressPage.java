package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class KeyPressPage {
    private WebDriver driver;
    private By InputLocator= By.id("target");
    private By enteredmessage=By.id("result");

    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void writeInInput(String input){
        driver.findElement(InputLocator).sendKeys(input);
    }
    public String getText(){
        return driver.findElement(enteredmessage).getText();
    }

}
