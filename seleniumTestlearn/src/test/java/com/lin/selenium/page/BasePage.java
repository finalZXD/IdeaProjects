package com.lin.selenium.page;

import com.lin.selenium.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class BasePage {
    public DriverBase driver;
    public BasePage(DriverBase driver){
        this.driver = driver;
    }
    /*
    * 定位Element
    * @param By by
    * */
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    /*
    * 封装父级获取子级节点;层级定位
    * */
    public WebElement nodeElement(By by, By nodeby){
        WebElement element = this.element(by);
        WebElement nodeElement = element.findElement(nodeby);
        return nodeElement;
    }

    /*
    * 封装点击
    * */
    public void click(WebElement element){
        if(element != null){
            element.click();
        }else{
            System.out.println("元素定位不到，点击失败！");
        }
    }
    /*
    *封装输入
    * */
    public void sendKeys(WebElement element, String value){
        if(element != null){
            element.sendKeys(value);
        }else{
            System.out.println(element+"元素定位不到，输入失败！");
        }
    }
    /*
    * 判断元素是否显示
    * */
    public boolean assertElements(WebElement element){
        return element.isDisplayed();
    }
    /*
    * 封装manage.window
    * */
    public WebDriver.Window manageWidowSize(){
         return driver.manageWindowSize();
    }
    /*
    * 获取文本信息
    * */
    public String getText(WebElement element){
        return element.getText();
    }

}
