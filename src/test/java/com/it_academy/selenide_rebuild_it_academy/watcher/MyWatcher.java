package com.it_academy.selenide_rebuild_it_academy.watcher;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class MyWatcher implements TestWatcher {

    @Override
    public void testFailed(ExtensionContext context, Throwable throwable) {
        getScreenshot();
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        getScreenshot();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] getScreenshot() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
