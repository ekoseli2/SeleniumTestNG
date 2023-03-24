package studyHall;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day_05_Dropdown_Practice {
//https://chercher.tech/practice/practice-dropdowns-selenium-webdriver
//Dropdowns --> HTML/Static dropdown ---- Select/Dynamic Dropdown
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.out.println("BeforeMethod is running now");
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
    }
    @AfterMethod
    public void closing(){
        System.out.println("After method is running now");
     //   driver.close();
    }

    @Test
    public void TC1_Dropdown(){
        WebElement firstDropdown=driver.findElement(By.xpath("//select[@id='first']"));
        WebElement secondDropdown=driver.findElement(By.xpath("//select[@id='animals']"));
        WebElement thirdDropdown=driver.findElement(By.xpath("//select[@id='second']"));
        //In how many ways we locate dropdowns?
        Select select=new Select(firstDropdown);
        //We can select option in three different ways
        select.selectByIndex(2);
        select.selectByValue("Yahoo");
        select.selectByVisibleText("Iphone");

        select=new Select(secondDropdown);
        select.selectByIndex(1);

        select=new Select(thirdDropdown);

        for (int i=0; i<select.getOptions().size(); i++){
            if(select.getOptions().get(i).getText().contains("Burger")){

                select.selectByIndex(i);

            } else if(!select.getOptions().get(i).getText().contains("Burger")) {

                System.out.println("The option provided is not present in the dropdown");
            }

            System.out.println(select.getOptions().get(i).getText());



        }



    }


}
