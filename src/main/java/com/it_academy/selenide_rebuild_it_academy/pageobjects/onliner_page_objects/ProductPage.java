package com.it_academy.selenide_rebuild_it_academy.pageobjects.onliner_page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.it_academy.selenide_rebuild_it_academy.pageobjects.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage extends BasePage {
    private final By PRODUCT_TODO = By
            .xpath("//ul[@class=\"b-offers-subnav\"]//li[contains(@class, 'item')]//span");

    private final SelenideElement PRODUCT_TITTLE = $(By
            .xpath("class=\"catalog-masthead__title js-nav-header\""));

    private final SelenideElement BUY_BUTTON = $(By
            .xpath("//a[contains(@class, 'button_buy')]"));

    private final SelenideElement PRODUCT_IS_ADDED_SUBHEADER = $(By
            .xpath("//div[@class=\"product-recommended__subheader\"]"));


    public String getAddedToCartSubheaderText(){
        return PRODUCT_IS_ADDED_SUBHEADER.getText();
    }

    public ProductPage clickOnBuyButton() {
        BUY_BUTTON.click();
        logger().info("buy button is clicked");
        return this;
    }
    public String getProductTittleText() {
        return PRODUCT_TITTLE.getText();
    }
    public ElementsCollection addElementsForCheck() {
        return $$(PRODUCT_TODO);
    }
}
