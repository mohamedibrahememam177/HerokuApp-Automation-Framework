package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ModalTest extends BaseTest{

    @Test
    public void testModalClose(){
      EntryAdPage entryAdPage=  homePage.clickOnEntryPage();
      entryAdPage.closeModal();
      assertTrue(entryAdPage.isModalNotDisplayed(),"The Modal is displayed");
      entryAdPage.clickOnRestartModal();
      assertTrue(entryAdPage.isModalDisplayed(),"The Modal is not displayed");
    }
}
