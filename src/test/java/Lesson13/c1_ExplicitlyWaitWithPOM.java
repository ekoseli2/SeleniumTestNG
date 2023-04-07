package Lesson13;

import Base.TestBase2;
import POM_Pages.SeleniumPracticeHomePage;
import Utilities.DriverUtil;
import Utilities.PropertiesReaderUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_ExplicitlyWaitWithPOM extends TestBase2 {
    /*
    1) Go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    2) Click on the timer
    3) Verify that "WebDriver" text is present after some time
     */
    @Test
    public void explicitlyWaitTest() {
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("selenium_practice_url"));
        SeleniumPracticeHomePage page = new SeleniumPracticeHomePage();
        page.clickTimerButton();
        page.getDefaultText();

        // verify that "WebDriver" text is present
        String actualText = page.getWebDriverText().getText();
        Assert.assertEquals(actualText, "WebDriver", "WebDriver text is not present");
        page.getDefaultText();
        DriverUtil.closeDriver();
    }
}
