package Lesson06_DropDown;

import Utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c1_TestNGwithGoogle {
    // go to google
    // search for something
    // verify title
    WebDriver driver;       // class-level variable so that we can use this variable in every method in the class
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://google.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }
    @Test
    public void googleVerificationTest() {
    // xpath is for search box: //input[@title='Search']
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("macbook", Keys.ENTER);
    }
}
