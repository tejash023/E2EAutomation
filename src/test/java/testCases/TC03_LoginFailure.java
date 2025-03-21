package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginSignupPage;

public class TC03_LoginFailure extends BaseClass{
    /*
    / Test Steps to be followed for Failure in Login
    / Click on 'Signup / Login' button
    / Verify 'Login to your account' is visible
    / Enter incorrect email address and password
    / Click 'login' button
    / Verify error 'Your email or password is incorrect!' is visible
    */
    @Test(groups = "Master")
    public void loginFailure()
    {
        logger.info("**** TC03 Login Failure Test Case Started ****");
        try{
            HomePage homePage=new HomePage(driver);
            homePage.clickMenuItem("Login");
            LoginSignupPage loginSignupPage=new LoginSignupPage(driver);
            loginSignupPage.setTextLoginEmail(p.getProperty("email"));
            loginSignupPage.setTxtPassword("password1234");
            loginSignupPage.clickLoginButton();
            Assert.assertTrue(loginSignupPage.isLoginErrorMessageDisplayed(),"Error Message isn't displayed");
        } catch (Exception e) {
            logger.error("TC03 Test Failed");
            logger.debug("Debug Logs");
            Assert.fail("TC03 Test Failed");
        }

        logger.info("**** TC03 Login Failure Test Case Successfully Completed ****");

    }
}
