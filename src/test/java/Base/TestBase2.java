package Base;

import Utilities.DriverUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;

import java.time.Duration;

public abstract class TestBase2 {
    // because this class is abstract, you cannot use it by itself. It must be subclassed.
    @BeforeMethod
    public void setUp() {
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod
    public void cleanUp() {
        // DriverUtil.closeDriver();
    }
}
