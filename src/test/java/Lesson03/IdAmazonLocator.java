package Lesson03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdAmazonLocator {
    public static void main(String[] args) throws InterruptedException {
        // create the driver instance
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        Profile.profileOptions(options);                    // don't write this line
        WebDriver driver = new ChromeDriver(options);

        // maximize the window
        Thread.sleep(1000);
        driver.manage().window().maximize();


        // open amazon page
        driver.get("https://amazon.com");
        Thread.sleep(2000);

        // id locator to press the amazon button
        driver.findElement(By.id("nav-logo-sprites")).click();
        Thread.sleep(2000);

        // go back to the amazon home page
        driver.navigate().back();

        // search "iphone 14 pro max phone case"
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max phone case");
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(8000);

        driver.quit();
    }
}
