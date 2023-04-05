package Lesson12;

import Base.TestBase2;
import POM_Pages.SmartBearLoginPage;
import Utilities.DriverUtil;
import Utilities.PropertiesReaderUtil;
import org.testng.annotations.Test;

public class c1_smartBearPOM extends TestBase2 {
    @Test
    public void smartBearPositiveLoginTest() {
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("smartBearUrl"));

        // Logging in using the POM
        SmartBearLoginPage loginPage = new SmartBearLoginPage();
        loginPage.loginForSmartBear(PropertiesReaderUtil.getProperties("smartBearUsername"),
                PropertiesReaderUtil.getProperties("smartBearPassword"));
    }
}
