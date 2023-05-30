package com.it_academy.selenide_rebuild_it_academy.pageobjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public static boolean isElementVisible(By locator) {
        return $(locator).is(Condition.visible);
    }

}
