package Guru99Bank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;


public class MyStepdefs extends Utils{
    LoginPage loginPage=new LoginPage();


    @Given("User is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.verifyUserIsOnLoginPage();
    }

    @When("User enters valid UserID {string} and Valid Password {string}")
    public void user_enters_valid_UserID_and_Valid_Password(String userID, String password) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterValidUserIDAndPassword(userID,password);
    }

    @Then("User should able to login successfully")
    public void user_should_able_to_login_successfully() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.verifyUserLoggedInSuccessfully();
    }

    //For invalid..............................................................


    @When("I enter invalid {string} and {string}")
    public void i_enter_invalid_and(String userID, String password) {
        loginPage.enterInValidUserIDAndPassword(userID,password);
    }

    @Then("I should see error message")
    public void i_should_see_error_message() {
        Alert alert=driver.switchTo().alert();
        String alertMessage =driver.switchTo().alert().getText();
        assertAlertMessage("login unsuccessful","User or Password is not valid",alertMessage);
               alert.accept();


    }

















}
