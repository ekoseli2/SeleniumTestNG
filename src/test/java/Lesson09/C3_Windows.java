package Lesson09;

import Base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
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

        // this set stores ALL open windows to be able to navigate to and from different windows
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("all of the open windows handles are: ");

        // the list has indices unlike a set so we can access the windows by their index
        List<String> windowList = new ArrayList<>();

        for (String window : allWindows) {
            driver.switchTo().window(window);
            windowList.add(window);
            System.out.println("current widow handle is: " + window + "\nwith title: "+  driver.getTitle());
        }
        // What if I want to go back to the original window
        driver.switchTo().window(windowList.get(0));
        System.out.println("after switching back to the original window the title is " + driver.getTitle());

        // Now switch back to the new opened window
    }
}
