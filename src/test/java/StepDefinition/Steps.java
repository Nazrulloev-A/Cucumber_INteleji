package StepDefinition;

import LoginPage.Login;
import LoginPage.orderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



import java.time.Duration;

public class Steps extends Utility.Driver {

   Login login = new Login();
   orderPage check = new orderPage();
    @When("user enters username and password")
    public void user_enters_username_and_password() {
      login.Username.sendKeys("Tester");
        login.Password.sendKeys("test");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
       login.LoginBtn.click();
    }
    @Given("user should select first check box row")
    public void user_should_select_first_check_box_row() {
        check.selectFirstRow();
    }

    @When("user should select second check bow row")
    public void user_should_select_second_check_bow_row() {
        check.selectSecondRow();
    }

    @When("clicks on Delete button")
    public void clicks_on_delete_button() {
        check.clickDeleteBtn();
    }


}
