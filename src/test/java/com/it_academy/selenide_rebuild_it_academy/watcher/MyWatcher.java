package com.it_academy.selenide_rebuild_it_academy.watcher;

import com.codeborne.selenide.WebDriverRunner;
import com.it_academy.selenide_rebuild_it_academy.CustomLogger;
import io.qameta.allure.Attachment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class MyWatcher implements TestWatcher, CustomLogger {

    @Override
    public void testFailed(ExtensionContext context, Throwable throwable) {
        logger().info("screenshot of the failed test must be taken");
        getScreenshot();
        logger().info("screenshot of the failed test taken");
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        logger().info("screenshot of successful test must be taken");
        getScreenshot();
        logger().info("screenshot taken");
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] getScreenshot() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
