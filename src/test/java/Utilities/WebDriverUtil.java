package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

//WebDriverUtil.getDriver("safari") to call this method from another class
public class WebDriverUtil {
    public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            // we can also make chrome options
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            // dont add the two lines below
            //options.addArguments("--user-data-dir=C:\\Users\\HP\\AppData\\Local\\Google\\Chrome\\User Data");
            //options.addArguments("--profile-directory=Profile 4");
            return new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("Invalid browser provided\nBrowser " + browser + " not supported");
            return null;
        }
    }
}

