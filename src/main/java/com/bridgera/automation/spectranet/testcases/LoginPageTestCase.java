package com.bridgera.automation.spectranet.testcases;

import com.bridgera.automation.framework.testcases.BaseTest;
import com.bridgera.automation.framework.testsetup.EdgeWebDriver;
import com.bridgera.automation.spectranet.pageobject.HomePage;
import com.bridgera.automation.spectranet.pageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

import static org.testng.Assert.assertTrue;
import static com.bridgera.automation.framework.Reports.ExtentTestManager.startTest;


public class LoginPageTestCase extends BaseTest {

    public WebDriver driver = EdgeWebDriver.getEdgeWebDriver(false);
    @Test(priority = 0, description = "Valid Login Scenario with valid username and password.")
    public void checkLoginSuccess(Method method) throws InterruptedException {
        //ExtentReports Description
        startTest(method.getName(), "Valid Login Scenario with valid username and password.");
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage;
        loginPage.typeUsername("siteadmin@spf.com");
        loginPage.typePassword("Spf@u$er");
        homePage = loginPage.submitLogin();
        Thread.sleep(5000);
        assertTrue(homePage.checkHomePage());
    }
}
