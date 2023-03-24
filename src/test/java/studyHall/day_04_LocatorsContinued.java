package studyHall;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class day_04_LocatorsContinued {
    //Monkey Testing - Ad-Hoc Testing
    //Task
    //Go to etsy.com
    //Check all categories if any link is broken
    @Test
    public void MonkeyTest() throws InterruptedException {
        //1-Setup driver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        //2-Go to Etsy.com
        driver.get("https://www.etsy.com/");
       // Thread.sleep(3000);
        //Will wait whole 3 seconds
        //Throws an exception
        //Thread.sleep comes from java - It will stop your code execution
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //It may not wait for whole 3 seconds
        //Will not throw exception
        //Implicitly wait comes from selenium - It will wait for your driver(browser) to load

        //ul[@data-ui='top-nav-category-list']//li//a
        //ul[data-ui='top-nav-category-list'] li a
        //If we wanna go from child to parent we need use format below
        //span[@id='catnav-primary-link-66']/parent::a/parent::li

        //List all links on the header
        List<WebElement> categories=driver.findElements(By.cssSelector("ul[data-ui='top-nav-category-list'] li a"));
        int linkCount=categories.size();
        System.out.println(linkCount);

        for (int i=0; i<linkCount; i++){

            WebElement each=categories.get(i);
            each.click();
            driver.navigate().back();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        }
    }

}
