package com.it_academy.selenide_rebuild_it_academy;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.it_academy.selenide_rebuild_it_academy.driver.Driver;
import com.it_academy.selenide_rebuild_it_academy.watcher.MyWatcher;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.RegisterExtension;

public class BaseTest implements CustomLogger {

    @RegisterExtension
    MyWatcher myWatcher = new MyWatcher();

    @BeforeAll
    public static void initDriver() {
        staticLogger.info("start of driver initialization");
        Driver.initDriver();
        staticLogger.info("driver initialized");
        setupAllureReports(); //screenshots are not appeared when assertions fail, so watcher fixes it
    }


    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(false)
                .savePageSource(true)
        );
    }
}
