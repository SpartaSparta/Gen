package net.upgenix.utilities;

import java.beans.PropertyEditor;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Reads the properties file - configuration.properties
 */
public class ConfigurationReader {

    private static Properties properties;

    static{
        try{
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyName){
        return  properties.getProperty(keyName);
    }

}
