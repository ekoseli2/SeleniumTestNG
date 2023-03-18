package Lesson04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Profile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWait {
        public static void main(String[] args) throws InterruptedException {
            // setup my chrome driver before starting
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            Profile.profileOptions(options);        // don't write this line
            WebDriver driver = new ChromeDriver(options);

            // maximize my window
            driver.manage().window().maximize();

            // remember thread.sleep

            // go to vinexponewyork.com
            driver.navigate().to("https://vinexponewyork.com");
        }
}
