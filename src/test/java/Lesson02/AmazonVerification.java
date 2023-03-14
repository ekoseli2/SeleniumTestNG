package Lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonVerification {
    public static void main(String[] args) throws InterruptedException {
        // my setup procedure for the chromedriver to use my browser with my code
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // navigates to Google
        String googleURL = "https://www.google.com/";
        driver.get(googleURL);

        // then, go to amazon
        driver.navigate().to("https://www.amazon.com/");

        Thread.sleep(1000);

        // make the window fullscreen
        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        // navigate back to google using "back button"
        driver.navigate().back();
        Thread.sleep(1000);

        // maximize the fullscreen window
        driver.manage().window().maximize();
        Thread.sleep(1000);

        // navigate forwards to amazon
        driver.navigate().forward();
        Thread.sleep(1000);

        // Verification of the title
        String expectedWordinTitle = "Don't Smile";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedWordinTitle)) {
            System.out.println("Amazon's title has the expected word: Test Passed");
        } else {
            System.out.println("Amazon's title does not have the expected word: Test Failed");
        }
        System.out.println("Amazon's title is: " + actualTitle);



        // close the web browser
        driver.quit();

    }
}
