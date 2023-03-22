package Lesson06_DropDown;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c3_SmartBearLogin {
    /*
    1) open chrome
    2) Go to smartbear
    3) Enter username
    4) enter password
    5) press login
    6) Verify the title is as expected
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
    public void loginVerification() throws InterruptedException {
        // steps 3-6 are here
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement passWord = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement logIn = driver.findElement(By.id("ctl00_MainContent_login_button"));

        userName.sendKeys("Tester");
        Thread.sleep(1000);
        passWord.sendKeys("test");
        Thread.sleep(1000);
        logIn.click();
        Thread.sleep(6000);


    }
}
