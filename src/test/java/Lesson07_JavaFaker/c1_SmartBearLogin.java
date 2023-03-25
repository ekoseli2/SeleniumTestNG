package Lesson07_JavaFaker;

import Utilities.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c1_SmartBearLogin {
    /*
    1) open chrome
    2) Go to smartbear
    3) Enter username
    4) enter password
    5) press login
    6) Verify the title is as expected
     */
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }
    @Test
    public void tc1_LoginForSmartBear() {
        // 3-5 will be completed with our utility class method
        smartbearUtils.loginForSmartbearUtil(driver);
        // 6) verify title
        Assert.assertTrue(driver.getTitle().equals("Web Orders"), "Title verification failed");
    }
}
