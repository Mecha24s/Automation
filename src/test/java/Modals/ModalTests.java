package Modals;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTests extends BaseTests {
    @Test
    public void ModalTest(){
        var EntryAdPage= homepage.clickEntryAdPage();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EntryAdPage.closeAd();
        assertEquals(EntryAdPage.getHeader(),"Entry Ad","Fatal Mistake");
    }
}
