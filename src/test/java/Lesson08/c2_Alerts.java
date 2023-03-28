package Lesson08;

import Utilities.BrowserUtils;
import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c2_Alerts {
    /*
    1) Open a chrome browser
    2) Go to https://renas-practice.herokuapp.com/home
    3) Navigate page:
       - element button id="selenium-Elements"
       - click alert box id="Alert BoxI"
       -  click the first 'click me' button id="alert-demo"
     4) Handle the alert
     */
WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://renas-practice.herokuapp.com/home");
    }
    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void alertTest() {
        // element button id="selenium-Elements"
        driver.findElement(By.id("selenium-Elements")).click();
        // click alert box id="Alert BoxI"
        driver.findElement(By.id("Alert BoxI")).click();
        // click the first 'click me' button id="alert-demo"
        driver.findElement(By.id("alert-demo")).click();
        BrowserUtils.wait(3);

        // handle the alert

    }

}
