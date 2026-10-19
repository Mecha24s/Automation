package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class HomePage {
//   private By formAuthLink = By.linkText("Form Authentication");
//   private By dropDownLink = By.linkText("")
    private WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;
    }
    public LoginPage clickFormAuth(){
//        driver.findElement(formAuthLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
//    public HoversPage clickHoversPage(){
//        clickLink("Hovers");
//        return new HoversPage(driver);
//    }
    public KeyPressesPage clickKeyPressesPage(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public JavaAlertsPage clickJavaAlertsPage(){
        clickLink("JavaScript Alerts");
        return new JavaAlertsPage(driver);
    }
    public FileUploadPage clickFileUploadPage(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public EntryAdPage clickEntryAdPage(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }
}
