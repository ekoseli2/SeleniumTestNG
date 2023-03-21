package Lesson05_TestNG;

import org.testng.annotations.*;

public class c1_TestNGIntro {
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
    }

    @Test(priority = 1)
    public void test2() {
        System.out.println("This is test 2");
    }

    @Test(priority = 2)
    public void test3() {
        System.out.println("This is test 3");
    }
}
