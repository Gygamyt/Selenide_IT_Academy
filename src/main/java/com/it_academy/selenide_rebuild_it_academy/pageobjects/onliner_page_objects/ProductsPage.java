package com.it_academy.selenide_rebuild_it_academy.pageobjects.onliner_page_objects;

import com.it_academy.selenide_rebuild_it_academy.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static java.lang.String.format;

public class ProductsPage extends BasePage {
    private static final String PRODUCT_GROUP = "//div[@class=\"schema-product__group\"]";
    private static final String FIELDS_PATTERN = "//div[contains(@class, '%s')]";

    private static final ArrayList<String> fieldsClasses = new ArrayList<>() {{
        add("schema-product__image");
        add("schema-product__compare");
        add("schema-product__price-group");
        add("schema-product__description");
        add("schema-product__title");
        add("schema-product__rating-group");
    }};

    public List<WebElement> getFieldsForVisibilityCheck() {
        List<WebElement> util = new ArrayList<>();
        for (String fieldsClass : fieldsClasses) {
            util.addAll($$(By.xpath((format(FIELDS_PATTERN, fieldsClass)))));
        }
        return util;
    }
}
