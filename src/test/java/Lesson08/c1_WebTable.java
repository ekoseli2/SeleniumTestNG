package Lesson08;

import Utilities.BrowserUtils;
import Utilities.WebDriverUtil;
import Utilities.smartbearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c1_WebTable {
    /*
    1) Open Chrome browser and login to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    2) Click on "View all Orders"
    3) Verify that Mark Smith has street address "9, Maple Valley"
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
    public void tableTest() {
        smartbearUtils.loginForSmartbearUtil(driver);
        BrowserUtils.wait(3);
        // This is the format to find table values in selenium
        // table element/table path/ table row/ table cell
        WebElement markStreet = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[3]/td[6]"));
        System.out.println("Mark's street address is " + markStreet.getText());
        String actualStreet = markStreet.getText();
        String expectedStreet = "9, Maple Valley";
        Assert.assertEquals(actualStreet, expectedStreet, "Street name verification failed");
    }
}
