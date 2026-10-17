package login;

import Base.BaseTests;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BaseTests {
        @Test
    public void testValidLogin(){
        LoginPage loginpage=homepage.clickFormAuth();
        loginpage.setUsernameField("tomsmith");
        loginpage.setPasswordField("SuperSecretPassword!");
        var secureAreaPage=loginpage.clickLogin();

        Assert.assertTrue(secureAreaPage.getMessage().contains("You logged into a secure area!"),"you failed");
    }
}
