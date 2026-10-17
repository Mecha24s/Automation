package DropDownTests;

import Base.BaseTests;
import Pages.DropDownPage;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class DropDownTest extends BaseTests {
    @Test
    public void testDropDown(){
        String Options="Option 1";
       DropDownPage dropDownpage= homepage.clickDropDown();
       dropDownpage.selectDropDown(1);
       List<String> Option=dropDownpage.getSelectedOption();
       assertEquals(Option.size(),1,"the number of elements is more than 1");
       assertTrue(Option.contains("Option 1"),
               "Selected option is wrong");
    }
}
