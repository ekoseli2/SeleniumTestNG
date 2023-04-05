package POM_Pages;

import Utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {
    // Default constructor to make "objects" (instances) of the class
    public SmartBearLoginPage() {
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }

    // @FindBy() annotation to create web elements
    @FindBy(id="ctl00_MainContent_username")
    private WebElement userNameBox;

    @FindBy(id="ctl00_MainContent_password")
    private WebElement passwordBox;

    @FindBy(id="ctl00_MainContent_login_button")
    private WebElement loginButton;

    @FindBy(id="ctl00_MainContent_status")
    private WebElement statusMessage;

    // Create methods related to the WebElements
    public void loginForSmartBear(String username, String password) {
        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    // Getter for the statusMessage
    public String getStatusMessage() {
        return statusMessage.getText();
    }

}
