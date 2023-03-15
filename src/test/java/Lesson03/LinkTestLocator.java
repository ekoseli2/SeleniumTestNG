package Lesson03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkTestLocator {
    public static void main(String[] args) throws InterruptedException {
        // create the driver instance
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // go to google.com and then press the gmail link
        driver.get("https://google.com");
        Thread.sleep(1000);

        // find the Link Text = gmail and click it
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(1000);

        driver.close();
    }
}
