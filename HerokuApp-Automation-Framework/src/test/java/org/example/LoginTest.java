package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Login with valid credentials and verify success message")
    @Test
  public void testSuccessfulLogin(){
        LoginPage loginPage=homePage.clickFormAuthentication();
        loginPage.setUserNameLocator("tomsmith");
        loginPage.setPassWordLocator("SuperSecretPassword!");
        SecureAreaPage secureArea= loginPage.clickLoginButton();
        String message= secureArea.getSecureAreaMessage();
        Assert.assertTrue(message.contains("You logged into a secure area!"),"The message is incorrect");

    }












}
