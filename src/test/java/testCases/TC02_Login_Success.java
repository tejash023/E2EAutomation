package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TC02_Login_Success extends BaseClass{

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
        HomePage hp=new HomePage(driver);
        hp.clicksignup_login();
    }

}
