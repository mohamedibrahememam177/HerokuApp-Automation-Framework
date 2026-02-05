package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaScriptAlertsTest extends BaseTest {
    @Test
    public void testAlertButton(){
        JavaScriptAlertsPage javaScriptAlertsPage= homePage.clickOnJavaScriptAlerts();
        javaScriptAlertsPage.clickOnAlert();
        javaScriptAlertsPage.submit();
        assertEquals(javaScriptAlertsPage.getResultText(),"You successfully clicked an alert","text is incorrect");
    }
    @Test
    public void testConfirmButton(){
        JavaScriptAlertsPage javaScriptAlertsPage= homePage.clickOnJavaScriptAlerts();
        javaScriptAlertsPage.clickOnConfirm();
        javaScriptAlertsPage.submit();
        assertEquals(javaScriptAlertsPage.getResultText(),"You clicked: Ok","text is incorrect");
        javaScriptAlertsPage.clickOnConfirm();
        javaScriptAlertsPage.cancel();
        assertEquals(javaScriptAlertsPage.getResultText(),"You clicked: Cancel","text is incorrect");
    }
    @Test
    public void testPromptButton(){
        JavaScriptAlertsPage javaScriptAlertsPage= homePage.clickOnJavaScriptAlerts();
        javaScriptAlertsPage.clickOnPrompt();
        assertEquals(javaScriptAlertsPage.getInsideText(),"I am a JS prompt","text is incorrect");
        javaScriptAlertsPage.setPromptField("My Name is Mohamed");
        javaScriptAlertsPage.submit();
        assertEquals(javaScriptAlertsPage.getResultText(),"You entered: My Name is Mohamed","text is incorrect");


    }

}
