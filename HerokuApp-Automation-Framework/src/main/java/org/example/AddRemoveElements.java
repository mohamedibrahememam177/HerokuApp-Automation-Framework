package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElements {
    private WebDriver driver;
    private By ButtonAddLocator= By.xpath("//button[text()='Add Element']");
    private By ButtonsDeleteLocator= By.xpath("//button[text()='Delete']");

    public AddRemoveElements(WebDriver driver) {
        this.driver=driver;
    }

    public void clickOnAddButton(){
        driver.findElement(ButtonAddLocator).click();
    }
    public void clickonDeleteButton(){
        driver.findElement(ButtonsDeleteLocator).click();
    }
    public int getNumberOfDeleteButtons(){
       return driver.findElements(ButtonsDeleteLocator).size();
    }




}
