package com.example.bookstore.catalog;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

class ProductControllerIT extends AbstractIT {

    @Test
    void shouldReturnProducts() {

        given().queryParam("page", 1).when().get("/api/products").then().statusCode(200);
    }
}
