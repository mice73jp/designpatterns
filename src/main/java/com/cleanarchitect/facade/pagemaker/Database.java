package com.cleanarchitect.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private static final String DATADIR = "src/main/java/com/cleanarchitect/facade/data";
    public Database() {
    }
    
    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not fount.");
        }
        return prop;
    }
}
