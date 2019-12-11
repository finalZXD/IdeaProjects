package com;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.useRelaxedHTTPSValidation;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;

public class TesterhomeTest {
    @BeforeClass
    public void BeforeClass(){
        useRelaxedHTTPSValidation();
    }
    @Test
    public void TestHtml(){
//        useRelaxedHTTPSValidation();

        given().queryParam("wd","hello world")
                .get("https://sp1.baidu.com/5b11fzupBgM18t7jm9iCKT-xh_/sensearch").prettyPeek()
                .then().statusCode(200).body("err_no",equalTo(0));
    }

    @Test
    public void TestHtml2(){
        given().queryParam("wd","hello world")
                .when()
                .get("https://sp1.baidu.com/5b11fzupBgM18t7jm9iCKT-xh_/sensearch").prettyPeek()
                .then().statusCode(200)
                .body("liju_result[0]",hasItems("[I, w_0, w_0,w_20, 0,  ]"));
    }
}

