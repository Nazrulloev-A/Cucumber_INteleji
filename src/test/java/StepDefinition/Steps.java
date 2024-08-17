package StepDefinition;

import LoginPage.Login;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Steps {

    WebDriver driver;
    String url = "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx/";

    @Before
    public void setUp() {

//       --- HEADLESS MODE ---
//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless"); // Enable headless mode
//        options.addArguments("--disable-gpu"); // Disable GPU acceleration (optional)
//        options.addArguments("--window-size=1920,1080"); // Set a default window size (optional)
//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//       -- HEAD MODE ---
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

//
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.navigate().to(url);
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        Login login = new Login(driver);
        login.validLogin("Tester", "test");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        Login login = new Login(driver);
        login.clickButton();
    }



    @After
    public void closeUp() {
        driver.quit();
    }
}
