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
        if (!"Home".equals(driver.getTitle())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the Home page");
        } else {
            return "Success";
        }
    }

}
