package com.lin.selenium.page;

import com.lin.selenium.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    public DriverBase driverBase;
    public BasePage(DriverBase driver){
        this.driverBase = driver;
    }
    /*
    * 定位Element
    * @param By by
    * */
    public WebElement element(By by){
        WebElement element = driverBase.findElement(by);
        return element;
    }
    /*
    * 定位Elements
    * */
    public List<WebElement> elements(By by){
        List<WebElement> listElement = driverBase.findElements(by);
        return listElement;
    }
    /*
    * 层级定位
    * */
    public WebElement nodeElement(By by,By nodeBy){
        WebElement element = this.element(by);
        return element.findElement(nodeBy);
    }
    public void click(WebElement element){
        if(element != null){
            element.click();
        }else{
            System.out.println("元素定位不到，点击失败！");
        }
    }
    /*
    * 封装输入操作
    * */
    public void sendKeys(WebElement element,String value){
        if(element != null){
            element.sendKeys(value);
        }else {
            System.out.println("元素定位不到，输入失败！");
        }
    }
    /*
    *判断元素是否存在
    * */
    public boolean assertElements(WebElement element){
        return element.isDisplayed();
    }
    /*
    * 获取文本信息
    * */
    public String getText(WebElement element){
        return element.getText();
    }
    /*
    * 页面最大化
    * */
    public void pageMaximize(){
        driverBase.managerWindowSize().maximize();
    }
}
