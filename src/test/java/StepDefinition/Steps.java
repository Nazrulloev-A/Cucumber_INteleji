package StepDefinition;

import LoginPage.Login;
import LoginPage.orderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



import java.time.Duration;

public class Steps extends Utility.Driver {

   Login login = new Login();
   orderPage check = new orderPage();
    @When("user enters {string} and {string}")
    public void userEntersAnd(String user, String pass) {
        login.Username.sendKeys(user);
        login.Password.sendKeys(pass);
    }

   @When("user clicks on the login button")
   public void userClicksOnTheLoginButton() {
       login.LoginBtn.click();
    }
   @Then("user should select the first checkbox row")
   public void userShouldSelectTheFirstCheckboxRow() {
        check.selectFirstRow();
    }

   @And("user should select the second checkbox row")
   public void userShouldSelectTheSecondCheckboxRow() {
        check.selectSecondRow();
    }

   @And("user clicks on the Delete button")
   public void userClicksOnTheDeleteButton() {

        check.clickDeleteBtn();
    }

}


