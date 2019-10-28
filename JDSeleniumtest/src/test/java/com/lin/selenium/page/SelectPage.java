package com.lin.selenium.page;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SelectPage extends BasePage{
    public SelectPage(DriverBase driver) {
        super(driver);
    }
    /*
    * 获取所有商品列表元素
    * */
    public WebElement getSelectListElement(int i){
        List<String> listString = new ArrayList<String>();
        List<WebElement> listElement = elements(getByLocator.getLocator("ListItem"));
        return listElement.get(i);
    }
    /*
    * 获取列表中商品个数
    * */
    public int getSelectListNum(){
        List<String> listString = new ArrayList<String>();
        List<WebElement> listElement = elements(getByLocator.getLocator("ListItem"));
        return listElement.size();
    }
}
