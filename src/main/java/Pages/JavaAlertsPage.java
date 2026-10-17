package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaAlertsPage {
    private WebDriver driver;
    private By alertButton=By.xpath("//button[contains(.,'Alert')]");
    private By confirmButton=By.xpath("//button[contains(.,'Confirm')]");
    private By promptButton=By.xpath("//button[contains(.,'Prompt')]");
    private By resultMessage=By.id("result");
    public JavaAlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickJSAlert(){
        driver.findElement(alertButton).click();

    }public void clickJSPrompt(){
        driver.findElement(promptButton).click();
    }public void clickJSConfirm(){
        driver.findElement(confirmButton).click();
    }
    public String getResultMessage(){
        return driver.findElement(resultMessage).getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void enterText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
