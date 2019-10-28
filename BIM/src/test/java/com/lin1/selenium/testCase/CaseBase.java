package com.lin1.selenium.testCase;

import com.lin1.selenium.base.DriverBase;

public class CaseBase {
    public DriverBase InitDriver(String browser){
        return new DriverBase(browser);
    }
}
