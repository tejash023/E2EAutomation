package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginSignupPage;

public class TC02_LoginSuccess extends BaseClass{

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
        logger.info("**** Successful Login Test Start ****");
        HomePage homePage=new HomePage(driver);
        homePage.clickMenuItem("Login");
        LoginSignupPage loginSignupPage=new LoginSignupPage(driver);

        logger.info("**** Email and Password Taken from Properties file ****");

        loginSignupPage.setTextLoginEmail(p.getProperty("email"));
        loginSignupPage.setTxtPassword(p.getProperty("password"));
        loginSignupPage.clickLoginButton();
        HomePage homePage1=new HomePage(driver);
        WebElement loggedInAs=homePage1.getMenuElement("Logged in as"+" abc");
        Assert.assertTrue(loggedInAs.isDisplayed(),"loggedInAs is not displayed");
        Assert.assertTrue(homePage1.getMenuElement("Logout").isDisplayed());
        homePage1.getMenuElement("Logout").click();

        logger.info("**** TC02_Successful Login Completed ****");

    }

}
