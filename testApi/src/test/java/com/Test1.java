package com;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

public class Test1 {
    @Test(description = "Testing the web service whether success 200 has been received")
    @Description("Description : Testing the web service whether success 200 has been received")
    @Severity(SeverityLevel.CRITICAL)
    public void test_Number(){
        given().when().get("http://ergast.com/api/f1/2017/circuits.json").then()
                .assertThat()
                .statusCode(200).and()
                .assertThat().body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));
    }
}
