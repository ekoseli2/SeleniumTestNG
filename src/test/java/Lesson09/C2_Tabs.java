package Lesson09;

import Base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class C2_Tabs extends TestBase {
    // you are adding new features ("extensions/methods") to a base class

    @Test
    public void tabHandleTest() {
    // 1) navigate to https://renas-practice.herokuapp.com/home
        driver.get("https://renas-practice.herokuapp.com/home");
    //2) click on elements
    //    id="selenium-Elements"
        driver.findElement(By.id("selenium-Elements")).click();
    // 3) click on windows
    //    id="WindowsII"
        driver.findElement(By.id("WindowsII")).click();

        // it will store your window which you are on
        String currentWindow = driver.getWindowHandle();

        System.out.println("current window: " + currentWindow);
        System.out.println("current title: " + driver.getTitle());

        // click on the "click me" button to open new tab
        driver.findElement(By.id("open-tab")).click();
        System.out.println("after pressing new tab -> current title: " + driver.getTitle());

        // notice the 's' at the end compared to before
        Set<String> allOpenTabs = driver.getWindowHandles();
        // now lets get the title of each open tab in the window
        System.out.println("-> All open tabs are:");
        for (String tab : allOpenTabs) {
            driver.switchTo().window(tab);
            System.out.println(driver.getTitle());
        }
    }

}
