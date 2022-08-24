package com.bridgera.automation.framework.testsetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeWebDriver extends EdgeDriver {
    public static WebDriver driver = null;
    public EdgeWebDriver() {
        super();
    }

    public static WebDriver getEdgeWebDriver(boolean headless)
    {
        if (driver == null)
        {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.setHeadless(headless);
            driver = new EdgeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().fullscreen();
        }
        return driver;
    }
}
