package learnTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login1 {
    public WebDriver driver;
    String url = "https://www.imooc.com/";
    @Test
    public void InitDriver(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.id("js-signin-btn")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods = {"InitDriver"})
    public void loginScript(){
        driver.findElement(By.name("email")).sendKeys("13060641219");
        driver.findElement(By.name("password")).sendKeys("L13250218817");
        driver.findElement(By.className("moco-btn")).click();
    }

}
