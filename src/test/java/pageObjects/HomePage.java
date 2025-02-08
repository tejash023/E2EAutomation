package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    // Locator for finding the link for Signup/Login
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement btnsignup_login;

    /*
    / Method for login/Signup
    / no parameter and return type
    */
    public void clicksignup_login()
    {
        btnsignup_login.click();
    }
}
