package Lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserNavigationBasics {
    public static void main(String[] args) {
        // my setup procedure for the chromedriver to use my browser with my code
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // navigates to Amazon
        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);



    }
}
