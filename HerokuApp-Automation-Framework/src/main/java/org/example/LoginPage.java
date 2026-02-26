package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    private WebDriver driver;
    private By userNameLocator= By.id("username");
    private By passWordLocator= By.id("password");
    private By loginButton=By.cssSelector("#login > button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserNameLocator(String userName ) {
      driver.findElement(userNameLocator).sendKeys(userName);
    }
    public void setPassWordLocator(String password){
        driver.findElement(passWordLocator).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }


}
