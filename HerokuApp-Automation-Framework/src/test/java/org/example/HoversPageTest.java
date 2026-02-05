package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversPageTest extends BaseTest{

    @Test
    public void hoverPageSuccessful(){

        HoversPage hoversPage=homePage.clickHoversPage();
       HoversPage.FigureCaption figureCaption= hoversPage.hoverOnFigure(0);
        assertTrue(figureCaption.isDisplayed(), "Caption not visible!");
        assertEquals(figureCaption.getText(), "name: user1\n" +
                "View profile", "Wrong caption text!");



    }
}
