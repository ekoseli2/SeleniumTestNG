package Lesson08;

import Utilities.WebDriverUtil;
import Utilities.smartbearUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class c4_NegativeTest {
    // navigate "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx"
    // run a series of tests that are designed to fail logging in
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
        // driver.quit();
    }
    @Test (dataProvider = "myLibrary")
    public void negativeLoginTest(String userID, String passID) {
        smartbearUtils.negativeLoginForSmartbearUtil(driver, userID, passID);
    }

    @DataProvider (name = "myLibrary")
    public static Object[][] invalidUserCredentials() {
        return new Object[][] {
                {"ekrem", "renas123"},
                {"bean", "eat.123"},
                {"banana","dsfew!@#@"},
                {"Grandou", "BANodufa"},
                {"219838182", "<>i2313"},
                // this one will login properly
                {"Tester", "test"}
        };
    }

}
