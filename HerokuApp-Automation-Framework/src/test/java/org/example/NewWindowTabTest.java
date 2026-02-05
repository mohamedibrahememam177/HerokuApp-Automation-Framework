package org.example;

import org.testng.annotations.Test;
import utils.WindowManager;

import static org.testng.Assert.assertEquals;

public class NewWindowTabTest extends BaseTest{
    @Test
    public void testNewWindowTab(){
       MultipleWindowsPage multipleWindowsPage = homePage.clickOnMultipleWindows();
       NewWindowTabPage newWindowTabPage=  multipleWindowsPage.goToNewWindow();
        getWindowHandler().goToNewTab("New Window");
       assertEquals(newWindowTabPage.getText(),"New Window","incorrect window");


    }
}
