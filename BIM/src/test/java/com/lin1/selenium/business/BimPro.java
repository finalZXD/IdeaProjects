package com.lin1.selenium.business;

import com.lin1.selenium.base.DriverBase;
import com.lin1.selenium.handle.BaseHandle;
import com.lin1.selenium.handle.BimHandle;
import com.lin1.selenium.util.testData;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class BimPro {
    public DriverBase db;
    public BaseHandle bh;
    public BimHandle bimHandle;
    public String result;
    public BimPro(DriverBase driverBase){
        bh = new BaseHandle(driverBase);
        bimHandle = new BimHandle(driverBase);
        this.db = driverBase;
    }

    public void bim(String height, String weight, String hopeResult){
        bh.windowsMaximum();
        bimHandle.heightInputText(height);
        bimHandle.weightInputText(weight);
        bimHandle.calculatorClick();
        db.timeOut(3);
        result = bimHandle.getResult();
        assertEquals("计算错误",hopeResult,result);
    }

}
