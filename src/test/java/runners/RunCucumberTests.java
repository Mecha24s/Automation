package runners;

import io.cucumber.plugin.Plugin;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions" ,
        plugin ={
                "pretty",
                "html:target/Cucumber-report.html"
        }

)
public class RunCucumberTests extends AbstractTestNGCucumberTests {

}
