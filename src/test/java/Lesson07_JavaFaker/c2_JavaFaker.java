package Lesson07_JavaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class c2_JavaFaker {
    @Test
    public void javaFaker() {
        Faker faker = new Faker();
        System.out.println(faker.university().name());
        System.out.println(faker.address().city());
        System.out.println(faker.finance().creditCard());
    }
}
