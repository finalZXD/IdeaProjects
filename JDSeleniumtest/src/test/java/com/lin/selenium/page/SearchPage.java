package com.lin.selenium.page;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{
    public SearchPage(DriverBase driver){
        super(driver);
    }
    /*
    * 获取查询输入框元素
    * */
    public WebElement getSearchInputElement(){
        return element(getByLocator.getLocator("SearchInput"));
    }
    /*
    * 获取查询图标元素
    * */
    public WebElement getSearchIconElement(){
        return element(getByLocator.getLocator("SearchIcon"));
    }
}
