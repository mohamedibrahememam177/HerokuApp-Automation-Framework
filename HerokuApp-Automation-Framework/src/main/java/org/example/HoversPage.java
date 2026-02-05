package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By HoverPagesLocators = By.className("figure");
    private By FigureCaptionLocators = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public FigureCaption hoverOnFigure(int index){
        WebElement figure = driver.findElements(HoverPagesLocators).get(index);
        Actions action = new Actions(driver);
        action.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(FigureCaptionLocators));
    }

    public class FigureCaption {
        private WebElement caption;
        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isDisplayed() {
            return caption.isDisplayed();
        }

        public String getText() {
            return caption.getText();
        }
    }
}
