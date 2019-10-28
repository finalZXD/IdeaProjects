package com.lin.selenium.handle;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.page.BasePage;

public class BaseHandle {
    public DriverBase driverBase;
    public BasePage basePage;
    public BaseHandle(DriverBase driver){
        this.driverBase = driver;
        basePage = new BasePage(driver);
    }
    /*
    *窗口最大话
     */
    public void WindowsMaximum(){
        basePage.pageMaximize();
    }

}
