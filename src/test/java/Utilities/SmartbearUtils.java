package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartbearUtils {
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

    public static void verifyStreetUtil(WebDriver driver, String streetName) {
        // to find the table -> id = ctl00_MainContent_orderGrid
        // to find the row -> //table[@id='ctl00_MainContent_orderGrid']//tr

        List<WebElement> streetList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[6]"));
        // notice that this does not hold the values of a single table cell, it holds the entire column since <tr> does not have an index
        System.out.println("All the streets on the table are:");
        for (WebElement street : streetList) {
            System.out.println(street.getText());
            if (street.getText().equals(streetName)) {
                Assert.assertTrue(true);
                System.out.println(streetName + " was found in the table");
                return;
            }
        }
        // in the case that the street entered into the method was not found, assert a failure of test
        Assert.fail("Street name :" + streetName + " is not present in the table");
    }
}
