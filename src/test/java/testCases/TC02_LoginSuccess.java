package testCases;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginSignupPage;

public class TC02_LoginSuccess extends BaseClass{

    private static final Logger log = LoggerFactory.getLogger(TC02_LoginSuccess.class);

    /*
        / Test Steps to be followed for Successful Login
        / Click on 'Signup / Login' button
        / Verify 'Login to your account' is visible
        / Enter correct email address and password
        / Click 'login' button
        / Verify that 'Logged in as username' is visible
        / Verify Logout Button is visible
        / Click 'Logout' button
        */
    @Test
    public void login()
    {
        HomePage homePage=new HomePage(driver);
        homePage.clickSignupLogin();
        LoginSignupPage loginSignupPage=new LoginSignupPage(driver);
        loginSignupPage.setTextLoginEmail(p.getProperty("email"));
        loginSignupPage.setTxtPassword(p.getProperty("password"));
        loginSignupPage.clickLoginButton();
        HomePage homePage1=new HomePage(driver);
        WebElement loggedInAs=homePage1.getMenuElement("Logged in as"+" abc");
        Assert.assertTrue(loggedInAs.isDisplayed(),"loggedInAs is not displayed");
        Assert.assertTrue(homePage1.getMenuElement("Logout").isDisplayed());
        homePage1.getMenuElement("Logout").click();

    }

}
