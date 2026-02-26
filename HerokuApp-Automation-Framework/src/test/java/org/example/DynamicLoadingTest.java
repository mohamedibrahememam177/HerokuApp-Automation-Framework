package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicLoadingTest extends BaseTest{
    @Test
    public void testDynamicLoadingPageOne(){
       DynamicLoadingPageOne dynamicLoadingPageOne= homePage.clickOnDynamicLoading().clickOnEx1();
       dynamicLoadingPageOne.clickOnStart();
       String text=dynamicLoadingPageOne.getHelloWorldMessageText();
       assertEquals(text,"Hello World!","Incorrect message");
       assertTrue(dynamicLoadingPageOne.isBarInVisible(),"The Bar is still visible");
    }

    @Test
    public void testDynamicLoadingPageTwo(){
        DynamicLoadingPageTwo dynamicLoadingPageTwo=homePage.clickOnDynamicLoading().clickOnEx2();
        dynamicLoadingPageTwo.clickOnStart();
        String text= dynamicLoadingPageTwo.getHelloWorldMessageText();
        assertEquals(text,"Hello World!","Incorrect message");
    }
}
