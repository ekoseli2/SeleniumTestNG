package Lesson12;

import Base.TestBase2;
import POM_Pages.SmartBearLoginPage;
import Utilities.DriverUtil;
import Utilities.PropertiesReaderUtil;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c2_smartBearNegative extends TestBase2 {
    // enter invalid credentials (Negative Test)
    // verify that the error message works as expected

    @Test
    public void invalidUserCredentialTest() {
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("smartBearUrl"));
        SmartBearLoginPage loginPage = new SmartBearLoginPage();

        // We can use JavaFaker
        Faker faker = new Faker();
        loginPage.loginForSmartBear(faker.name().username(), faker.internet().password());

        // Verifications
        String expectedMessage = "Invalid Login or Password.";
        String actualMessage = loginPage.getStatusMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Verification Failed: log-in was not prevented");

        DriverUtil.closeDriver();
    }
}
