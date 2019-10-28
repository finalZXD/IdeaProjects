package com.lin.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectDriver {
    public WebDriver driverName(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }else {
            return new InternetExplorerDriver();
        }
    }
}
