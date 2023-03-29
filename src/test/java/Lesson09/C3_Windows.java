package Lesson09;

import Base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class C3_Windows extends TestBase {
    @Test
    public void multiWindowTest() {
        // 1) navigate to https://renas-practice.herokuapp.com/home
        driver.get("https://renas-practice.herokuapp.com/home");
        //2) click on elements
        //    id="selenium-Elements"
        driver.findElement(By.id("selenium-Elements")).click();
        // 3) click on windows
        //    id="WindowsII"
        driver.findElement(By.id("WindowsII")).click();

        // press the "click me" button which opens a new window
        driver.findElement(By.id("open-window")).click();

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("all of the open windows handles are: ");
        for (String window : allWindows) {
            driver.switchTo().window(window);
            System.out.println("current widow handle is: " + window + "\nwith title: " driver.getTitle());
        }
    }
}
