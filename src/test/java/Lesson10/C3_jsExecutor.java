package Lesson10;

import Base.TestBase;
import Utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C3_jsExecutor extends TestBase {
    @Ignore
    @Test
    public void handlingWindowsTest() {
        driver.get("https://statefarm.com");
        ((JavascriptExecutor)driver).executeScript("window.open('https://tesla.com');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://google.com');");
    }
    @Test
    public void scrollTest() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("http://demo.guru99.com/test/guru99home/");
        jse.executeScript("window.scroll(0, 3000)");
        BrowserUtils.wait(3);
        jse.executeScript("window.scrollBy(0,-3000)");

    }
}

/*
        The syntax of ScrollBy() methods is :

        executeScript("window.scrollBy(x-pixels,y-pixels)");
        x-pixels is the number at x-axis,
        it moves to the left if number is positive and
        it move to the right if number is negative .

        y-pixels is the number at y-axis,
        it moves to the down if number is positive and
        it move to the up if number is in negative .
*/