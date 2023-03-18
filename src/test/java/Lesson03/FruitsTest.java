package Lesson03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FruitsTest {
    public static void main(String[] args) throws InterruptedException {
        // create the driver instance
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        Profile.profileOptions(options);        // don't write this line
        WebDriver driver = new ChromeDriver(options);

        // Opens fruits html on my computer, your path will be different
        driver.get("C:\\Users\\HP\\IdeaProjects\\SeleniumTestNG\\src\\Fruits.html");

        // Click mango 3 using value banana from the html
        driver.findElement(By.xpath("//input[@value='Banana']")).click();

        // Click the Potato button with xpath
        driver.findElement(By.xpath("//input[@name='group2']")).click();
    }
}
