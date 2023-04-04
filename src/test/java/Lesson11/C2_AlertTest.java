package Lesson11;

import Base.TestBase2;
import Utilities.BrowserUtils;
import Utilities.DriverUtil;
import Utilities.PropertiesReaderUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C2_AlertTest extends TestBase2 {
    /*
    1) Go to http://the-internet.herokuapp.com/
    2) Click "JavaScript Alerts" //a[.='JavaScript Alerts']
    3) Click "JS Prompts" //button[.='Click for JS Prompt']
    4) Enter "Hello World" text into the Alert
    5) Click "okay"
    6) Validate your text appearing on the page
     */

    @Test
    public void alertPracticeTest() {
        // 1) Go to http://the-internet.herokuapp.com/
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("herokuapp"));

        // 2) Click "JavaScript Alerts" //a[.='JavaScript Alerts']
        DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']")).click();

        // 3) Click "JS Prompts" //button[.='Click for JS Prompt']
        DriverUtil.getDriver().findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        // 4) Enter "Hello World" text into the Alert
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        alert.sendKeys("Hello World");
        BrowserUtils.wait(1);

        // 5) Click "okay"
        alert.accept();

        // 6) Validate your text appearing on the page
        WebElement actualText = DriverUtil.getDriver().findElement(By.id("result"));
        Assert.assertTrue(actualText.getText().contains("Hello World"));
    }

}
