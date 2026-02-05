package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRemoveElementsTest extends BaseTest{
@Test
    public void testAddRemoveElements(){
       AddRemoveElements addRemoveElements= homePage.clickAddRemoveElementsPage();
       assertEquals(addRemoveElements.getNumberOfDeleteButtons(),0,"expected zero");
       addRemoveElements.clickOnAddButton();
       assertEquals(addRemoveElements.getNumberOfDeleteButtons(),1,"expected one");
       addRemoveElements.clickonDeleteButton();
       assertEquals(addRemoveElements.getNumberOfDeleteButtons(),0,"expected Zero");

    }
}
