package com.it_academy.selenide_rebuild_it_academy.onliner;

import com.it_academy.selenide_rebuild_it_academy.pageobjects.onliner_page_objects.CatalogPage;
import com.it_academy.selenide_rebuild_it_academy.pageobjects.onliner_page_objects.Header;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SectionsTest extends OnlinerBaseTest {
    private final Header header = new Header();
    private final CatalogPage catalogPage = new CatalogPage();

    private final ArrayList<String> requiredSections = new ArrayList<>(){{
        add("Ноутбуки, компьютеры, мониторы");
        add("Комплектующие");
    }};

    @Test
    public void sectionComputersTest() {
        logger().info("sectionComputersTest started");
        header
                .clickOnMainNavigationLink("Каталог")
                .clickOnCatalogClassifierLink("Компьютеры");
        requiredSections.forEach(section -> AssertionsForClassTypes.assertThat(catalogPage.isCatalogNavigationListDisplayed(section))
                .as("Trouble msg.")
                .isTrue());
        logger().info("sectionComputersTest ended");
    }
}
