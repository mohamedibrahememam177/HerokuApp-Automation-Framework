package org.example;

import org.testng.annotations.Test;

import org.testng.Assert;


public class InfiniteScrollTest extends BaseTest{
    @Test

    public void testInfiniteScroll() throws InterruptedException {
    InfiniteScrollPage infiniteScrollPage=homePage.clickOnInfiniteScroll();
    infiniteScrollPage.scrollToParagraph(6);
    Assert.assertTrue(infiniteScrollPage.Paragraph.isDisplayed(), "Sixth Paragraph is not displayed");

    }
}
