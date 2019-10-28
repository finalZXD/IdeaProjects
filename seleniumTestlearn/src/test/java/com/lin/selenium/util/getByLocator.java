package com.lin.selenium.util;

import org.openqa.selenium.By;

import java.io.IOException;

public class getByLocator {
    public static By getLocator(String key) throws IOException {
        ProUtil pro = new ProUtil("target/element.properties");
        String locator = pro.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        if(locatorType.equals("id")){
            return By.id(locatorValue);
        }else if(locatorType.equals("name")){
            return By.name(locatorValue);
        }else if(locatorType.equals("className")){
            return By.className(locatorValue);
        }else if(locatorType.equals("tagName")){
            return By.tagName(locatorValue);
        }else if(locatorType.equals("xpath")){
            return By.xpath(locatorValue);
        }else if(locatorType.equals("linkText")){
            return By.linkText(locatorValue);
        }else if(locatorType.equals("cssSelector")){
            return By.cssSelector(locatorValue);
        }else{
            return By.partialLinkText(locatorValue);
        }

        }
}
