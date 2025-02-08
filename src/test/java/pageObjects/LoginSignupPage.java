package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginSignupPage extends BasePage{
    public LoginSignupPage(WebDriver driver){
        super(driver);
    }

    //Signup Text
    @FindBy(xpath = "//*[@class='signup-form']/h2[contains(text(),'New User Signup!')]")
    WebElement signUpMessage;

    //Signup Name
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement textSignUpName;

    //Signup Email
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement textSignUpEmail;

    //SignUp Button
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signUpButton;

    public void setTextSignUpName(String name){
        textSignUpName.sendKeys(name);
    }

    public void setTextSignUpEmail(String email){
        textSignUpEmail.sendKeys(email);
    }

    public void clickSignUpButton(){
        wait.until(ExpectedConditions.visibilityOf(signUpButton));
        signUpButton.click();
    }

}
