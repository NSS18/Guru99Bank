package Guru99Bank;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    private By _userID = By.xpath("//input[@name=\"uid\"]");
    private By _password = By.xpath("//input[@name=\"password\"]");
    private By _login = By.xpath("//input[@name=\"btnLogin\"]");

    private By _verifyLoginMessage = By.xpath("//td[contains(text(),'mngr258045')]");


    public void verifyUserIsOnLoginPage()
    {
         assetURL("/V4/");
    }

    public void enterValidUserIDAndPassword(String userID,String password)
    {

        enterText(_userID,userID);
        timeDelay(2);
        enterText(_password,password);
        clickOnElement(_login);
    }

    public void verifyUserLoggedInSuccessfully()
    {

        String expected="Manger Id : mngr258045";
        assertTextMessage("Login is not successful",expected,_verifyLoginMessage);
    }

    public void enterInValidUserIDAndPassword(String userID,String password)
    {

        enterText(_userID,userID);
        timeDelay(2);
        enterText(_password,password);
        clickOnElement(_login);


    }


}
