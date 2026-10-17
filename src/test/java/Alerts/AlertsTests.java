package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AlertsTests extends BaseTests {
    @Test
    public void alertTest(){
        var JavaAlertsPage= homepage.clickJavaAlertsPage();
        JavaAlertsPage.clickJSAlert();
        assertEquals(JavaAlertsPage.getAlertText(),"I am a JS Alert",
                "the Alert is wrong");
        JavaAlertsPage.acceptAlert();
        assertEquals(JavaAlertsPage.getResultMessage(),"You successfully clicked an alert",
                "GJ");

    }
    @Test
    public void confirmTest(){
        var JavaAlertsPage= homepage.clickJavaAlertsPage();
        JavaAlertsPage.clickJSConfirm();
        assertEquals(JavaAlertsPage.getAlertText(),"I am a JS Confirm",
                "the Alert is wrong");
        JavaAlertsPage.acceptAlert();
        assertEquals(JavaAlertsPage.getResultMessage(),"You clicked: Ok",
                "Not Bad");

    }
    @Test
    public void promptTest(){
        var JavaAlertsPage= homepage.clickJavaAlertsPage();
        JavaAlertsPage.clickJSPrompt();
        assertEquals(JavaAlertsPage.getAlertText(),"I am a JS prompt",
                "the Alert is wrong");
        JavaAlertsPage.enterText("EZ");
        JavaAlertsPage.acceptAlert();
        assertEquals(JavaAlertsPage.getResultMessage(),"You entered: EZ",
                "Bravo");

    }
}
