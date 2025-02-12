package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HomePage extends BasePage {
    public static String expectedTitle = "Automation Exercise";

    public HomePage(WebDriver driver) {
        super(driver);
    }


    /* Used New logic to find all the elements of the Menu Bar
    // Locator for finding the link for Signup/Login
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement linkSignupLogin;
     */

    /*
    / menu would contain all the elements on the menu bar either before login or after login
     */
    WebElement menuBar= driver.findElement(By.xpath("//div[@class='shop-menu pull-right']"));
    List<WebElement> menu = menuBar.findElements(By.tagName("a"));

    /*
    / Method for Clicking menubar Items
    / pass the element name displayed on UI and no return type
    */
    public void clickMenuItem(String menuItem) {
        WebElement item = null;
        try
        {
            for (WebElement e : menu)
            {
                if (e.getText().contains(menuItem)) {
                    e.click();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Please pass correct input");
        }
    }

    public boolean isPageTitleCorrect() {
        String actualTitle = driver.getTitle();
        return actualTitle.contains(expectedTitle);
    }

    /*
    / Input Parameter - the text on the Menu Screen
    / Valid inputs - Home, Products, Cart, Logout, Delete Account, Test Cases, API Testing, Video Tutorials, Contact us, Logged in as username
     */
    public WebElement getMenuElement(String menuItem) {
        WebElement item = null;
        try
        {
            for (WebElement e : menu)
            {
                if (e.getText().equalsIgnoreCase(menuItem)) {
                    item=e;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Please pass correct input");
        }
        return item;
    }

}
