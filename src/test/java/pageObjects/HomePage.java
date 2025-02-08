package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public static String expectedTitle = "Automation Exercise";
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    // Locator for finding the link for Signup/Login
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement linkSignupLogin;

    /*
    / Method for login/Signup
    / no parameter and return type
    */
    public void clickSignupLogin()
    {
        linkSignupLogin.click();
    }

    public boolean isPageTitleCorrect(){
        String actualTitle = driver.getTitle();
        return actualTitle.contains(expectedTitle);
    }

}
