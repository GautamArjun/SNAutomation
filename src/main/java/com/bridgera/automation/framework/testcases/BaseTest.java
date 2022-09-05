package com.bridgera.automation.framework.testcases;

import com.bridgera.automation.framework.testsetup.EdgeWebDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.bridgera.automation.framework.utils.logs.*;

public class BaseTest {
    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void classLevelSetup() {
        Log.info("Tests are starting!");
        driver = EdgeWebDriver.getEdgeWebDriver(false);
    }

    @AfterClass
    public void teardown() {
        Log.info("Tests are ending!");
        driver.quit();
    }
}