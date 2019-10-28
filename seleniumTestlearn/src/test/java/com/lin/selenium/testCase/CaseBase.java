package com.lin.selenium.testCase;

import com.lin.selenium.base.DriverBase;

public class CaseBase {
    public DriverBase InitDriver(String browser){
        return new DriverBase(browser);
    }
}
