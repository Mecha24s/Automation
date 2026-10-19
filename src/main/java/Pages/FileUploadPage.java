package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By uploadfileLocator=By.id("file-upload");
    private By uploadButtonLocator= By.id("file-submit");
    private By uploadFileMessage= By.id("uploaded-files");
    public  FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void uploadFileLocator(String absoluteFilePath){
        driver.findElement(uploadfileLocator).sendKeys(absoluteFilePath);
    }
    public void uploadFileButton(){
        driver.findElement(uploadButtonLocator).click();
    }
    public String uploadFileMessage(){
       return driver.findElement(uploadFileMessage).getText();
    }

}
