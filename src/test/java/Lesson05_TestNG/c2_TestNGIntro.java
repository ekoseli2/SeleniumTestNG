package Lesson05_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class c2_TestNGIntro {
    // What to do before any of the tests. This is the first method which executes in any TestNG file
    @BeforeClass
    public void setup() {
        // certain statements like driver.setup or maximize window can go here
        System.out.println("Before class is running");
    }

    @AfterClass
    public void cleanup() {
        // certain statements like driver.close
        System.out.println("After class is running");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method is running");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method is running");
    }

    @Test(priority = 3)
    public void test1() {
        System.out.println("This is test 1");
        String expectedBestDrink = "coffee";
        String actualBestDrink = "tea";
        Assert.assertEquals(actualBestDrink, expectedBestDrink, "Test has failed. \nExpected="
                + expectedBestDrink + "\nActual=" + actualBestDrink);
        System.out.println("This is the end of test1");
    }

    @Test(priority = 1)
    public void test2() {
        System.out.println("This is test 2");
        String expectedBestFood = "pizza";
        String actualBestFood = "kebab";
        Assert.assertEquals(actualBestFood, expectedBestFood, "Test has failed.\nExpected="
                + expectedBestFood + "\nActual" + actualBestFood);
        System.out.println("This is the end of test2");
    }


    @Test(priority = 2)
    public void test3() {
        System.out.println("This is test 3");
        String expectBestDessert = "pie";
        String actualBestDessert = "revani";
        Assert.assertEquals(actualBestDessert, expectBestDessert, "Test has failed.\nExpected="
                + expectBestDessert + "\nActual" + actualBestDessert);
    }

    @Test(priority = 4, dependsOnMethods = "test3")
    public void test4() {
        System.out.println("This is test 4");
    }

}
