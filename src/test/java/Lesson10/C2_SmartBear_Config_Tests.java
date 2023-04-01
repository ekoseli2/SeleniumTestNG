package Lesson10;

import Base.TestBase;
import Utilities.PropertiesReaderUtil;
import Utilities.SmartbearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class C2_SmartBear_Config_Tests extends TestBase {
    /*
    1) Open the Chrome browser
    2) Go http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    3) Click on the checkbox next to Charles Dodgeson
    4) Click on the delete button
    5) Verify if 'Charles Dodgeson' is still on the list
     */

    @Test
    public void verifyDeleteTest() {
        // 2) Go http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(PropertiesReaderUtil.getProperties("smartBearUrl"));
        SmartbearUtils.loginForSmartbearUtil(driver);

        //  3) Click on the checkbox next to Charles Dodgeson
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();

        // 4) Click on the delete button
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

        // 5) Verify if 'Charles Dodgeson' is still on the list
        List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        for (WebElement name : nameList) {
            Assert.assertFalse(name.getText().equals("Charles Dodgeson"), "Name 'Charles Dodgeson' was not deleted");
        }
        System.out.println("Name 'Charles Dodgeson' and related row was deleted ");

    }
}
