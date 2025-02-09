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
    @Test
    public void login()
    {
        HomePage homePage=new HomePage(driver);
        homePage.clickSignupLogin();
        LoginSignupPage loginSignupPage=new LoginSignupPage(driver);
        loginSignupPage.setTextLoginEmail("qwerty09109@gmail.com");
        loginSignupPage.setTxtPassword("password1234");
        loginSignupPage.clickLoginButton();
        Assert.assertTrue(loginSignupPage.isLoginErrorMessageDisplayed(),"Error Message isn't displayed");

    }
}
