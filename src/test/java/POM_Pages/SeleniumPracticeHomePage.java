package POM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumPracticeHomePage extends BasePage {
    @FindBy(xpath = "//button[.='Click me to start timer']")
    private WebElement timerButton;

    // This text cycles between a couple of different words so let's write a locator that can
    // guarantee a specific text phrase will appear.
    @FindBy(id="demo")
    private WebElement defaultText;

    @FindBy(xpath = "//p[.='WebDriver']")
    private WebElement webDriverText;

    // write getters and behavior methods for web elements which are private above
    public void getDefaultText() {
        System.out.println("Default text shows: " + defaultText.getText());
    }

    public WebElement getWebDriverText() {
        driverWait.until(ExpectedConditions.visibilityOf(webDriverText));
        return webDriverText;
    }

    public void clickTimerButton() {
        driverWait.until(ExpectedConditions.elementToBeClickable(timerButton)).click();
    }
}
