package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDef_GoogleSearch {

    WebDriver driver=null;

    @Given("launch the browser")
    public void launch_the_browser() {

    System.out.println("User launches browser *******");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }

    @And("user is  on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("User is on google page *******");
        driver.getTitle();
    }

    @When("user enters text in search box")
    public void user_enters_text_in_search_box() {
        System.out.println("User enters text in search box *******");
        driver.findElement(By.name("q")).sendKeys("Selenium");
    }
    @And("clicks enter")
    public void clicks_enter() {
        System.out.println("User clicks enter  *******");
        driver.findElement(By.name("btnK")).click();

    }
    @Then("user should navigate to search result screen")
    public void user_should_navigate_to_search_result_screen() {

        System.out.println("User navigates to search result *******");
        driver.getTitle();

    }


}
