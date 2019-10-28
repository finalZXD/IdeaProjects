package com.lin.selenium.handle;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.page.CoursePage;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CoursePageHandle {
    public DriverBase driver;
    public CoursePage coursepage;
    public CoursePageHandle(DriverBase driver){
        this.driver = driver;
        coursepage = new CoursePage(driver);
    }
    /*
    * 点击立即购买按钮
    * */
    public void clickBuyNow() throws IOException {
        coursepage.click(coursepage.getBuyButtonElement());
    }
    /*
    * 点击添加购物车按钮
    * */
    public void clickAddCart() throws IOException {
        coursepage.click(coursepage.getCartButtonElement());
    }
    /*
    * 点击右上角购物车
    * */
    public void clickShopCart() throws IOException{
        coursepage.click(coursepage.getShopCartElement());
    }
    /*
    * 获取购物车数量
    * */
    public String  getShopCartNum() throws IOException {
        WebElement element = coursepage.getShopCartNumElement();
        return coursepage.getText(element);
    }
    /*
    * 获取左上角课程名称
    * */
    public String getCourseName() throws IOException{
        return coursepage.getText(coursepage.getCourseNameElement());
    }
    /*
    * 获取购物课程的名称
    * */
    public String getOrderName() throws IOException {
        return coursepage.getText(coursepage.getOrderNameElement());
    }
    /*
    * 点击已购买弹窗的去结算按钮
    * */
    public void clickButtonGo() throws IOException{
        coursepage.click(coursepage.getBuyButtonElement());
    }
}
