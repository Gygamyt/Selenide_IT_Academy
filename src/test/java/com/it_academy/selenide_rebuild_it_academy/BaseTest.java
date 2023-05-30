package com.it_academy.selenide_rebuild_it_academy;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.it_academy.selenide_rebuild_it_academy.driver.Driver;
import com.it_academy.selenide_rebuild_it_academy.watcher.MyWatcher;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.RegisterExtension;

public class BaseTest {

    @RegisterExtension
    MyWatcher myWatcher = new MyWatcher();

    @BeforeAll
    public static void initDriver() {
        Driver.initDriver();
//        setupAllureReports(); //screenshots are not appeared when assertions fail, so watcher fixes it
    }


    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
    }
}
