package Lesson04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cSStest {
    public static void main(String[] args) throws InterruptedException {
        // setup my chrome driver before starting
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        Profile.profileOptions(options);        // don't write this line
        WebDriver driver = new ChromeDriver(options);

        // maximize my window
        driver.manage().window().maximize();

        // go to amazon
        driver.get("https://amazon.com");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("legos");
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

        // perform second search
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys(" Baby yoda");
        driver.findElement(By.cssSelector("input[value='Go']")).click();

        // quick xpath
        //"div[@id='nav-search']"

        // #id_value
        // tag[attribute='value']


    }
}
