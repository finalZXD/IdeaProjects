package com.lin.selenium.business;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.handle.loginPageHandle;

import java.io.IOException;


public class LoginPro {
    public loginPageHandle lph;
    public LoginPro(DriverBase driver){
        lph = new loginPageHandle(driver);
    }
    public void login(String username,String password) throws IOException {
        lph.clickLoginLink();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(lph.assertLoginPage()){
            lph.sendKeysUser(username);
            lph.sendKeysPassword(password);
            lph.clickLoginButton();
        }else{
            System.out.println("页面不存在或者状态不正确！");
        }
    }
}
