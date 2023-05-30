package com.it_academy.selenide_rebuild_it_academy.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropReader {
    public static final String ENDPOINTS_FILE = "/endpoints.properties";

    public static final Properties ENDPOINTS_Properties = new Properties();

    static {
        initProperties(ENDPOINTS_FILE, ENDPOINTS_Properties);
    }

    public static String getEndpointProperty(String property) {
        return ENDPOINTS_Properties.getProperty(property);
    }

    public static synchronized void initProperties(String fileName, Properties properties) {
        try (InputStream inputStream = PropReader.class.getResourceAsStream(fileName)) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new IllegalArgumentException("No file" + fileName);
        }
    }
}
