package studyHall;

import Base.TestBase;
import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class day_09_IFrame_WindowHandles extends TestBase {
    //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
//        Go to the above URL.
//        Get the current window's handle and write to the console window. It must be the first window handle.
//        Locate the "Visit W3Schools.com!" link and click it.
//        Get all window handles and hold them in a list.
//        Write to total window handle number to the console. It must be 2.
//        Switch t the second window.
//        Get the current window's handle and write to the console window. It must be a second window handle.
//        Check the upper left side logo in the second window.
//        Go back (Switch) to the first window.
//        Get the current window's handle and write to the console window. It must be the first window handle.
//        Check the See Run Button Text. It must contain "Run >" text.
    @Override
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    }
    @Test
    public void TC_W3SchoolWindowIframeTest(){
        String currentWindowAtThisPoint=driver.getWindowHandle();
        System.out.println(currentWindowAtThisPoint);
        System.out.println(driver.getTitle());

        driver.switchTo().frame("iframeResult");
        WebElement W3SchoolLink=driver.findElement(By.xpath("//a[.='Visit W3Schools.com!']"));
        W3SchoolLink.click();
//        driver.switchTo().defaultContent();
//        driver.switchTo().parentFrame();
        //If we see No Such Element Exception there are three reasons;
        //Your locator could be wrong
        //You element could be dynamic
        //There might be an Iframe

        Set<String> allwindows=driver.getWindowHandles();
        System.out.println(allwindows.size()); // This will tell how many windows are opened at this point
        List<String> windowsList=new ArrayList<>();
        for (String eachWindow:allwindows){
            windowsList.add(eachWindow);
            driver.switchTo().window(eachWindow);
            System.out.println(driver.getTitle()+" is the current title");
            //Additional check
//            if(driver.getTitle().contains("Online")){
//               break;
//            }
        }
        WebElement W3LogoOnSecondWindow=driver.findElement(By.xpath("//a[@title='Home']"));
        Assert.assertTrue(W3LogoOnSecondWindow.getAttribute("title").equalsIgnoreCase("Home"));

        System.out.println(currentWindowAtThisPoint);
        driver.switchTo().window(windowsList.get(0));
        System.out.println(currentWindowAtThisPoint);
        System.out.println(driver.getTitle());

        WebElement runButton=driver.findElement(By.id("runbtn"));
        // Two types of Assertions : Soft Assertion and Hard Assertion
        //This is example hard assertion
        Assert.assertTrue(runButton.isDisplayed());

        //Soft Assertion
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(runButton.isDisplayed());

    }



}
