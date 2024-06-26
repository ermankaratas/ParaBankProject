package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        properties = new Properties();
        try {
            String filePath = "configuration.properties";
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("File couldn't be found");
        } catch (IOException e) {
            System.out.println("File couldn't be load from configuration.properties file");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
