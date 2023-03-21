package Lesson04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Profile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxTest {
    // setup my chrome driver before starting
    public static void main(Sting[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        Profile.profileOptions(options);        // don't write this line
        WebDriver driver = new ChromeDriver(options);
    }
}
