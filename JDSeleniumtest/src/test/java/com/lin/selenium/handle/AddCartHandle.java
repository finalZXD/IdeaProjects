package com.lin.selenium.handle;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.page.AddCartPage;

import java.util.Set;

public class AddCartHandle {
    public DriverBase driverBase;
    public AddCartPage addCartPage;
    public AddCartHandle(DriverBase driver){
        this.driverBase = driver;
        addCartPage = new AddCartPage(driver);
    }
    /*
    * 获取当前窗口
    * */
    public String getNowWindow(){
        return driverBase.getWindow();
    }
    /*
    * 获取所有窗口
    * */
    public Set<String> getAllNowWindows(){
        return driverBase.getAllWindows();
    }
    /*
    * 点击添加购物车按钮
    * */
    public void clickAddCartButton(){
        addCartPage.click(addCartPage.getAddCartButtonElement());
    }
    /*
    * 点击我的购物车
    * */
    public void clickMyCart(){
        addCartPage.click(addCartPage.getMyCartIconElement());
    }
    /*
    * 获取添加购物车商品数
    * */
    public String getMyCartNum(){
        return addCartPage.getText(addCartPage.getMyCartNumElement());
    }
    /*
    * 获取购买商品名称
    * */
    public String getOrderShopName(){
        return addCartPage.getText(addCartPage.getOrderShopNameElement());
    }
    /*
    * 获取已添加商品名称
    * */
    public String getOrderName(){
        return addCartPage.getText(addCartPage.getOrderNameElement());
    }
    /*
    * 点击结算按钮
    * */
    public void clickPayButton(){
        addCartPage.click(addCartPage.getPayButtonElement());
    }
    /*
    * 判断是否有登录框
    * */
    public boolean assertLoginBox(){
        return addCartPage.assertElements(addCartPage.getLoginBoxElement());
    }
}
