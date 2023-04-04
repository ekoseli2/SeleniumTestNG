package Lesson11;

import Base.TestBase2;
import Utilities.BrowserUtils;
import Utilities.DriverUtil;
import Utilities.PropertiesReaderUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C3_ActionsTest extends TestBase2 {
    /*
    1) Go to https://demo.guru99.com/test/simple_context_menu.html
    2) Double-click the "double click" button
    3) Then accept the alert that pops up
     */
    Actions actions = new Actions(DriverUtil.getDriver());;
    @Test
    public void doubleClickTest() {
        // 1) Go to https://demo.guru99.com/test/simple_context_menu.html
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("demoguruSCM"));

        // 2) Double-click the "double click" button
        WebElement doubleClickButton = DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClickButton).perform();

        // 3) Then accept the alert that pops up
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        alert.accept();
    }
}
