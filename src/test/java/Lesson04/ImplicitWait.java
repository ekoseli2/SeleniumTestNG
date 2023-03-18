package Lesson04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

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

            // make an implicit wait to force your driver to not perform the test until after the element is on the page
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


            WebElement percent = driver.findElement(By.xpath("/html/body/div[@class='elementor elementor-585']/div[@class='elementor-inner']/div/section[3]//div[@class='elementor-row']/div[4]//div[@class='elementor-element elementor-element-0e178a7 elementor-widget elementor-widget-counter']//span[@class='elementor-counter-number']"));
            System.out.println(percent.getText());

            driver.findElement(By.cssSelector("a[href='/attend/']")).click();

        }
}
