package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver ;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void goToURL(String URL){
        driver.navigate().to(URL);
    }
    public void goToNewTab(String tabTitle){
        for (String handle:driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if (tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
