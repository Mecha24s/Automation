package keys;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {
    @Test
    public void testKeys(){
        var keyPressesPage= homepage.clickKeyPressesPage();
        keyPressesPage.textEntry("a"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.textCheck(),"You entered: BACK_SPACE",
                "different message from expected");
    }
}
