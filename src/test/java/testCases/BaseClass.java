package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    public static Properties p;
    public static WebDriver driver;
    public static Logger logger;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws IOException {
        /*
        / Below snippet to load the properties file
         */
        FileReader file=new FileReader("./src//test//resources//config.properties");
        p=new Properties();
        p.load(file);

        logger= LogManager.getLogger(this.getClass());

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown()
    {
        driver.quit(); // Changed to quit since the connection was getting reset due to close being used
    }
}
