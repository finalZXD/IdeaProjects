package com.lin1.selenium.handle;

import com.lin1.selenium.base.DriverBase;
import com.lin1.selenium.page.BasePage;

public class BaseHandle {
    public DriverBase driverBase;
    public BasePage basePage;
    public BaseHandle(DriverBase driver){
        this.driverBase = driver;
    }
    public void windowsMaximum(){
        basePage.pageMaximize();
    }
}
