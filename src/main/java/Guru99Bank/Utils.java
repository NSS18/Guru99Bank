package Guru99Bank;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Utils extends BasePage {


public static void assetURL(String text)
{
Assert.assertTrue(driver.getCurrentUrl().contains(text));
}
    public static void scrollAndClick(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }

    //for Time dealy
    public static void timeDelay(int time){
        try {
            Thread.sleep(time *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //To click
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //To enter text
    public void enterText(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //To get text
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //To match actual and expected text message
    public static void assertTextMessage(String message,String expected,By by)
    {
        String actual=getTextFromElement(by);
        //Assert.assertEquals(message,expected,actual);
        Assert.assertEquals(message,expected,actual);
    }

    //assert Alert messege
    public static void assertAlertMessage(String message,String expected,String alertMessage)
    {
        Assert.assertEquals(message,expected,alertMessage);
    }

}
