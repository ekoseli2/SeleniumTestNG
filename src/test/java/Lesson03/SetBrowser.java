package Lesson03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SetBrowser {
    public static void main(String[] args) {
        String googleURL = "https://google.com";
        // Safari
/*        WebDriverManager.safaridriver().setup();
        WebDriver sDriver = new SafariDriver();
        sDriver.get(googleURL);*/

        // Firefox
        WebDriverManager.firefoxdriver().setup();
        WebDriver fDriver = new FirefoxDriver();
        fDriver.get(googleURL);

        // Edge
        WebDriverManager.edgedriver().setup();
        WebDriver eDriver = new EdgeDriver();
        eDriver.get(googleURL);

        // Chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver cDriver = new ChromeDriver(options);
        cDriver.get(googleURL);

        // sDriver.quit();
        fDriver.quit();
        eDriver.quit();
        cDriver.quit();
    }
}
