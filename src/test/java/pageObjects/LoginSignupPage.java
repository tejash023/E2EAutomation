package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginSignupPage extends BasePage{
    public LoginSignupPage(WebDriver driver){
        super(driver);
    }

    //Locator password
    @FindBy(name="password")
    WebElement txtPassword;

    //Locator Signup Message
    @FindBy(xpath = "//*[@class='signup-form']/h2[contains(text(),'New User Signup!')]")
    WebElement signUpMessage;

    //Locator Signup Name
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement textSignUpName;

    //Locator Signup Email
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement textSignUpEmail;

    //Locator Login Email
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement textLoginEmail;

    //Locator SignUp Button
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signUpButton;

    //Locator Login Button
    @FindBy(xpath = "//button[text()='Login']")
    WebElement btnLogin;

    //Locator Error Message Text for Login Failure
    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    WebElement txtErrorLogin;

    public void setTextSignUpName(String name){
        textSignUpName.sendKeys(name);
    }

    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void setTextSignUpEmail(String email){
        textSignUpEmail.sendKeys(email);
    }

    public void setTextLoginEmail(String email)
    {
        textLoginEmail.sendKeys(email);
    }

    public void clickLoginButton()
    {
        btnLogin.click();
    }

    public void clickSignUpButton(){
        wait.until(ExpectedConditions.visibilityOf(signUpButton));
        signUpButton.click();
    }

    public boolean isSignUpMessageDisplayed(){
        try{
            return signUpMessage.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public boolean isLoginErrorMessageDisplayed()
    {
        return txtErrorLogin.isDisplayed();
    }

}
