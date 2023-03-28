package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class smartbearUtils {
    public static void loginForSmartbearUtil(WebDriver driver) {
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement passWord = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement logIn = driver.findElement(By.id("ctl00_MainContent_login_button"));

        userName.sendKeys("Tester");
        passWord.sendKeys("test");
        logIn.click();
    }

    public static void negativeLoginForSmartbearUtil(WebDriver driver, String userID, String passID) {
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement passWord = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement logIn = driver.findElement(By.id("ctl00_MainContent_login_button"));

        userName.sendKeys(userID);
        passWord.sendKeys(passID);
        logIn.click();
    }
}
