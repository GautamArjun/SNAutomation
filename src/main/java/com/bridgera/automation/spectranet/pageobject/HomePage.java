package com.bridgera.automation.spectranet.pageobject;

import com.bridgera.automation.spectranet.utils.TestExecutionProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final String XPATH_DASHBOARD = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-header/mat-toolbar/mat-toolbar-row[1]/div[2]/button[1]";

    By dashboardLocator = By.xpath(XPATH_DASHBOARD);

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkHomePage(){
        // Check that we're on the right page.
        System.out.println("Page Title : " + driver.getTitle());
        if ("Home".equalsIgnoreCase(driver.getTitle())) {
            System.out.println("This is the Home Page!");
            return true;
        } else {
            return false;
        }
    }
}
