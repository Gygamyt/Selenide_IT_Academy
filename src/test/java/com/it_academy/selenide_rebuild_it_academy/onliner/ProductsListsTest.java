package com.it_academy.selenide_rebuild_it_academy.onliner;

import com.it_academy.selenide_rebuild_it_academy.pageobjects.onliner_page_objects.Header;
import com.it_academy.selenide_rebuild_it_academy.pageobjects.onliner_page_objects.ProductsPage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductsListsTest extends OnlinerBaseTest {

    private final Header header = new Header();
    private final ProductsPage productsPage = new ProductsPage();

    @Test
    public void headphonesListTest() {
        logger().info("headphonesListTest started");
        header
                .clickOnMainNavigationLink("Каталог")
                .clickOnCatalogClassifierLink("Электроника")
                .clickOnCatalogClassifierCategoryLink("Аудиотехника")
                .clickOnProductLink("Наушники");
        productsPage.getFieldsForVisibilityCheck().forEach(webElement -> assertThat(webElement.isEnabled()).isTrue());
        logger().info("headphonesListTest ended");
    }
}
