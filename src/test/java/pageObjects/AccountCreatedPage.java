package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage {

    public AccountCreatedPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//h2[@data-qa='account-created']/b[contains(text(),'Account Created!')]")
    WebElement accountCreatedMessage;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continueButton;

    public boolean isAccountCreatedMessageDisplayed(){
        try{
            return accountCreatedMessage.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void clickContinueButton(){
        continueButton.click();
    }
}