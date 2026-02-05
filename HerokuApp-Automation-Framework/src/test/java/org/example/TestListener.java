package org.example;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("***** Test Case Failed: " + result.getName() + " - Taking Screenshot... *****");


        Object testClass = result.getInstance();


        WebDriver driver = ((BaseTest) testClass).getDriver();


        if (driver != null) {
            saveScreenshotPNG(driver);
        }
    }


    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}