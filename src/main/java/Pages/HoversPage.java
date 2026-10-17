package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//public class HoversPage {
//    private WebDriver driver;
//    private By figure=By.cssSelector("div .figure");
//    private By figureCaption=By.className("figcaption");
//    public HoversPage(WebDriver driver){
//
//        this.driver=driver;
//    }
//
//    /**
//     * Mehtod hovers over a figure of 3 existing figures
//     * @param index 1 based index
//     */
//    public FigureCaption hoverOverFigure(int index){
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElements(figure).get(index-1));
//        return new FigureCaption();
//    }
//    public class FigureCaption {
//        private WebElement caption;
//        public FigureCaption(WebElement caption){
//            this.caption=caption;
//        }
//        public boolean isCaptionViewed(int index) {
//            return driver.findElements(figureCaption).get(index).isDisplayed();
//
//        }
//    }


//}
