package waits;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class waitTest extends BaseTests {
    @Test
    public void testsWait(){
      var ex1Page=  homepage.clickDynamicloadingPage().clickExample1();
      ex1Page.clickStart();
      assertEquals(ex1Page.getText(),"Hello World!","text is incorrect");

    }
}
