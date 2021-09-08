package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;

    By Username = By.xpath("//input[@placeholder='Login']");
    By Password = By.xpath("//input[@placeholder='Password']");
    By LogIn = By.xpath("//input[@value='Log In']");
    By UserTxt = By.xpath("//span[@id='user-name']");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void validLogin(String username,String password){
      driver.findElement(Username).sendKeys(username);
      driver.findElement(Password).sendKeys(password);

    }

    public void clickButton(){
        driver.findElement(LogIn).click();
    }

    public void userTxt(){
        String usertxt = driver.findElement(Username).getText();
    }
}
