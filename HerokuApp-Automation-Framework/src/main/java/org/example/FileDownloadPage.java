package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FileDownloadPage {
    private WebDriver driver;
    private By locatorOfAllLinks =By.cssSelector(".example a");
    public FileDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> listOfElements(){
        return driver.findElements(locatorOfAllLinks);
    }

    public void downloadFile(String fileName){
        boolean found=false;
      for (WebElement e:listOfElements()){
          if (e.getText().equals(fileName)){
              e.click();
              found=true;
              break;
          }
      }
      if (!found){
          System.out.println("The entered file name is not found!");
      }


}}
