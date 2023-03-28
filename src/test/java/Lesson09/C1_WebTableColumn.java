package Lesson09;

import Utilities.SmartbearUtils;
import Utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
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

    @Test
    public void loginTest() {
        SmartbearUtils.loginForSmartbearUtil(driver);
        // verify that we are logged in to SmartBear
        Assert.assertEquals(driver.getTitle(), "Web Orders");
    }

    @Test
    public void streetVerificationTest() {
        // Verify that the given street exists on the web table
    }
}
