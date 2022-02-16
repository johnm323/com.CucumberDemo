package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_LoginCredentials_PageFactory {

    WebDriver driver;

    public Page_LoginCredentials_PageFactory(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver, Page_LoginCredentials_PageFactory.class);


    }



    @FindBy(id = "name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login_button")
    WebElement login_button;


    public void enterUsrName(String uName){
        username.sendKeys(uName);

    }

    public void enterPasword(String pass){
        password.sendKeys(pass);
    }


    public void clickLoginBtn(){
        login_button.click();
    }



}
