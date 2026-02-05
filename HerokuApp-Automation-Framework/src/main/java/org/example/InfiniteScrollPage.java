package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfiniteScrollPage {
    private WebDriver driver;
    private JavascriptExecutor js;
    private int paragraphCount=0;
    public WebElement Paragraph;
   // private By locatorOfTheFifthParagraph=By.xpath("(//div[@class='jscroll-added'])[5]");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
        js=(JavascriptExecutor)driver;
    }




    public void scrollToParagraph(int targetParagraph) throws InterruptedException {
        while ( paragraphCount<targetParagraph){
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
            paragraphCount = driver.findElements(By.cssSelector(".jscroll-added")).size();
        }
      if (paragraphCount>=targetParagraph){
           Paragraph=driver.findElement(By.xpath("(//div[@class='jscroll-added'])["+targetParagraph+"]"));
          js.executeScript("arguments[0].scrollIntoView(true);",Paragraph);
      }
      else System.out.println("The fifth Paragraph Is Not Present");
    }


}
