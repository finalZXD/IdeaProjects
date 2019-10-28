package com.lin1.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DriverBase {
    public WebDriver driver;
    public DriverBase(String browser){
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.driverName(browser);
    }

    /*
    * 获取driver
    * */
    public WebDriver getDriver(){
        return driver;
    }
    /*
    * 封装get
    * */
    public void get(String url){
        driver.get(url);
    }

    /*
    * 封装Element
    * */
    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    /*
    * 封装Elements
    * */
    public List<WebElement> findElements(By by){
        return driver.findElements(by);
    }

    /*
    * 封装等待时间 颗粒度为秒
    * */
    public void timeOut(int time){driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
    /*
    * 关闭窗口
    * */
    public void close(){
        System.out.println("关闭当前窗口");
        driver.close();
    }
    /*
    * 关闭当前浏览器
    * */
    public void quit(){
        System.out.println("关闭当前浏览器");
        driver.quit();
    }
    /*
    * 页面最大化
    * */
    public WebDriver.Window managerWindowSize(){
        return driver.manage().window();
    }
}
