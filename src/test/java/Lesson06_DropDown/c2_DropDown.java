package Lesson06_DropDown;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c2_DropDown {
    // 1. Open Chrome browser
    //  2. Go to 'the-internet' http://the-internet.herokuapp.com/
    // 3. Click on the dropdown
    // 4. confirm the details

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }
    @Test
    public void verifyDropDown() {
        // Click on the dropdown
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        WebElement dropDownBox = driver.findElement(By.id("dropdown"));
        // confirm that the default value is "Please select an option"
        Select dropDownOptions = new Select(dropDownBox);
        // test cases
        String expectedDefaultOption = "Please select an option";
        String actualDefaultOption = dropDownOptions.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDefaultOption, expectedDefaultOption, "The verification has failed");
    }
    @Test
    public void verifyOptions() throws InterruptedException {
        // Second test which verifies the options one at a time
        // Click on the dropdown
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        WebElement dropDownBox = driver.findElement(By.id("dropdown"));

        // confirm that the default value is "Please select an option"
        Select dropDownOptions = new Select(dropDownBox);
        Thread.sleep(2000);

        dropDownOptions.selectByIndex(2);
        Thread.sleep(2000);

        dropDownOptions.selectByVisibleText("Option 1");
        Thread.sleep(2000);

        dropDownOptions.selectByValue("2");
        Thread.sleep(2000);
    }
}
