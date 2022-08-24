package com.bridgera.automation.spectranet.testcases;

import com.bridgera.automation.framework.testcases.BaseTest;
import com.bridgera.automation.framework.testsetup.EdgeWebDriver;
import com.bridgera.automation.spectranet.pageobject.HomePage;
import com.bridgera.automation.spectranet.pageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseTest {

    public WebDriver driver = EdgeWebDriver.getEdgeWebDriver(false);
    @Test
    public void checkLoginSuccess()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage;
        loginPage.typeUsername("siteadmin@spf.com");
        loginPage.typePassword("Spf@u$er");
        homePage = loginPage.submitLogin();


    }

}
