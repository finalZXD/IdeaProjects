package com.lin1.selenium.util;

import org.openqa.selenium.By;

import java.io.IOException;

public class getByLocator {
    public static By getByLocator(String key){
        ProUtil proUtil = null;
        try{
            proUtil = new ProUtil("BIM/target/element.properties");
        }catch (Exception e){
            e.printStackTrace();
        }
        String locator = proUtil.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        if (locatorType.equalsIgnoreCase("id")){
            return By.id(locatorValue);
        }else if(locatorType.equalsIgnoreCase("name")){
            return By.name(locatorValue);
        }else if(locatorType.equalsIgnoreCase("Xpath")){
            return By.xpath(locatorValue);
        }else if(locatorType.equalsIgnoreCase("linkText")){
            return By.linkText(locatorValue);
        }else if (locatorType.equalsIgnoreCase("tagName")){
            return By.tagName(locatorValue);
        }else if (locatorType.equalsIgnoreCase("className")){
            return By.className(locatorValue);
        }else if(locatorType.equalsIgnoreCase("cssSelector")){
            return By.cssSelector(locatorValue);
        }else {
            return By.partialLinkText(locatorValue);
        }
    }
}
