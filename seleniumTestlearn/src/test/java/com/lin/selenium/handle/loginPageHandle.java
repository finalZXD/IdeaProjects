package com.lin.selenium.handle;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.page.loginPage;

import java.io.IOException;

public class loginPageHandle {
    public DriverBase driver;
    public loginPage lp;
    public loginPageHandle(DriverBase driver){
        this.driver = driver;
        lp = new loginPage(driver);
    }
    /*
    * 输入用户名
    * */
    public void sendKeysUser(String username) throws IOException {
        lp.sendKeys(lp.getUserElement(),username);
    }
    /*
    * 输入密码
    * */
    public void sendKeysPassword(String password) throws IOException {
        lp.sendKeys(lp.getPassElement(),password);
    }
    /*
    * 点击登录链接按钮
    * */
    public void clickLoginLink() throws IOException {
        lp.click(lp.getLoginButtonLinkElement());
    }
    /*
    * 点击登录
    * */
    public void clickLoginButton() throws IOException {
        lp.click(lp.getLoginButtonElement());
    }
    /*
    * 点击自动登录元素
    * */
    public void clickAutoSigin() throws IOException {
        lp.click(lp.getAutoSigninElement());
    }
    /*
    * 判断是否为登录页面
    * */
    public boolean assertLoginPage() throws IOException {
        return lp.assertElements(lp.getUserElement());
    }
    /*
    * 设置浏览器最大化
    * */
    public void setWindowSize(){
        lp.manageWidowSize().maximize();
    }
}
