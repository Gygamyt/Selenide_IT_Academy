package com.it_academy.selenide_rebuild_it_academy.pageobjects.onliner_page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.it_academy.selenide_rebuild_it_academy.pageobjects.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.String.format;

public class CatalogPage extends BasePage {
    private static final String CATALOG_CLASSIFIER_LINK_XPATH_PATTERN =
            "//ul[@class='catalog-navigation-classifier ']/li//span[normalize-space(text()) and contains(text(), '%s')]";

    private static final String CATALOG_CLASSIFIER__CATEGORY_LINK_XPATH_PATTERN =
            "//div[contains(@class, 'aside-list')]//div[contains(@class, 'aside-title') and contains(text(), '%s')]";

    private static final String PRODUCT_XPATH_PATTERN =
            "//div[contains(@class, 'aside-item_active')]//div[contains(@class, 'dropdown-list')]"
                    + "/a[contains(@href, 'onliner')]//span[contains(@class, 'title') and contains(text(), '%s')]";

    private final By ANCESTOR_OF_CATALOG_NAVIGATION_LIST =
            By.xpath("//div[contains(@class, 'aside-item_active')]//div[contains(@class, 'dropdown-list')]/a[contains(@href, 'onliner')]");


    private final By CATALOG_CLASSIFIER_XPATH_FOR_SECTION_CHECK = By.xpath("//ul[@class=\"catalog-navigation-classifier \"]"
            + "/li[@class=\"catalog-navigation-classifier__item \"]");

    public ElementsCollection getSectionsElements() {
        return $$(CATALOG_CLASSIFIER_XPATH_FOR_SECTION_CHECK);
    }

    public ElementsCollection getCatalogNavigation() {
        return $$(ANCESTOR_OF_CATALOG_NAVIGATION_LIST);
    }

    public CatalogPage clickOnCatalogClassifierLink(String link) {
        $(By.xpath(format(CATALOG_CLASSIFIER_LINK_XPATH_PATTERN, link))).click();
        return this;
    }

    public CatalogPage clickOnCatalogClassifierCategoryLink(String link) {
        $(By.xpath(format(CATALOG_CLASSIFIER__CATEGORY_LINK_XPATH_PATTERN, link))).click();
        return this;
    }

    public boolean isCatalogNavigationListDisplayed(String title) {
        return $(By.xpath(format(CATALOG_CLASSIFIER__CATEGORY_LINK_XPATH_PATTERN, title))).is(Condition.enabled);
    }

    public ProductsPage clickOnProductLink(String product) {
        $(By.xpath(format(PRODUCT_XPATH_PATTERN, product))).click();
        return new ProductsPage();
    }
}
