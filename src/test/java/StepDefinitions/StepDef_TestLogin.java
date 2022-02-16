package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class StepDef_TestLogin {

    WebDriver driver=null;

    @Given("browser is open")
    public void browser_is_open() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://example.testproject.io/web/");

    }
    @When("user enters uname and pword")
    public void user_enters_uname_and_pword() {
        driver.findElement(By.id("name")).sendKeys("Raghav");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.id("login")).click();

    }

    @Then("user navigates to home screen")
    public void user_navigates_to_home_screen() {
        driver.getTitle();
        driver.quit();
    }



}
