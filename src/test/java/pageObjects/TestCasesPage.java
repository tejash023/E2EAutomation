package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testCases.BaseClass;

public class TestCasesPage extends BasePage{

    public TestCasesPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div/h2[normalize-space()='Test Cases']")
    WebElement headerTextTestCasees;

    public boolean isTextDisplayed()
    {
        boolean flag=false;
        try{
            flag=headerTextTestCasees.isDisplayed();
        } catch (Exception e) {
            System.out.println("Test Case Page isn't displayed");
        }
        return flag;

    }
}
