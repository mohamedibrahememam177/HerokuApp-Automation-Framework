package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits;

public class EntryAdPage {
    private WebDriver driver;
    private By locatorOfCloseElement=By.xpath("//p[text()='Close']");
    private By locatorOfEntryAdText=By.xpath("//h3[text()='Entry Ad']");
    private By locatorOfRestartModal =By.id("restart-ad");

   private Waits waits ;

    public EntryAdPage(WebDriver driver){
     this.driver=driver;
     this.waits=new Waits(driver);
    }

    public void closeModal(){
        waits.clickElement(locatorOfCloseElement);
    }
    public String getText(){
      return waits.visibilityOfElement(locatorOfEntryAdText).getText();
    }
    public void clickOnRestartModal(){
        waits.clickElement(locatorOfRestartModal);
        try {
            waits.visibilityOfElement(locatorOfCloseElement);
        } catch (Exception e) {
            waits.clickElement(locatorOfRestartModal);
            waits.visibilityOfElement(locatorOfCloseElement);
        }
    }

    public boolean isModalNotDisplayed() {
        try {
            waits.invisibilityOfElement(locatorOfCloseElement);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isModalDisplayed(){
    try {
      waits.visibilityOfElement(locatorOfCloseElement);
      return true;
    } catch (Exception e) {
        return false;
    }
   }



}
