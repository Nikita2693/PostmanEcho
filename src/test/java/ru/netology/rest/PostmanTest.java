package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    public void postRequest() {

        given()
                .baseUri("https://postman-echo.com")
                .body("10.07.2023")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data",equalTo("10.07.2023"))
        ;

    }
}
