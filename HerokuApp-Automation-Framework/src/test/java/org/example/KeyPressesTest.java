package org.example;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class KeyPressesTest extends BaseTest{
    @Test
    public void verifyTheDisplayedMessage(){
        KeyPressPage keyPressPage=homePage.clickOnKeyPressLink();
        keyPressPage.writeInInput("mohamed"+Keys.chord(Keys.CONTROL+"c"));

        String text =keyPressPage.getText();
        assertEquals(text,"You entered: C","The text is incorrect");


    }

}
