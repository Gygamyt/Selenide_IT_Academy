package com.it_academy.selenide_rebuild_it_academy.driver;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.it_academy.selenide_rebuild_it_academy.configs.TestsConfig;


import static com.it_academy.selenide_rebuild_it_academy.configs.TestsConfig.initConfig;


public class Driver {

    public static void initDriver() {

        initConfig();

        Configuration.pageLoadStrategy = "normal";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
//        Configuration.browser = Browsers.CHROME;

        Configuration.headless = TestsConfig.isHeadless();

        switch (TestsConfig.browser) {
            case "chrome" -> Configuration.browser = Browsers.CHROME;
            case "edge" -> Configuration.browser = Browsers.EDGE;
            case "firefox" -> Configuration.browser = Browsers.FIREFOX;
            case "grid" -> {
                RemoteWebDriverCreator driverCreator = new RemoteWebDriverCreator();
                driverCreator.create();
            }
        }
    }
}
