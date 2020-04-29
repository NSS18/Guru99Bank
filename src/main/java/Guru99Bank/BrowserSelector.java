package Guru99Bank;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    //set up browser method to select browser
    public  void SetUpBrowser() {
        //object of load propertied class
        LoadProp loadProp=new LoadProp();
        //To get browser from testconfig.properties file
        String browser=loadProp.getProperty("browser");
        //To print browser name
        System.out.println("We are using-----> "+browser+" browser");

        //To open chrome browser
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();

        }

        // To open firefox browser
        else if(browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }


        //if mentioned browser is not present in the config file
        else
            System.out.println("No matching browser "+browser);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.demo.guru99.com/V4/");
    }



    //To close browser
    public void closeBrowser()
    {
        driver.quit();
    }
}


