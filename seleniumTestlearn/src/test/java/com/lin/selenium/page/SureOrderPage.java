package com.lin.selenium.page;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class SureOrderPage extends BasePage{
    public SureOrderPage(DriverBase driver) {
        super(driver);
    }
    /*
    * 获取提交订单按钮
    * */
    public WebElement getSubOrderElement() throws IOException {
        return element(getByLocator.getLocator("sureOrder"));
    }
}
