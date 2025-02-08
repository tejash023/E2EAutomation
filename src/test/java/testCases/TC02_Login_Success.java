package testCases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginSignupPage;

public class TC02_Login_Success extends BaseClass{

    private static final Logger log = LoggerFactory.getLogger(TC02_Login_Success.class);

    /*
        / Successful Login Test Steps to be followed
        / Click on 'Signup / Login' button
        / Verify 'Login to your account' is visible
        / Enter correct email address and password
        / Click 'login' button
        / Verify that 'Logged in as username' is visible
        / Click 'Delete Account' button
        / Verify that 'ACCOUNT DELETED!' is visible
        */
    @Test
    public void login()
    {
        HomePage homePage=new HomePage(driver);
        homePage.clickSignupLogin();
        LoginSignupPage loginSignupPage=new LoginSignupPage(driver);
        loginSignupPage.setTextSignUpEmail("qwerty09109@gmail.com");
        loginSignupPage.setTxtPassword("password123");
        loginSignupPage.click();
    }

}
