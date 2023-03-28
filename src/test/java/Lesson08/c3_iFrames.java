package Lesson08;

import Utilities.BrowserUtils;
import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c3_iFrames {
    /*
    1) Open a chrome browser
    2) Go to http://the-internet.herokuapp.com/iframe
    3) Write a message onto the page
        - There is a twist
     */
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://the-internet.herokuapp.com/iframe");
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void iframeTest() {
        // first we need to switch to the nested/independent HTML document  also known as iFrame
        // you can choose the frame using its webelement or index or ID attribute
        driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.id("tinymce"));
        // first clear the message
        textBox.clear();
        // next sendKeys to write new message
        textBox.sendKeys("Ekrem was here");
        BrowserUtils.wait(3);

        // you need to choose which document you are going to work on
        // switch to the parent/main html document driver.switchTo().parentFrame()
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.className("example")).getText());
    }
}
