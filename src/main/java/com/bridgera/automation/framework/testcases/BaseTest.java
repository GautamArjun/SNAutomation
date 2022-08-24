package com.bridgera.automation.framework.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public WebDriver driver = null;

    @AfterTest
    public void Exit() {
        if(driver!=null)
            driver.close();
        System.out.println("Browser closed");
    }
}
