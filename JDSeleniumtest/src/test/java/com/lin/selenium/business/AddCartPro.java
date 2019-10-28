package com.lin.selenium.business;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.handle.AddCartHandle;
import org.testng.Assert;

import java.util.Set;

public class AddCartPro {
    public AddCartHandle addCartHandle;
    public String window;
    public Set<String> allWindows;
    public DriverBase driver;
    public int firstMyCartNum;
    public int lastMyCartNum;
    public String MyCartNum;
    public String afterMyCartNum;
    private String orderShopName;
    private String orderName;

    public AddCartPro(DriverBase driverBase){
        addCartHandle = new AddCartHandle(driverBase);
        this.driver = driverBase;
    }
    public void AddCart(){
        allWindows = addCartHandle.getAllNowWindows();
        window = addCartHandle.getNowWindow();

        for(String s : allWindows){
            if(s.equals(window) == false){
               driver.switchWindows(s);
               break;
            }
            System.out.println(s);
            driver.switchWindows(s);
        }
        driver.timeOut(3);
        MyCartNum = addCartHandle.getMyCartNum();
        orderShopName = addCartHandle.getOrderShopName();
        try{
            firstMyCartNum = Integer.valueOf(MyCartNum);
            System.out.println(firstMyCartNum);
        }catch (Exception e){
            firstMyCartNum = 0;
        }
        addCartHandle.clickAddCartButton();
        driver.timeOut(3);
        afterMyCartNum = addCartHandle.getMyCartNum();
        try{
            lastMyCartNum = Integer.valueOf(afterMyCartNum);
            System.out.println(lastMyCartNum);
        }catch (Exception e){
            lastMyCartNum = firstMyCartNum;
        }
        if(lastMyCartNum == firstMyCartNum + 1){
            driver.timeOut(3);
            orderName = addCartHandle.getOrderName();
            Assert.assertEquals(orderShopName,orderName,"购物商品添加失败！");
            /*if(orderShopName.equals(orderName)){
                System.out.println("成功添加购物车！");
            }else {
                System.out.println("购物车添加失败！");
            }*/
            addCartHandle.clickMyCart();
        }

        /*
        * 点击结算按钮
        * */
        allWindows = addCartHandle.getAllNowWindows();
        Object lastWindow = allWindows.toArray()[allWindows.size() - 1];
        for (String s:allWindows){
            if(s.equals(lastWindow) == true){
                driver.switchWindows(s);
                break;
            }
            System.out.println(s);
            driver.switchWindows(s);
        }
//        driver.timeOut(5);
        addCartHandle.clickPayButton();
        addCartHandle.assertLoginBox();
        Assert.assertTrue(addCartHandle.assertLoginBox(),"成功点击结算按钮");
    }
}
