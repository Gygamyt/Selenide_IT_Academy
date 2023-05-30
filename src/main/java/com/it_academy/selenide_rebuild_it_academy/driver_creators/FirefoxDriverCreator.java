package com.it_academy.selenide_rebuild_it_academy.driver_creators;

import com.it_academy.selenide_rebuild_it_academy.WebDriverCreator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxDriverCreator implements WebDriverCreator<RemoteWebDriver> {
    @Override
    public RemoteWebDriver create() {
        return new FirefoxDriver();
    }
}