package org.example;

import components.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortableDataTablesPage {
    private WebDriver driver;
    private By locatorOfTableOne=By.id("table1");
    private By locatorOfTableTwo=By.id("table2");

    public SortableDataTablesPage(WebDriver driver) {
        this.driver = driver;
    }
    public Table getTable1(){
       WebElement tableElement= driver.findElement(locatorOfTableOne);
       return new Table(tableElement,driver);
    }
    public Table getTable2(){
        WebElement tableElement= driver.findElement(locatorOfTableTwo);
        return new Table(tableElement,driver);
    }



}
