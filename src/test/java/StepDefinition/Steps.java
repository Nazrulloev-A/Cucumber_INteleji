package StepDefinition;

import LoginPage.Login;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Steps {


    WebDriver driver;
    String url = "https://login.nextbasecrm.com/";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        driver.navigate().to(url);
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        Login login = new Login(driver);
        login.validLogin("helpdesk17@cybertekschool.com", "UserUser");

    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        Login login = new Login(driver);
        login.clickButton();
    }

    @Then("user is logged succesfully to the home page")
    public void user_is_logged_succesfully_to_the_home_page() {
        Login login = new Login(driver);

        String txt = driver.findElement(By.xpath("//span[@id='user-name']")).getText();
        System.out.println(txt.trim());

    }

    @After
    public void closeUp() {
        driver.quit();
    }

}
