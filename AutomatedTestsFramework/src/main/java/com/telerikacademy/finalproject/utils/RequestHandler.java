package com.telerikacademy.finalproject.utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.HashMap;

public class RequestHandler {
    public Response sendGetRequest(String endpoint, HashMap<String, String> queryParams){
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .queryParams(queryParams)
                .when()
                .get(endpoint)
                .then()
                .statusCode(200)
                .extract().response();
    }

    public Response sendPostRequest(String endpoint, Object body, ContentType contentType){
        return RestAssured.given()
                .contentType(contentType)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract().response();
    }
}
