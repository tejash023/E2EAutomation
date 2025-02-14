package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginSignupPage;
import pageObjects.TestCasesPage;

public class TC07_VerifyTestCasePage extends BaseClass{


            //        1. Launch browser
            //        2. Navigate to url 'http://automationexercise.com'
            //        3. Verify that home page is visible successfully
            //        4. Click on 'Test Cases' button
            //        5. Verify user is navigated to test cases page successfully

            @Test(groups = "Master")
            public void verifyTestCasePage()
            {
                logger.info("**** TC07 Started ****");
                try {
                    HomePage homePage=new HomePage(driver);
                    homePage.clickMenuItem("Test Cases");
                    TestCasesPage testCasesPage=new TestCasesPage(driver);
                    if (testCasesPage.isTextDisplayed())
                    {
                        logger.info("Successfully Landed on Test Cases Page");
                    }
                    else
                        logger.error("Not on Test Cases Page");

                } catch (Exception e) {
                    logger.error("TC07 Test Failed");
                    logger.debug("Debug Logs");
                    Assert.fail("TC07 Test Failed");
                }
            }


}
