package org.example;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class KeyPressesTest extends BaseTest{

    @Test
    public void verifyCapitalLetter(){
        KeyPressPage keyPressPage=homePage.clickOnKeyPressLink();
        keyPressPage.writeInInput(Keys.chord(Keys.SHIFT+"c"));
        String text =keyPressPage.getText();
        assertEquals(text,"You entered: C","The message is incorrect");
    }
    @Test
    public void verifyBackSpace(){
      KeyPressPage keyPressPage=  homePage.clickOnKeyPressLink();
      keyPressPage.writeInInput("z"+Keys.BACK_SPACE);
      assertEquals(keyPressPage.getText(),"You entered: BACK_SPACE","The result is incorrect");
    }

}
