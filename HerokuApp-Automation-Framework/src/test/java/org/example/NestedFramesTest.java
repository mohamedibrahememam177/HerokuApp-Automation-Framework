package org.example;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTest{
    @Test
    public void testNestedFrames(){
        NestedFramesPage nestedFramesPage= homePage.clickOnFrameLink().clickOnNestedFramesLink();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(nestedFramesPage.getTextOfLeftFrame(),"LEFT","incorrect Text");
        softAssert.assertEquals(nestedFramesPage.getTextOfBottomFrame(),"BOTTOM","incorrect Text");
        softAssert.assertAll();


    }
}
