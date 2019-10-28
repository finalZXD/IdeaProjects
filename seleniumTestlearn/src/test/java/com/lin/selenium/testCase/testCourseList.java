package com.lin.selenium.testCase;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.util.getByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Test
public class testCourseList extends CaseBase {
    public DriverBase driver;
    public testCourseList(){
        this.driver = InitDriver("chrome");
    }
    public void CourseList() throws IOException {
        driver.get("https://coding.imooc.com/");
        driver.manageWindowSize().maximize();
        List<String> listString = this.listElement();
        System.out.println(listString.size());
        for (int i = 0; i < listString.size(); i++){
            /*try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
//            driver.findElement(By.className("js-close")).click();
            WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'" + listString.get(i) + "')]"));
            JavascriptExecutor executor = (JavascriptExecutor) driver.getDriver();
            executor.executeScript("arguments[0].click()",ele);
            driver.back();
        }
    }
    /*
    * 获取所有的页面课程
    * */
    public List<String> listElement() throws IOException {
        List<String> listString = new ArrayList<String>();
        WebElement elem=  driver.findElement(getByLocator.getLocator("courses"));
        List<WebElement> listElement = elem.findElements(getByLocator.getLocator("ListCourses"));
        for (WebElement el : listElement){
            listString.add(el.findElement(getByLocator.getLocator("TextCourses")).getText());
        }
        return listString;
    }

}
