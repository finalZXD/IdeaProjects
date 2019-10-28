package javaBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ITest {
/*    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys(new String[]{"你好！"});
        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
        Thread.sleep(30000);
        String a = driver.findElement(By.xpath("//*[@id=\"kw\"]")).getTagName();
        System.out.println(a);
        driver.quit();

    }*/

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jd.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.findElement(By.id("key")).click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        driver.findElement(By.id("key")).sendKeys("抽绳背包");
        driver.findElement(By.className("button")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        WebElement elem = driver.findElement(By.id("J_goodsList"));
        List<WebElement> List = driver.findElements(By.className("p-img"));
        System.out.println(List.size());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List.get(1).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Set<String> allWindow = driver.getWindowHandles();
        String window = driver.getWindowHandle();
        for (String s : allWindow){
            if (s.equals(window) == false){
                driver.switchTo().window(s);
                break;
            }
            System.out.println(s);
            driver.switchTo().window(s);
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("InitCartUrl")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.linkText("我的购物车")).click();
        allWindow = driver.getWindowHandles();
        Object as = allWindow.toArray()[allWindow.size() - 1];
        int value = allWindow.size()-1;
        for (String s : allWindow){
            if (s.equals(as) == true){
                driver.switchTo().window(s);
                break;
            }
            System.out.println(s);
//            driver.switchTo().window(s);
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement el = driver.findElement(By.className("options-box")).findElement(By.linkText("去结算"));
        el.click();

    }
}
