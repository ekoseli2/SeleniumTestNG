package Lesson11;

import Base.TestBase2;
import Utilities.DriverUtil;
import Utilities.PropertiesReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1_DriverUtilTest extends TestBase2 {
    /*
    1) Go to google website
    2) Search for 'when can I break my fast in San Francisco time'
    3) Verify test with the search title
     */
    @Test
    public void practiceTest() {
        // 1) Go to google website
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("google_url"));

        // 2) Search for 'when can I break my fast in San Francisco time'
        WebElement searchBox = DriverUtil.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(PropertiesReaderUtil.getProperties("search_item"));
        searchBox.sendKeys(Keys.ENTER);

        // 3) Verify test with the search title
        String searchItem = PropertiesReaderUtil.getProperties("search_item");
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));
    }
}
