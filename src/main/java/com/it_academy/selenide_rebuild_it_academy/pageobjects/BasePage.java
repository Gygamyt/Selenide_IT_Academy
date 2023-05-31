package com.it_academy.selenide_rebuild_it_academy.pageobjects;

import com.codeborne.selenide.Condition;
import com.it_academy.selenide_rebuild_it_academy.CustomLogger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage implements CustomLogger {
    public static boolean isElementVisible(By locator) {
        return $(locator).is(Condition.visible);
    }

}
