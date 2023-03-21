package Lesson06_DropDown;

import Utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
    @Test
    public void test() {

    }
}
