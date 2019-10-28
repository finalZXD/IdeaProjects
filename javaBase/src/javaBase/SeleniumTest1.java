package javaBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest1 {
    public WebDriver driver;
    public void InitDriver(){
//        driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.get("http://baidu.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    public void inputDriver(){
//        driver.findElement(By.linkText("新闻")).click();
//        driver.findElement(By.partialLinkText("新闻")).click();
//        driver.findElement(By.cssSelector("#kw")).sendKeys("hello world");
        driver.findElement(By.xpath("//*[@id=\"kw\"]")).click();
        driver.findElement(By.id("kw")).sendKeys("Hello World");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.className("s_ipt")).clear();
        driver.findElement(By.name("wd")).sendKeys("你好！");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void inputDriver1(){
        String s = driver.findElement(By.id("su")).getAttribute("value");
        System.out.println(s);
    }
    public void close(){
        driver.quit();
    }
    public static void main(String[] args){
        SeleniumTest1 as = new SeleniumTest1();
        as.InitDriver();
//      as.inputDriver();
        as.inputDriver1();
        as.close();

    }
}
