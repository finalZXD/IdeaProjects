package com.lin.selenium.base;

import org.openqa.selenium.*;

import java.io.File;
import com.google.common.io.Files;

import java.util.List;
import java.util.Set;
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
    * 封装element
    * */
    public WebElement findElement(By by){
        return driver.findElement(by);
    }
    /*
     *封装 elements
     * */
    public List<WebElement> findElements(By by){
        return driver.findElements(by);
    }
    /*
    *封装 get
    * */
    public void get(String url){
        driver.get(url);
    }
    /*
    * 封装 窗口：manager.Window
    * */
    public WebDriver.Window managerWindowSize(){
        return driver.manage().window();
    }
    /*
    * back 页面返回上一级
    * */
    public void back(){
        driver.navigate().back();
    }
    /*
    * 封装  切换Windows窗口
    * */
    public void switchWindows(String name){
        driver.switchTo().window(name);
    }
    /*
    * 封装 切换alter窗口
    * */
    public void switchAlter(){
        driver.switchTo().alert();
    }
    /*
     * 封装 模态框切换
     * */
    public void switchToMode(){
        driver.switchTo().activeElement();
    }
    /*
    * 关闭窗口
    * */
    public void close(){
        System.out.println("关闭当前页面");
        driver.close();
    }
    /*
    * 关闭浏览器
    * */
    public void quit(){
        System.out.println("退出浏览器");
        driver.quit();
    }
    /*
    * 封装等待时间 颗粒度为秒
    * */
    public void timeOut(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
    /*
    * 封装 获取当前窗口
    * */
    public String getWindow(){
        return driver.getWindowHandle();
    }
    /*
    * 封装  获取所有窗口
    * */
    public Set<String> getAllWindows(){
        return driver.getWindowHandles();
    }
    /*
    * 截图
    * */
    public void takeScreenShot(){
        long data = System.currentTimeMillis();
        String path = String.valueOf(data);
        String curPath = System.getProperty("user.dir");
        path = path +".png";
        String screenPath = curPath + "/" + path;
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try{
            Files.copy(screen, new File(screenPath));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /*
    * 获取Url
    * */
    public String getNowUrl(){
        return driver.getCurrentUrl();
    }
}
