package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private By body= By.tagName("body");
    private String topFrame="frame-top";
    private String bottomFrame="frame-bottom";
    private String leftFrame="frame-left";
    public NestedFramesPage(WebDriver driver){
        this.driver=driver;
    }
    public String getLeftFrameText(){
       String text= driver.switchTo().frame(topFrame)
               .switchTo().frame(leftFrame).findElement(body).getText();
       driver.switchTo().defaultContent();
       return  text;
    }
    public String getBottomFrameText(){
        String bottomText= driver.switchTo().frame(bottomFrame)
                .findElement(body).getText();
        driver.switchTo().defaultContent();
        return bottomText;
    }
}
