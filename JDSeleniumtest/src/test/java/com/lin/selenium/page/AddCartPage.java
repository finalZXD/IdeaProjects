package com.lin.selenium.page;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

public class AddCartPage extends BasePage {
    public AddCartPage(DriverBase driver) {
        super(driver);
    }
    /*
    * 获取添加购物车按钮元素
    * */
    public WebElement getAddCartButtonElement(){
        return element(getByLocator.getLocator("AddCartButton"));
    }
    /*
    * 获取我的购物车元素
    * */
    public WebElement getMyCartIconElement(){
        return element(getByLocator.getLocator("MyCart"));
    }
    /*
    * 获取我的购物车商品数量的元素
    * */
    public WebElement getMyCartNumElement(){
        return element(getByLocator.getLocator("MyCartNum"));
    }
    /*
    * 获取订单商品名称信息元素
    * */
    public WebElement getOrderShopNameElement(){
        return element(getByLocator.getLocator("ShopName"));
    }
    /*
    * 获取添加的商品名称元素
    * */
    public WebElement getOrderNameElement(){
        return nodeElement(getByLocator.getLocator("OrderBox"),getByLocator.getLocator("OrderName"));
    }
    /*
    * 获取结算按钮元素
    * */
    public WebElement getPayButtonElement(){
        return element(getByLocator.getLocator("PayButton"));
    }
    /*
    * 获取登录框元素
    * */
    public WebElement getLoginBoxElement(){
        return element(getByLocator.getLocator("LoginBox"));
    }
}
