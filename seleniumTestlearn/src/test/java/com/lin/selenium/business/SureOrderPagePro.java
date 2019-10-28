package com.lin.selenium.business;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.handle.SureOrderHandle;

import java.io.IOException;

public class SureOrderPagePro {
    public DriverBase driver;
    public SureOrderHandle soh;
    public SureOrderPagePro(DriverBase driver){
        this.driver = driver;
        soh = new SureOrderHandle(driver);
    }
    /*
    *确认点击提交订单
     */
    public void clickOder() throws IOException {
        soh.clickSubOrder();
    }
}
