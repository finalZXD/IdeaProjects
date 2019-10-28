package com.lin.selenium.page;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.util.getByLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class loginPage extends BasePage {
    public loginPage(DriverBase driver){
        super(driver);
    }
    /*
    * 获取用户名
    * */
    public WebElement getUserElement() throws IOException {
        return element(getByLocator.getLocator("username"));
    }
    /*
    * 获取密码输入框
    * */
    public WebElement getPassElement() throws IOException {
        return element(getByLocator.getLocator("userpass"));
    }
    /*
    * 获取登录按钮element
    * */
    public WebElement getLoginButtonElement() throws IOException {
        return element(getByLocator.getLocator("loginbuttonclick"));
    }
    /*
    * 获取登录按钮的连接按钮
    * */
    public WebElement getLoginButtonLinkElement() throws IOException {
        return element(getByLocator.getLocator("loginbuttonlink"));
    }
    /*
    * 获取自动登录元素
    * */
    public WebElement getAutoSigninElement() throws IOException {
        return element(getByLocator.getLocator("autoSignin"));
    }
}
