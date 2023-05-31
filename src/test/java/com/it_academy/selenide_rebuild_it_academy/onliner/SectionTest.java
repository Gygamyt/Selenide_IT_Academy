package com.it_academy.selenide_rebuild_it_academy.onliner;

import com.codeborne.selenide.ElementsCollection;
import com.it_academy.selenide_rebuild_it_academy.pageobjects.onliner_page_objects.CatalogPage;
import com.it_academy.selenide_rebuild_it_academy.pageobjects.onliner_page_objects.Header;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SectionTest extends OnlinerBaseTest {
    private final Header header = new Header();

    private final List<String> requiredSections = new ArrayList<>() {{
        add("Электроника");
        add("Компьютеры и сети");
        add("Бытовая техника");
        add("На каждый день");
        add("Стройка и ремонт");
        add("Дом и сад");
        add("Авто и мото");
        add("Красота и спорт");
        add("Детям и мамам");
    }};

    private final List<String> currentSections = new ArrayList<>();

    @Test
    public void sectionCheckTest() {
        logger().info("sectionCheckTest started");
        header
                .clickOnMainNavigationLink("Катаsadasdлог");

        ElementsCollection sectionsWebElements = new CatalogPage().getSectionsElements();

        sectionsWebElements.forEach(selenideElement -> currentSections.add(selenideElement.getText()));

        assertThat(currentSections)
                .as("Current sections does match the required sections.")
                .containsAll(requiredSections);
        logger().info("sectionCheckTest ended");
    }
}
