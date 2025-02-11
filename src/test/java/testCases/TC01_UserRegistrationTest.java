package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginSignupPage;

public class TC01_UserRegistrationTest extends BaseClass {
    private static final String TEST_NAME = "Tejash";
    private static final String TEST_EMAIL = "tejash@gmail.com";
    private static final String TEST_PASSWORD = "123456";
    private static final String TEST_FIRST_NAME = "Tejas";
    private static final String TEST_LAST_NAME = "Raj";
    private static final String TEST_COMPANY = "IIM";
    private static final String TEST_ADDRESS = "BTM Layout";
    private static final String TEST_COUNTRY = "Israel";
    private static final String TEST_STATE = "Bihar";
    private static final String TEST_CITY = "Patna";
    private static final String TEST_ZIP = "843212";
    private static final String TEST_MOBILE = "8877543482";
    private static final String TEST_DAY = "23";
    private static final int TEST_MONTH = 2;
    private static final String TEST_YEAR = "1998";

    @Test
    public void userRegistrationTest(){

        logger.info("****** TC01 User Registration Test started *******");
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isPageTitleCorrect(), "Home page did not load");
        homePage.clickMenuItem("Signup");

        LoginSignupPage loginSignupPage = new LoginSignupPage(driver);
        Assert.assertTrue(loginSignupPage.isSignUpMessageDisplayed(), "Sign up message not displayed");
        logger.info("****** TC01 User Registration Test ended *******");
    }
}
