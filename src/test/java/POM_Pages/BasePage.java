package POM_Pages;

import Utilities.DriverUtil;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriverWait driverWait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(10));

    /*
    1. PageFactory.initElements(driver, this)
        Creates a connection between your webdriver and your web element objects
    2. @FindBy annotations to locate web elements
    3. Create methods to handle the web elements
     */
    public BasePage() {
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }
}
