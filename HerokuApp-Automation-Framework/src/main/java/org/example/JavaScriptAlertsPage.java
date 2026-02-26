package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver ;
    private By locatorOfAlertButton= (By.xpath("//button[contains(text(),'Alert')]")) ;
    private By locatorOfConfirmButton= By.xpath("//button[contains(.,'Confirm')]");
    private By locatorOfPromptButton= By.xpath("//button[contains(.,'Prompt')]");
    private By locatorOfResultText= By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAlert(){
        driver.findElement(locatorOfAlertButton).click();
    }
    public void clickOnConfirm(){
        driver.findElement(locatorOfConfirmButton).click();
    }
    public void clickOnPrompt(){
        driver.findElement(locatorOfPromptButton).click();
    }
    public String getResultText(){
        return driver.findElement(locatorOfResultText).getText();
    }
    public void submit(){
        driver.switchTo().alert().accept();
    }
    public String getInsideText(){
       return driver.switchTo().alert().getText();
    }
    public void cancel(){
        driver.switchTo().alert().dismiss();
    }
    public void setPromptField(String text){
        driver.switchTo().alert().sendKeys(text);
    }



}
