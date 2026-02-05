package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.StringUtils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Table {

    private WebDriver driver;
    private WebElement tableElement;

    public Table(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }
    private void waitForSortingToFinish(int columnIndex) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public List<WebElement>allHeaders(){
      return tableElement.findElements(By.cssSelector("thead th"));
    }
    public int getColumnsSize(){
        return allHeaders().size();
    }
     public void clickOnHeader(String headerName,int columnIndex){
       int index= getColumnIndex(headerName);
       allHeaders().get(index-1).click();
         waitForSortingToFinish(columnIndex);
     }
    public int getColumnIndex(String columnName) {
        for (int i = 0; i < allHeaders().size(); i++) {
            String headerText = allHeaders().get(i).getText().trim();
            if (headerText.equalsIgnoreCase(columnName.trim())) {
                return i + 1;
            }
        }
        throw new RuntimeException(columnName + ": Is Not Found ");
    }
    public  List<WebElement>getAllRows(){
        return tableElement.findElements(By.cssSelector("tbody tr"));
    }

    public Row getUniqueRow(String uniqueValue, String columnName) {
        int index = getColumnIndex(columnName);
        for (WebElement row : getAllRows()) {
            String cellText = row.findElements(By.tagName("td")).get(index - 1).getText().trim();

            if (cellText.equalsIgnoreCase(uniqueValue.trim())) {
                return new Row(row);
            }
        }
        throw new RuntimeException(uniqueValue + ": Is Not Found ");
    }

    public class Row{
      private WebElement row;

      public Row(WebElement row) {
            this.row=row;
        }

        public List<String> getRowTexts() {
            List<String> texts = new ArrayList<>();
            for (WebElement rowElement :row.findElements(By.tagName("td"))){
                texts.add(rowElement.getText());
            }
            return texts;
        }


        public WebElement getCell(String columnName){
            int indexOfColumn= getColumnIndex(columnName);
            return row.findElements(By.tagName("td")).get(indexOfColumn-1);

        }

        public String getCellText(String columnName){
            return getCell(columnName).getText();
        }
        public WebElement getCellAction(){
            return getCell("Action");
        }

        public WebElement editButton(){
            return getCellAction().findElement(By.linkText("edit"));
        }

        public void clickEdit(){
            editButton().click();
        }

        public String editButtonText(){
            return editButton().getText();
        }

        public WebElement deleteButton(){
            return getCellAction().findElement(By.linkText("delete"));
        }
        public void clickDelete(){
            deleteButton().click();
        }

        public String deleteButtonText(){
            return deleteButton().getText();
        }



    }


}




