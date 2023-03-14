package Lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NameLocatorGoogle {
    public static void main(String[] args) throws InterruptedException {
        // my setup procedure for the chromedriver to use my browser with my code
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // navigates to Google
        String googleURL = "https://www.google.com/";
        driver.get(googleURL);

        // Name locator
        WebElement GoogleSearchBox = driver.findElement(By.name("q"));
        // this method is for typing into elements
        GoogleSearchBox.sendKeys("Walmart's Lowest Prices");

        Thread.sleep(2500);

        // Now press the search button (like mouse)
        WebElement GoogleSearchButton = driver.findElement(By.name("btnK"));
        GoogleSearchButton.click();

        Thread.sleep(4000);

        driver.close();

    }
}
