package Lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserNavigationBasics {
    public static void main(String[] args) throws InterruptedException {
        // my setup procedure for the chromedriver to use my browser with my code
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // navigates to Google
        String googleURL = "https://www.google.com/";
        driver.get(googleURL);

        // make the browser larger (maximize)
        driver.manage().window().maximize();

        // get the title of a website

        // every time thread sleep is here, I can make my webdriver wait.
        Thread.sleep(2500);

        // get current title
        System.out.println("current title of the page is " + driver.getTitle());
        System.out.println("current url of the page is " + driver.getCurrentUrl());


        // do the same tasks as above, but for tesla.com
        String teslaURL = "https://www.tesla.com/";
        driver.get(teslaURL);
        System.out.println("current title of the page is " + driver.getTitle());

        Thread.sleep(2500);
        driver.quit();
    }
}
