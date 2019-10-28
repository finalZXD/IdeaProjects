package com.lin.selenium.handle;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.page.SelectPage;

public class SelectHandle {
    public DriverBase driverBase;
    public SelectPage selectPage;
    public SelectHandle(DriverBase driver){
        this.driverBase = driver;
        selectPage = new SelectPage(driver);
    }
    /*
    * 点击选择购物
    * */
    public void clickSelectGood(int i){
        int num = selectPage.getSelectListNum();
        if(i<num){
            selectPage.click(selectPage.getSelectListElement(i));
        }else {
            System.out.println("选择商品不存在！");
        }
    }
}
