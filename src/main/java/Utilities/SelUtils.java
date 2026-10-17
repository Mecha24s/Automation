package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelUtils {
    private WebDriver driver;
    public SelUtils(WebDriver driver){
        this.driver=driver;
    }
    public void SelectFromDropDown(By Locator,String Option){
        Select dropdown= new Select(driver.findElement(Locator));
        dropdown.selectByContainsVisibleText(Option);
    }
}
