package studyHall;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class day_06_CheapFlights {
    WebDriver driver=null;

    @BeforeMethod
    public void setup(){
        System.out.println("BeforeMethod is running now");
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.cheapflights.ca/");
    }

    @Test
    public void TC1_Verification(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        WebElement deleteButton=driver.findElement(By.xpath("//div[@class='vvTc-item-button']"));
        deleteButton.click();
        WebElement fromBox=driver.findElement(By.xpath("(//input[@class='k_my-input'])[1]"));
        fromBox.sendKeys("LAS");

        WebElement checkBoxAirportListFrom= driver.findElement(By.xpath("(//div[@class='JyN0-checkbox'])[1]"));
        checkBoxAirportListFrom.click();
    }

    @Test
    public void TC2_testDropdowns(){
        WebElement tripTypeDropdown=driver.findElement(By.xpath("(//div[@class='wIIH-handle'])[1]"));
        tripTypeDropdown.click();
        List<WebElement> tripTypes=driver.findElements(By.xpath("//li[@role='tab']"));

        for (WebElement each: tripTypes){
            System.out.println(each.getAttribute("aria-label"));
            if (each.getAttribute("aria-label").contains("One-way")){
                each.click();
            }
        }
    }




}
