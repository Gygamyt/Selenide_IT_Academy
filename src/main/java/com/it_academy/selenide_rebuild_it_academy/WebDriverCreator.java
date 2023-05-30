package com.it_academy.selenide_rebuild_it_academy;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface WebDriverCreator <T extends RemoteWebDriver>{
    T create();
}