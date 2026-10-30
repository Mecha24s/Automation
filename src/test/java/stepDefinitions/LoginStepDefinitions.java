package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class LoginStepDefinitions {
    private WebDriver driver;
    private By usernameLocator=new By.ByName("username");
    private By passwordLocator=new By.ByName("password");
    private By loginButton=
            new By.ByCssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button");
    private By dashboard= new By.ByClassName("oxd-topbar-header-title");
    private WebDriverWait wait;


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

    }

    @When("the user enters valid username and password and clicks the login button")
    public void the_user_enters_valid_username_and_password_and_clicks_the_login_button() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameLocator));
        driver.findElement(usernameLocator).sendKeys("Admin");
        driver.findElement(passwordLocator).sendKeys("admin123");
        driver.findElement(loginButton).click();


    }

    @Then("the user should be directed to homepage")
    public void the_user_should_be_directed_to_homepage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(dashboard));
        assertEquals(driver.findElement(dashboard).getText(),"Dashboard","not home page");
        driver.quit();


    }
}

