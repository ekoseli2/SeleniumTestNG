package studyHall;

import Utilities.BrowserUtils;
import Utilities.SmartbearUtils;
import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class day_07_Overview_DataTable {
    //table[@id='ctl00_MainContent_orderGrid']//tbody//tr[9]//td
    //table[@id='ctl00_MainContent_orderGrid']//tbody//tr -- you can use this xpath to get to know how many rows are there
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
        SmartbearUtils.loginForSmartbearUtil(driver);
        BrowserUtils.wait(3);
        // This is the format to find table values in selenium
        // table element/table path/ table row/ table cell
        List<WebElement> sizeofOrders=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr"));
        int size=sizeofOrders.size();
        System.out.println(size);
        //This is a dynamic locator
        List<WebElement> tableData=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr["+size+"]//td"));
        for (WebElement each:tableData){

            System.out.println(each.getText());
        }
    }

}
