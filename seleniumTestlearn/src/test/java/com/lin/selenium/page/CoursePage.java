package com.lin.selenium.page;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.WeakHashMap;

public class CoursePage extends BasePage {

    public CoursePage(DriverBase driver) {
        super(driver);
    }
    /*
    * 获取查询输入框
    * */
    public WebElement getSearchInputElement() throws IOException {
        return element(getByLocator.getLocator("SearchInput"));
    }
    /*
    * 获取左上角课程名
    * */
    public WebElement getCourseNameElement() throws IOException {
        return nodeElement(getByLocator.getLocator("CourseInfo"),getByLocator.getLocator("CourseInfoText"));
    }
    /*
    * 获取添加购物车按钮元素
    * */
    public WebElement getCartButtonElement() throws IOException {
        return element(getByLocator.getLocator("addCart"));
    }
    /*
    * 获取立即购买按钮元素
    * */
    public WebElement getBuyButtonElement() throws IOException{
        return element(getByLocator.getLocator("buyTrigger"));
    }
    /*
    * 获取右上角购物车元素
    * */
    public WebElement getShopCartElement() throws IOException{
        return element(getByLocator.getLocator("shopCart"));
    }
    /*
    * 获取右上角购物车元素数
    * */
    public WebElement getShopCartNumElement() throws IOException{
        return element(getByLocator.getLocator("shopNum"));
    }
    /*
    * 获取订单信息
    * */
    public WebElement getOrderNameElement() throws IOException {
        return element(getByLocator.getLocator("orderText"));
    }
    /*
    * 获取已添加商品弹窗,去结算按钮元素
    * */
    public WebElement getButtonGoElement() throws IOException{
        return element(getByLocator.getLocator("buttonGo"));
    }

}
