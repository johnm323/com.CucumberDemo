package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDef_Login {


    @Given("is on login screen")
    public void is_on_login_screen() {
        System.out.println("User is in Login Screen **************");



    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Enter user name and password **************");

    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("user clicks on Login button **************");

    }
    @Then("user should be navigated to home screen")
    public void user_should_be_navigated_to_home_screen() {

        System.out.println("user should be navigated to home screen **************");

    }


}
