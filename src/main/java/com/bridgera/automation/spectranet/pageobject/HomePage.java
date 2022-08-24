package com.bridgera.automation.spectranet.pageobject;

import com.bridgera.automation.spectranet.utils.TestExecutionProperties;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkHomePage(WebDriver driver){
        // Check that we're on the right page.
        if ("Home".equals(driver.getTitle())) {
            System.out.println("This is the Home Page!");
            return "Success";
        } else {
            throw new IllegalStateException("This is not the Home page");
        }
    }
}
