package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FileDownloadTest extends BaseTest{
    @Test
    public void testFileDownload(){
       FileDownloadPage fileDownloadPage= homePage.clickOnFileDownloadLink();
       assertTrue(!fileDownloadPage.listOfElements().isEmpty(),"No files available for download!");
       fileDownloadPage.downloadFile("TestData.txt");
    }
}
