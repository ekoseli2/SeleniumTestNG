package Lesson12;

import Base.TestBase2;
import Utilities.DriverUtil;
import Utilities.PropertiesReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class c3_ExplicitlyWait extends TestBase2 {
    /*
    Implicit vs. Explicit waiting:
        Implicit:
            Used to tell the web driver to wait fora  certain amount of time before throwing a "NoSuchElementException".
            By default, this is 0 seconds.
            Written once per test method.
       Explicit:
            This tells the web driver to wat for either for a condition (boolean) or a duration (time) before throwing "ElementNotVisibleException".
            It is a more practical wait but, we must specify each element to explicitly wait for in a separate statement.
     */
    @Ignore
    @Test
    public void implicitlyWaitTest() {
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("google_url"));
        DriverUtil.closeDriver();
    }

    @Test
    public void explicitlyWaitTest() {
        WebDriverWait driverWait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(10));
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("google_url"));
        driverWait.until(ExpectedConditions.titleIs("Google"));

        WebElement searchBox = DriverUtil.getDriver().findElement(By.name("q"));

        driverWait.until(ExpectedConditions.visibilityOf(searchBox));
        driverWait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.sendKeys(PropertiesReaderUtil.getProperties("search_item"));
        searchBox.click();
    }

}



