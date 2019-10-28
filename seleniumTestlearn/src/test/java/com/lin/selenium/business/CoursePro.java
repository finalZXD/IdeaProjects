package com.lin.selenium.business;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.handle.CoursePageHandle;

import java.io.IOException;

public class CoursePro {
    public DriverBase driver;
    public CoursePageHandle cph;
    public CoursePro(DriverBase driver){
        this.driver = driver;
        cph = new CoursePageHandle(driver);
    }
    /*
    * 添加购物车
    * */
    public void addCart() throws IOException {
        driver.get("https://coding.imooc.com/class/359.html");
        int beforeNum;
        int afterNum;
        String afterCourseNum;
        String courseNum = cph.getShopCartNum();
        try {
            beforeNum = Integer.valueOf(courseNum);
            System.out.println(beforeNum);
        }catch (Exception e){
            beforeNum = 0;
        }
        cph.clickAddCart();
        try{
            driver.switchToMode();
            cph.clickButtonGo();
        }catch (Exception e){

        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        afterCourseNum = cph.getShopCartNum();
        try {
            afterNum = Integer.valueOf(afterCourseNum);
            System.out.println(afterNum);
        }catch (Exception e){
            afterNum = beforeNum;
        }
        if(afterNum == beforeNum+1){
            System.out.println("添加购物车成功！");
            cph.clickShopCart();
        }else if(afterNum > 0){
            cph.clickShopCart();
        }
    }

    /*
    * 商品立即购买
    * */
    public void BuyNow() throws IOException{
        cph.clickBuyNow();
    }
}
