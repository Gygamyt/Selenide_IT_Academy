package com.it_academy.selenide_rebuild_it_academy.rest_api.services;

import com.google.common.collect.ImmutableMap;
import com.it_academy.selenide_rebuild_it_academy.rest_api.endpoints.OnlinerEndpoints;
import com.it_academy.selenide_rebuild_it_academy.rest_api.models.SushiPageModel;
import com.it_academy.selenide_rebuild_it_academy.rest_api.utils.GetRequestUtils;

import java.util.List;
import java.util.Map;


public class ProductService {

    public List<SushiPageModel> getSushiProductsList() {
        return GetRequestUtils.makeGetRequestAndGetBody(OnlinerEndpoints.getSushiProductsEndpoint(), null, null)
                .jsonPath()
                .getList("products", SushiPageModel.class);
    }

    public List<SushiPageModel> getSushiNamePrefixesList() {
        return GetRequestUtils.makeGetRequestAndGetBody(OnlinerEndpoints.getSushiFilterRollsProductsEndpoint(), null, null)
                .jsonPath()
                .getList("products", SushiPageModel.class);
    }

    private static Map<String, Object> configureHeaders() {
        return ImmutableMap.of("Host", "catalog.onliner.by");
    }
}
