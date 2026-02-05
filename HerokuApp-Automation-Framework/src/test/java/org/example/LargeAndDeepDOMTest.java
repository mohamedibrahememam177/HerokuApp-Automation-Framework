package org.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LargeAndDeepDOMTest extends BaseTest{
    @Test

    public void testLargeAndDeepDOM(){
        LargeAndDeepDOMPage largeAndDeepDOMPage=homePage.clickOnLargeAndDeepDOM();
        largeAndDeepDOMPage.scrollToTable();

    }
}
