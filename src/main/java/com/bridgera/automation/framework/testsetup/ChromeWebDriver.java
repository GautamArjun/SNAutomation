package com.bridgera.automation.framework.testsetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver extends ChromeDriver {

    public static  WebDriver driver = null;
    public ChromeWebDriver()
    {
        super();
    }

    public static WebDriver getChromeWebDriver(boolean headless)
    {
        if (driver == null)
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(headless);
            //WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().fullscreen();
        }
        return driver;
    }
}
