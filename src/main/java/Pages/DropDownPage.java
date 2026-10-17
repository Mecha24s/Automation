package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownPage {
    private WebDriver driver;
    private By dropDownLocator=By.id("dropdown");
    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
    public void selectDropDown(int option){
        findDropDown().selectByIndex(option);
    }
    public List<String> getSelectedOption(){
        List<WebElement> selectedElements=findDropDown().getAllSelectedOptions();
        List<String> selectedStrings= new ArrayList<>();
        for(WebElement element:selectedElements){
            selectedStrings.add(element.getText());
        }
        return selectedStrings;
    }
    public Select findDropDown(){
        return new Select(driver.findElement(dropDownLocator));
    }
}
