package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentials() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLogin();

        Assert.assertTrue(
                loginPage.isMessageDisplayed(),
                "Login should be successful"
        );
    }

    @Test
    public void loginWithInvalidPassword() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("WrongPassword");
        loginPage.clickLogin();

        Assert.assertTrue(
                loginPage.isMessageDisplayed(),
                "Error message should be displayed"
        );
    }
}
