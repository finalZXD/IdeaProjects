package com.lin.selenium.business;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.handle.BaseHandle;
import com.lin.selenium.handle.SearchHandle;
import com.lin.selenium.handle.SelectHandle;

public class SearchPro {
    public SearchHandle sh;
//    public BaseHandle bh;
    public SelectHandle selectHandle;
    public SearchPro(DriverBase driverBase){
        sh = new SearchHandle(driverBase);
        selectHandle = new SelectHandle(driverBase);
//        bh = new BaseHandle(driverBase);
    }
    public void search(String string,int i){
//        sh.clickSearchInput();
        sh.SearchInputText(string);

        sh.clickSearchIcon();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectHandle.clickSelectGood(i);
    }
}
