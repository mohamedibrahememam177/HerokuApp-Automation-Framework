package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTest extends BaseTest{
    @Test
    public void testDynamicLoading(){
       DynamicLoadingPageOne dynamicLoadingPageOne= homePage.clickOnDynamicLoading().clickOnEx1();
       dynamicLoadingPageOne.clickOnStart();
       dynamicLoadingPageOne.waitForHelloWorldText();
       dynamicLoadingPageOne.getHelloWorldText();
        assertEquals(dynamicLoadingPageOne.getHelloWorldText(),"Hello World!","incorrect message");
    }

    @Test
    public void testDynamicLoadingPageTwo(){
        DynamicLoadingPageTwo dynamicLoadingPageTwo=homePage.clickOnDynamicLoading().clickOnEx2();
        dynamicLoadingPageTwo.clickOnStart();
        dynamicLoadingPageTwo.waitForHelloWorldText();
        assertEquals(dynamicLoadingPageTwo.getHelloWorldText(),"Hello World!","incorrect message");
    }
}
