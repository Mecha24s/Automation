package FileUpload;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {
    @Test
    public void fileUploadTest() {
        String absolutePath="C:/Users/lenovo/Downloads/Marwan_Hassan_Resume.pdf";
        var FileUploadPage = homepage.clickFileUploadPage();
        FileUploadPage.uploadFileLocator(absolutePath);
        FileUploadPage.uploadFileButton();
        assertEquals(FileUploadPage.uploadFileMessage(),"Marwan_Hassan_Resume.pdf","Wrong file was uploaded");


    }
}
