package studyHall;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class day_03_Locators {
    //TASK 1
    //1. Open Chrome browser
    //2. Go to https://demo.guru99.com/test/radio.html
    //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
    //4. Click to checkbox3
    //5. Verify checkbox3 is selected
    public static void main(String[] args) throws InterruptedException {
        //Setup the browser
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        //Maximize window
        Thread.sleep(1000);
        driver.manage().window().maximize();

        //Open the URL given in the task
        driver.get("https://demo.guru99.com/test/radio.html");
        //input[@type='checkbox']
        //input[@value='checkbox3']

        //Here it will locate only one element
        WebElement checkbox3=driver.findElement(By.xpath("//input[@value='checkbox3']"));
        //Here it will locate multiple elements
        List<WebElement> allcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

        //Here we are going to check if all checkboxes are not selected.
        //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
        for (WebElement each : allcheckboxes){
            if (!each.isSelected()){
                System.out.println(each.getAttribute("value")+"Is not selected");


            }else {

                System.out.println(each.getAttribute("value")+" is selected");
            }


        }

        //4. Click to checkbox3
        checkbox3.click();

        //5. Verify checkbox3 is selected
        if (checkbox3.isSelected()){

            System.out.println("Checkbox3 is already selected");

        } else {

            checkbox3.click();

        }


        //TASK 2
        //1. Open Chrome browser
        //2. Go to https://demo.guru99.com/test/radio.html
        //3. Verify all radio buttons are not selected (you can use findelements to store in list and use for loop to validate)
        //4. Click to radio2
        //5. Verify radio2 is selected

        //input[@type='radio']
        //input[@value='Option 2']




    }
}
