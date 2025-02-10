package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginSignupPage;

public class TC01_UserRegistrationTest extends BaseClass {

    @Test
    public void userRegistrationTest(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isPageTitleCorrect(), "Home page did not load");
        homePage.clickMenuItem("Signup");

        LoginSignupPage loginSignupPage = new LoginSignupPage(driver);
        Assert.assertTrue(loginSignupPage.isSignUpMessageDisplayed(), "Sign up message not displayed");
    }
}
