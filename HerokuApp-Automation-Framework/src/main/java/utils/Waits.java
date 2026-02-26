package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    private WebDriver driver ;

    private WebDriverWait webDriverWait;

    public Waits(WebDriver driver){
       this.driver=driver;
       webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickabilityOfElement(By locator) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void clickElement(By locator) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendKeys(By locator, String text) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public WebElement visibilityOfElement(By locator){
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public boolean invisibilityOfElement(By locator){
       return webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

}
