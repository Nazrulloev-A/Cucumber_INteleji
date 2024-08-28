package StepDefinition;

import LoginPage.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;



import java.time.Duration;

public class Steps extends Utility.Driver {

   Login login = new Login();

    @When("user enters username and password")
    public void user_enters_username_and_password() {
      login.Username.sendKeys("Tester");
        login.Password.sendKeys("test");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
       login.LoginBtn.click();
    }


}
