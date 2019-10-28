package com.lin1.selenium.page;

import com.lin1.selenium.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    public DriverBase driverBase;
    public BasePage(DriverBase driver){
        this.driverBase = driver;
    }
    /*
    * 定位Element元素
    * */
    public WebElement element(By by){
        WebElement element = driverBase.findElement(by);
        return element;
    }
    /*
    * 定位Elements元素
    */
    public List<WebElement> elements(By by){
        List<WebElement> elements = driverBase.findElements(by);
        return elements;
    }
    /*
    * click
    * */
    public void click(WebElement element){
        if(element != null){
            element.click();
        }else {
            System.out.println("元素定位失败！");
        }
    }
    /*
    * 页面最大化
    * */
    public void pageMaximize(){
        driverBase.managerWindowSize().maximize();
    }

    public void sendKeys(WebElement element,String value) {
        if (element != null){
            element.sendKeys(value);
        }else {
            System.out.println("元素定位不到，输入失败！");
        }
    }
    /*
    * 获取页面元素文本
    * */
    public String getText(WebElement element){
        return element.getText();
    }
}
