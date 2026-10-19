package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;
    private By addLocator=By.cssSelector("div.modal-footer>p");
    private By headerLocator=By.cssSelector("div.example>h3");
    public EntryAdPage(WebDriver driver){
        this.driver=driver;
    }
    public void closeAd(){
        driver.findElement(addLocator).click();
    }
    public String getHeader(){
       return driver.findElement(headerLocator).getText();
    }

}
