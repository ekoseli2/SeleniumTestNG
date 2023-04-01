package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderUtil {
    private static Properties properties = new Properties();
    // encapsulation
    static {
        /*
        This code is precompiled before the rest of the code (JVM/JVC knows about this data before compiling the rest of the code).
        This code does not need to be instantiated.
         */
        // this is a path for configuration.properties file
        String propertiesFilePath = "configuration.properties";
        try {
            // tell the compiler to open the file
            FileInputStream file = new FileInputStream(propertiesFilePath);
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperties(String keyword) {
        return properties.getProperty(keyword);
    }
}
