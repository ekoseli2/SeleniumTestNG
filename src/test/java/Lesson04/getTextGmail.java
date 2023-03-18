package Lesson04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getTextGmail {
    public static void main(String[] args) throws InterruptedException {
        // setup my chrome driver before starting
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        Profile.profileOptions(options);        // don't write this line
        WebDriver driver = new ChromeDriver(options);

        // maximize my window
        driver.manage().window().maximize();

        driver.get("https://google.com");

        // store a web element as an object
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        // getText method to get the text out of an element
        System.out.println("Gmail button Text contains " + gmailLink.getText());

        System.out.println("Gmail button class attribute value is " + gmailLink.getAttribute("class"));
    }
}
