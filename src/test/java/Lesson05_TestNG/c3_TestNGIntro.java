package Lesson05_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class c3_TestNGIntro {
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

    @Test
    public void test1() {
        System.out.println("This is test 1");
        int age1 = 20;
        int age2 = 40;
        Assert.assertNotEquals(age1, age2, "Age verification failed");
    }

    @Test(priority = 1)
    public void test2() {
    System.out.println("This is test 2");
    String food1 = "pizza";
    String food2 = "pineapple pizza";
    // does food1 var contains the string of food2 var
    boolean sameFood = food2.contains(food1);
    Assert.assertTrue(sameFood);
    }


    @Test(priority = 2)
    public void test3() {
    }
}
