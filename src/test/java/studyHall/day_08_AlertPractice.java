package studyHall;

import Base.TestBase;
import Utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class day_08_AlertPractice extends TestBase {
    @Override
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    public void TC_1_AlertPractice(){
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        //input[@name='cusid']
        Faker faker=new Faker();
        String random=faker.name().name();
        WebElement inputBox=driver.findElement(By.xpath("//input[@name='cusid']"));
        inputBox.sendKeys(random+ Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Alert alert=driver.switchTo().alert();
        alert.accept();


        String alertMessage=alert.getText();
        Assert.assertTrue(alertMessage.contains("Customer Successfully Delete!"));

        alert.accept();



    }

}
