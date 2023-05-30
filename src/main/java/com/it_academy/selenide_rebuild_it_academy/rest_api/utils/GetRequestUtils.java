package com.it_academy.selenide_rebuild_it_academy.rest_api.utils;

import io.restassured.response.ResponseBody;
import org.apache.commons.collections4.MapUtils;

import static io.restassured.RestAssured.*;

import java.util.Map;

public class GetRequestUtils {

    public static ResponseBody makeGetRequestAndGetBody(String endpoint, Map<String, Object> header, Map<String, Object> params) {

        return given()
                .headers(MapUtils.emptyIfNull(header))
                .params(MapUtils.emptyIfNull(params))
                .when()
                .get(endpoint)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .getBody();
    }
}
