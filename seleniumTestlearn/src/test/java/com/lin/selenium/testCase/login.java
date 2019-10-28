package com.lin.selenium.testCase;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.business.CoursePro;
import com.lin.selenium.business.LoginPro;
import com.lin.selenium.util.getByLocator;
import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;
import okio.Utf8;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class login extends CaseBase{
    public DriverBase driver;
    public LoginPro loginpro;
    static Logger log = LogManager.getLogger(login.class);
    public CoursePro cp;
    public login(){
        this.driver = InitDriver("chrome");
        loginpro = new LoginPro(driver);
        cp = new CoursePro(driver);
    }

    @BeforeClass
    public void BeforeClass(){
        driver.get("https://www.imooc.com");
    }
    @Test
    public void TestGetLoginHome(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manageWindowSize().maximize();
    }

    @Test(dependsOnMethods = {"TestGetLoginHome"})
    public void testLogin() throws IOException {
        log.debug("这是第一次使用log4j打印日志~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        loginpro.login("13060641219","L13250218817");
    }

    /*
    * 查找课程信息
    * */
//    @Test(dependsOnMethods = {"testLogin"})
    public void TestSearchCourse() throws IOException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(getByLocator.getLocator("SearchInput")).sendKeys("Java Web自动化测试selenium基础到企业实际应用");
        driver.findElement(getByLocator.getLocator("showhide-search")).click();
    }
    /*
    * 添加购物车
    * */
    @Test(dependsOnMethods = {"testLogin"})
    public void TestAddCart() throws IOException {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cp.addCart();
    }

/*    *//*
    * 下单流程：
    * *//*
    @Test(dependsOnMethods = {"SearchCourse"})
    public void byCourse() throws IOException {
        *//*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement Course = driver.findElement(getByLocator.getLocator("search-course-list"));
        List<WebElement> CourseList = Course.findElements(getByLocator.getLocator("course-item-detail"));

        WebElement ele = CourseList.get(0);
        JavascriptExecutor executor = (JavascriptExecutor) driver.getDriver();
        executor.executeScript("arguments[0]",ele);
        System.out.println(CourseList.get(0).getText());*//*
        String windowHandle;
        windowHandle = driver.getDriver().getWindowHandle();
        driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[2]/div[1]/div/a")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> handles = driver.getDriver().getWindowHandles();
        for(String s : handles){
            if (s.equals(windowHandle)==false){
                driver.getDriver().switchTo().window(s);
                driver.findElement(By.linkText("立即购买")).click();
                break;
            }
            driver.getDriver().switchTo().window(s);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement orderInformation = driver.findElement(By.className("cart-body"));
        String orInName = orderInformation.findElement(By.className("package-info-title")).getText();
        driver.findElement(By.linkText("提交订单")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String order = "订单：";
        WebElement orderbox = driver.findElement(By.className("cart-body-title"));
        String or = orderbox.findElement(By.className("order")).getText();
        Assert.assertEquals(order,or,"订单不存在！");
        String orderName = orderbox.findElement(By.className("item-left")).getText();
        Assert.assertEquals(orInName,orderName,"购买课程错误！");
    }*/

}
