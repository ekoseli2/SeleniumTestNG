package firstCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainSelenium {
    public static void main(String[] args) {
        // My maven project still works like a normal java code
        System.out.println("Hello World");

        // set up driver before creating it
        WebDriverManager.chromedriver().setup();

        // Special object that can control my web browser
        WebDriver driver = new ChromeDriver();

        // navigate to facebook on google chrome
        String facebookURL = "https://www.facebook.com/";
        // .get method opens a link
        driver.get(facebookURL);
    }
}