package com.lin.selenium.handle;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.page.SearchPage;

public class SearchHandle {
    public DriverBase driverBase;
    public SearchPage searchPage;
    public SearchHandle(DriverBase driver){
        this.driverBase = driver;
        searchPage = new SearchPage(driver);
    }
    /*
    * 点击输入框
    * */
    public void clickSearchInput(){
        searchPage.click(searchPage.getSearchInputElement());
    }
    /*
    * 输入框输入查询名称
    * */
    public void SearchInputText(String string){
        searchPage.sendKeys(searchPage.getSearchInputElement(),string);
    }
    /*
    * 点击查询图标
    * */
    public void clickSearchIcon(){
        searchPage.click(searchPage.getSearchIconElement());
    }
}
