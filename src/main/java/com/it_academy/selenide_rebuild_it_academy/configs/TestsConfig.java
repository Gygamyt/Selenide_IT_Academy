package com.it_academy.selenide_rebuild_it_academy.configs;

public class TestsConfig {
    public static String browser = "chrome";
    public static String headless = "0";

    public static void initConfig() {
        browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        headless = System.getProperty("headless") == null ? "0" : System.getProperty("headless");
    }

    public static boolean isHeadless() {
        return headless.contains("1");
    }
}
