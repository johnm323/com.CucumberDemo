package StepDefinitions;

import Pages.Page_LoginCredentials_PageFactory;
import Pages.Page_LoginCredentials_Parameterization;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDef_LoginCredentials_PageFactory {

    WebDriver driver = null;
    Page_LoginCredentials_PageFactory login;

    @Given("browser is open1")
    public void browser_is_open1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://example.testproject.io/web/");
    }

    @When("I enter \"(.*)\" and \"(.*)\"$")
    public void i_enter_username_and_userpassword(String username, String userpassword) {

        login.enterUsrName(username);
        login.enterPasword(userpassword);
        login.clickLoginBtn();


    }



    @Then("user navigates to home screen1")
    public void user_navigates_to_home_screen1() {
        driver.quit();

    }


    }



