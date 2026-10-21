package Frames;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NestedFramesTests extends BaseTests {
    @Test
    public void testFrames(){
        var nestedFramesPage= homepage.clickFramesPage().clickNestedFrames();
        assertTrue(nestedFramesPage.getLeftFrameText().contains("LEFT"),"Wrong frame");
        assertTrue(nestedFramesPage.getBottomFrameText().contains("BOTTOM"),"Wrong frame");


    }
}
