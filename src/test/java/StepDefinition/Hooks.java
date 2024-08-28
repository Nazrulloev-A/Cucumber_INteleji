package StepDefinition;

import Utility.ConfigurationReader;
import Utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import java.time.Duration;


public class Hooks extends Utility.Driver {

    @SuppressWarnings("deprecation")
    @Before("@Log")
    public void setUp() {
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("BaseUrl"));

    }

    @After("@Log")
    public void tearDown() {

        Driver.closeDriver();
        {
        }
    }
}