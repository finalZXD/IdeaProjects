package com.lin.selenium.handle;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.page.SureOrderPage;

import java.io.IOException;

public class SureOrderHandle {
    public SureOrderPage sop;
    public DriverBase driver;
    public SureOrderHandle(DriverBase driver){
        this.driver = driver;
        sop = new SureOrderPage(driver);
    }
    /*
    * 点击提交订单按钮
    * */
    public void clickSubOrder() throws IOException {
        sop.click(sop.getSubOrderElement());
    }
}
