package Lesson09;

import Utilities.SmartbearUtils;
import Utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class C1_WebTableColumn {
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
    public void loginTest() {
        SmartbearUtils.loginForSmartbearUtil(driver);
        // verify that we are logged in to SmartBear
        Assert.assertEquals(driver.getTitle(), "Web Orders");
    }

    @Test(dataProvider = "Street Name Library")
    public void streetVerificationTest(String streetName) {
        // Verify that the given street exists on the web table
        SmartbearUtils.loginForSmartbearUtil(driver);
        SmartbearUtils.verifyStreetUtil(driver, streetName);
    }

    @DataProvider(name = "Street Name Library")
    public static Object[][] test() {
        return new Object[][] {
                {"7, Flower Street"},
                {"23, Owk Street"},
                {"fake address"},
                {"17, Park Avenue"}
        };
    }
}
