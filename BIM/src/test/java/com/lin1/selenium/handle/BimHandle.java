package com.lin1.selenium.handle;

import com.lin1.selenium.base.DriverBase;
import com.lin1.selenium.page.BimPage;

public class BimHandle {
    public DriverBase driverBase;
    public BimPage bimPage;
    public BimHandle(DriverBase driver){
        this.driverBase = driver;
        bimPage = new BimPage(driver);
    }
    /*
    *  输入身高
    */
    public void heightInputText(String height){
        bimPage.sendKeys(bimPage.getHeightInputElement(),height);
    }
    /*
     *  输入体重
     */
    public void weightInputText(String weight){
        bimPage.sendKeys(bimPage.getWeightInputElement(),weight);
    }
    /*
    * 点击计算按钮
    * */
    public void calculatorClick(){
        bimPage.click(bimPage.getCalculator());
    }
    /*
    * 获取返回结果
    * */
    public String getResult(){
        return bimPage.getText(bimPage.getTextValue());
    }
}
