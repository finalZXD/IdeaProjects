package com.lin.AppiumStudy;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class NewTest {
    static AndroidDriver<WebElement> androidDriver;
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

    public static void main(String[] args) throws MalformedURLException {
        new NewTest().BeforeTest1();
//        androidDriver.lockDevice();


        new NewTest().Baidu();

        new NewTest().AfterTest1();
    }

    public void BeforeTest1() throws MalformedURLException {
        desiredCapabilities.setCapability("Version","5.1.1");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("deviceName","127.0.0.1:62001");
        desiredCapabilities.setCapability("appPackage","com.android.browser");
        desiredCapabilities.setCapability("appActivity",".BrowserActivity");
        desiredCapabilities.setCapability("devicereadyTimeout",30);
        desiredCapabilities.setCapability("sessionOverride",true);
        desiredCapabilities.setCapability("noSign",true);
        desiredCapabilities.setCapability("noReset",true);
//        desiredCapabilities.setCapability("unicodeKeyboard",true);
//        desiredCapabilities.setCapability("resetKeyboard",true);
        androidDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

    }
    public void AfterTest1(){
        androidDriver.quit();
    }
    public void Baidu(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> contexts = androidDriver.getContextHandles();
        for(String context : contexts){
            System.out.println("context:" + context);
        }
        TouchAction action = new TouchAction(androidDriver).press(PointOption.point(200,250)).release().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> contexts1 = androidDriver.getContextHandles();
        for(String context : contexts1){
            System.out.println("context1:" + context);
        }
//        androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"搜索或输入网址\")").sendKeys("666666");
//        androidDriver.findElementByXPath("//android.view.View[@text = '搜索或输入网址']").sendKeys("你好！");
//        androidDriver.findElementByAndroidUIAutomator("new UiSelector().focused(true).setText(\"666\")");
        androidDriver.get("https://www.baidu.com/");
//        List<WebElement> Views = androidDriver.findElementsByClassName("android.view.View");
//        for(WebElement view : Views){
//            System.out.println(view);
//        }
//        androidDriver.findElements(By.className("android.view.View")).get(0).sendKeys("456");
//        androidDriver.findElement(By.id("cancel")).click();
//        try {
//            Thread.sleep(30000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
