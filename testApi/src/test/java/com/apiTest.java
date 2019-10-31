package com;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.useRelaxedHTTPSValidation;
import static org.hamcrest.Matchers.equalTo;

public class apiTest {
//    String url = "http://120.78.128.25:8080/futureloan/mvc/api/member/register";
//    String data = "?mobilephone=13666686666&pwd=123456&name=tom";
    @Test
    public void testHtml(){
        useRelaxedHTTPSValidation();

        given().queryParam("q","appium")
                .when().get("https://testerhome.com/search").prettyPeek()
                .then().assertThat().body("html.head.title", equalTo("appium · 搜索结果 · TesterHome"));
    }
}
