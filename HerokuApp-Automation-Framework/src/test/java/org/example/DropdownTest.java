package org.example;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTest {

    @Test
    public void testSuccessfullSelectOptions(){

        DropdownPage dropdownPage= homePage.clickDropdown();

               dropdownPage.selectOnly().selectOp(2);
       String txt=dropdownPage.selectOnly().getTxt();


        assertEquals(txt,"Option 2","error one");


    }}
