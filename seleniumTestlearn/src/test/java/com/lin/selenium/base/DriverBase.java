package com.lin.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    public void stop(){
        System.out.println("Stop Webserver/关闭当前页面");
        driver.close();
    }
    public void closeWeb(){
        System.out.println("关闭浏览器");
        driver.quit();
    }

    /*
    * 封装element方法
    * */
    public WebElement findElement(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    /*
    * 封装elements
    * */
    public List<WebElement> findElements(By by){
        List<WebElement> elements = driver.findElements(by);
        return elements;
    }
    /*
    * 封装get
    * */
    public void get(String url){
        driver.get(url);
    }
    /*
    * 封装manage.window
    * */
    public WebDriver.Window manageWindowSize(){
        return driver.manage().window();
    }

    /*
    * 封装back
    * */
    public void back() {
        driver.navigate().back();
    }
    /*
    * 封装 切换Windows窗口
    * */
    public void switchWindows(String name){
        driver.switchTo().window(name);
    }
    /*
    * 封装 切换alert窗口
    * */
    public void switchAlter(){
        driver.switchTo().alert();
    }
    /*
    * 模态框切换
    * */
    public void switchToMode(){
        driver.switchTo().activeElement();
    }
}
