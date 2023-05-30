package com.it_academy.selenide_rebuild_it_academy.rest_api.endpoints;

import com.it_academy.selenide_rebuild_it_academy.utils.PropReader;

public class OnlinerEndpoints {

    public static String getSushiProductsEndpoint() {
        return PropReader.getEndpointProperty("sushi_products");
    }

    public static String getSushiFilterRollsProductsEndpoint() {
        return PropReader.getEndpointProperty("sushi_filter_rolls_products");
    }
}
