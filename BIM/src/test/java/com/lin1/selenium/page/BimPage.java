package com.lin1.selenium.page;

import com.lin1.selenium.base.DriverBase;
import com.lin1.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

public class BimPage extends BasePage{
    public DriverBase driverBase;
    public BimPage(DriverBase driver){
        super(driver);
    }
    /*
    * 获取heigth输入框元素
    */
    public WebElement getHeightInputElement(){
        return element(getByLocator.getByLocator("f_height"));
    }
    /*
     * 获取Weigth输入框元素
     */
    public WebElement getWeightInputElement(){
        return element(getByLocator.getByLocator("f_weight"));
    }

    /*
    * 获取点击计算按钮
    * */
    public WebElement getCalculator() {
        return element(getByLocator.getByLocator("f_submit"));
    }
    /*
    * 获取返回值元素
    * */
    public WebElement getTextValue(){
        return element(getByLocator.getByLocator("Result"));
    }
}
