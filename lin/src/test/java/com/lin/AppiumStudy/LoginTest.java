package com.lin.AppiumStudy;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {
    public static void main(String[] args) throws MalformedURLException {
        //1、打开app进入到页面--得到当前测试设备--得到对应的测试app--指定路口用来启动app
        //创建配置对象
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //去往配置对象中添加platformName配置
        desiredCapabilities.setCapability("platformName","Android");
        //去往配置对象中添加device Name配置
        desiredCapabilities.setCapability("deviceName", "192.168.220.101:5555");
        desiredCapabilities.setCapability("Version","7.1");
        //去往配置对象中添加app Package配置
        desiredCapabilities.setCapability("appPackage","com.android.contacts");
        //去往配置对象中添加app Activity配置
        desiredCapabilities.setCapability("appActivity",".activities.PeopleActivity");
        //创建Android驱动,参数：1、appium通讯地址，2、配置
        AndroidDriver<WebElement> androidDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

        androidDriver.findElement(By.id("com.android.contacts:id/floating_action_button")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{
            androidDriver.findElement(By.id("left_button")).click();
            Thread.sleep(3000);
//            androidDriver.findElementByXPath("//*[@text='Phone']").sendKeys("123123123");
//            androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"Phone\")").click();
            androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"Phone\")").sendKeys("666666");
            androidDriver.findElementByXPath("//android.widget.EditText[@text='Name']").click();
            androidDriver.findElementByXPath("//android.widget.EditText[@text='Name']").sendKeys("App5");
//            androidDriver.findElementByXPath("//*[@text='More fields']").click();
            Thread.sleep(3000);

        androidDriver.findElement(By.id("menu_save")).click();
        }catch (Exception e){
            androidDriver.quit();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        androidDriver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        androidDriver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        androidDriver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
    }
}
