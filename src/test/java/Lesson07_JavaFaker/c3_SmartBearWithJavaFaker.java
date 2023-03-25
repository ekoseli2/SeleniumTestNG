package Lesson07_JavaFaker;

import Utilities.WebDriverUtil;
import Utilities.smartbearUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c3_SmartBearWithJavaFaker {
    /*
    1) open chrome
    2) Go to smartbear
    3) Enter username
    4) enter password
    5) press login
    6) Click the order button
    7) Select the "family album", choose 5 of these
    8) Click calculate
    9) filll in the address information with javafaker
    10) click on the visa radio button
    11) Generate a card number with the javafaker
    12) enter expiry
    13) click process
    14) verify success message "New order has been successfully added."
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
    public void tc1_LoginForSmartBear() throws InterruptedException {
        // 3-5 will be completed with our utility class method
        smartbearUtils.loginForSmartbearUtil(driver);
        // 6) Click the order button
        driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();
       //  7) Select the "family album", choose 5 of these
        Select select = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        select.selectByIndex(1);
        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("5");
        // 8) Click calculate
        driver.findElement(By.className("btn_dark")).click();


        // 9) filll in the address information with javafaker
        WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement zip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        WebElement streetName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));

        Faker faker = new Faker();
        customerName.sendKeys(faker.name().fullName());
        streetName.sendKeys(faker.address().streetName());
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        zip.sendKeys(faker.address().zipCode().replaceAll("-",""));

        // 10) click on the visa radio button
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();

        // 11) Generate a card number with the javafaker
        WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        // 12) enter expiry
        WebElement expiryDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expiryDate.sendKeys("02/23");

        // 13) click process
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        Thread.sleep(4000);

        // 14) verify success message "New order has been successfully added."
        WebElement successMessage = driver.findElement(By.tagName("strong"));
        Assert.assertEquals(successMessage, "New order has been successfully added");
}

}
