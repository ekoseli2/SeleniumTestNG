package Lesson10;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class C1_Properties_Test {
    @Test
    public void systemPropertiesTest() {
        // java has some properties that we can use to get system info
        System.out.println(System.getProperty("os.name"));
    }

    @Test
    public void configurationPropertiesTest() {
        Properties properties = new Properties();

        // this is a path for configuration.properties file
        String propertiesFilePath = "configuration.properties";

        try {
            // tell the compiler to open the file
            FileInputStream file = new FileInputStream(propertiesFilePath);
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("smartBearUrl"));
        System.out.println(properties.getProperty("smartBearUsername"));
        System.out.println(properties.getProperty("smartBearPassword"));

    }
}
