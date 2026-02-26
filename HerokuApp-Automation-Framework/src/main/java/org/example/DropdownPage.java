package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.devtools.v127.page.model.BackForwardCacheNotRestoredReason.TIMEOUT;

public class DropdownPage {
    private WebDriver driver;
    private By SelectOptionLocator= By.id("dropdown");


    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }


    public OptionSelector selectOnly(){
            WebElement el = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(SelectOptionLocator));
        Select select=new Select(el);
                return new OptionSelector(select);
    }
    public class OptionSelector{
       private Select select;

       public OptionSelector(Select select) {
          this.select=select;
        }
       public OptionSelector selectOp(int index){
           select.selectByIndex(index);
           return this;
       }
       public String getTxt(){
           return select.getFirstSelectedOption().getText();
       }


    }




}
