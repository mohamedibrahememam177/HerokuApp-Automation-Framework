package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Waits;

import java.time.Duration;

public class FileUploadPage {
    private WebDriver driver;
    private Waits waits;
    private By choosefileLocator= By.id("file-upload");
    private By uploadLocator= By.id("file-submit");
    private By messageLocator= By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
        this.waits=new Waits(driver);
    }

    public void pressChooseFile(String absolutePath){
        driver.findElement(choosefileLocator).sendKeys(absolutePath);
    }
    public void pressOnUploadLocator(){
        driver.findElement(uploadLocator).click();
    }
    public String getText(){
     return waits.visibilityOfElement(messageLocator).getText();
   }
}
