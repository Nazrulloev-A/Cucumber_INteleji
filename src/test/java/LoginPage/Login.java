package LoginPage;

import Utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

//    WebDriver driver;
//
//    By Username = By.id("ctl00_MainContent_username");
//    By Password = By.id("ctl00_MainContent_password");
//    By LogIn = By.id("ctl00_MainContent_login_button");


    public Login(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    public void validLogin(String username,String password){
//      driver.findElement(Username).sendKeys(username);
//      driver.findElement(Password).sendKeys(password);
//
//    }
//
//    public void clickButton(){
//        driver.findElement(LogIn).click();
//    }
//
//    public void userTxt(){
//        String usertxt = driver.findElement(Username).getText();
//    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement Username;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement Password;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement LoginBtn;
}
