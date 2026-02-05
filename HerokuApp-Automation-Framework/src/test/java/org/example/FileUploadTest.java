package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest{
    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.FileUploadPage();
        fileUploadPage.pressChooseFile("D:\\IdeaProjects\\MyAutomationSpace\\resources\\Myphoto.jpg");
        fileUploadPage.pressOnUploadLocator();
        assertEquals(fileUploadPage.getText(), "Myphoto.jpg", "text is incorrect");
    }}
