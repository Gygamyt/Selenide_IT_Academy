package com.it_academy.selenide_rebuild_it_academy.api;

import com.it_academy.selenide_rebuild_it_academy.rest_api.services.ProductService;
import org.junit.jupiter.api.Test;

import static com.it_academy.selenide_rebuild_it_academy.rest_api.endpoints.OnlinerEndpoints.getSushiFilterRollsProductsEndpoint;
import static com.it_academy.selenide_rebuild_it_academy.rest_api.endpoints.OnlinerEndpoints.getSushiProductsEndpoint;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class RestAssuredOnlinerTest {

    @Test
    public void checkRequest() {
        given()
                .when()
                .get(getSushiProductsEndpoint())
                .then()
                .statusCode(200);

        given()
                .when()
                .get(getSushiFilterRollsProductsEndpoint())
                .then()
                .statusCode(200);
    }

    @Test
    public void checkProductsServiceTest() {
        new ProductService()
                .getSushiProductsList()
                .forEach(product -> assertThat(product.getName()).isNotNull());
    }

    @Test
    public void checkNamePrefixTest() {
        new ProductService()
                .getSushiNamePrefixesList()
                .forEach(s -> assertThat(s.getNamePrefix().equals("Роллы")).isTrue());
    }
}
