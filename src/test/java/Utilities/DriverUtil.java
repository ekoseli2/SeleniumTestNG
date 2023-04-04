package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverUtil {
    // Constructor
    // to be able to achieve singleton design pattern we will need a private constructor
    // this design will make it impossible to create an object outside of this specific class file
    private DriverUtil() {
    }

    // making the driver instance private: other classes still can this but they'll need to use
    // Setters and Getter methods which are public:
    private static WebDriver driver;
    // Getter
    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = PropertiesReaderUtil.getProperties("browser");
            switch (browser) {
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
                    break;

                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "chrome-headless" :
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    options.setHeadless(true);
                    driver = new ChromeDriver(options);
                    break;

                case "firefox-headless" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
            }
        }
        return driver;
    }

    // Where is the setter? In this case the config.prop file: browser =
    // It will not be used in this class

    // Member method
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
