package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By searchBar = By.id("target");
    private By Text= By.id("result");
    public  KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }
    public void textEntry(String text){
        driver.findElement(searchBar).sendKeys(text);
    }
    public String textCheck(){
        return driver.findElement(Text).getText();
    }
}
