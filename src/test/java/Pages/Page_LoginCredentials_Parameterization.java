package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_LoginCredentials_Parameterization {

    WebDriver driver= null;


    By username = By.id("name");
    By password = By.id("password");
    By login_button = By.id("login");



    public Page_LoginCredentials_Parameterization(WebDriver driver){
        this.driver= driver;
    }


    public void enterUserName(String username){
        driver.findElement(By.id("name")).sendKeys(username);
    }


    public void enterPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickOnLoginButton(){
        driver.findElement(By.id("login")).click();
    }


    public void signInWithValidCredentails(String username, String password){
        driver.findElement(By.id("name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();

    }

}
