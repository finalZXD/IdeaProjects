package com.lin.selenium.util;

import org.testng.annotations.DataProvider;

public class testData {
    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                new Object[] {"小白兔",1},
                new Object[] {"抽绳背包",0},
        };
    }
}
