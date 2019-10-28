package com.lin.selenium.testCase;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.business.AddCartPro;
import com.lin.selenium.business.SearchPro;
import com.lin.selenium.handle.BaseHandle;
import com.lin.selenium.util.ProUtil;
import com.lin.selenium.util.TestngListenerScreenShot;
import com.lin.selenium.util.testData;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.Set;

//@Listeners({TestngListenerScreenShot.class})
public class TestShopping extends TestBase{

    @Test(dataProvider = "testData", dataProviderClass = testData.class)
    public void testSearchCommodity(String SearchName,/*@Optional("3") */int ShopListNum){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sp.search(SearchName,ShopListNum);
//        driver.takeScreenShot();
        driver.timeOut(3);
//        allWindows = driver.getAllWindows();
        acp.AddCart();
    }



}
