package javaBase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumMuke {
    public WebDriver driver;
    public String windowHandle;
    /*打开driver并访问网址*/
    public void initDriver(){
        driver = new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.findElement(By.linkText("登录")).click();
    }

    //登录
    public void testLogin(){
        driver.findElement(By.name("email")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\"signup-form\"]/div[1]/input")).clear();
        String s = driver.findElement(By.xpath("//*[@id=\"signup-form\"]/div[1]/p")).getText();
        System.out.println(s);
        driver.findElement(By.name("email")).sendKeys("1807509350@qq.com");
        driver.findElement(By.name("password")).sendKeys("L13250218817");
        driver.findElement(By.className("moco-btn")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /*
    * 单选框
    * */
    public void radioBox(){
        driver.navigate().to("https://www.imooc.com/user/setprofile");
        driver.findElement(By.className("pull-right")).click();
        driver.findElement(By.xpath("//*[@id=\"profile\"]/div[4]/div/label[1]/input")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"profile\"]/div[4]/div/label//input"));
        System.out.println(elements.size());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(WebElement radio:elements){
            boolean flag = radio.isSelected();
            if(flag == false){
                radio.click();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }else {
                System.out.println("选中了");
            }
        }
    }

    public void checkBox(){
        WebElement check = driver.findElement(By.id("auto-signin"));
        System.out.println("是否选中了："+check.isSelected());
        System.out.println("是否有效："+ check.isEnabled());
        check.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
    * 表单提交
    * */
    public void webForm(){
        driver.findElement(By.id("signup-form")).submit();
    }

    /*
    * 上传头像
    * */
    public void upHeader(){
        driver.navigate().to("https://www.imooc.com/user/setprofile");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String jsString = "document.getElementsByClassName(\"update-avator\")[0].style.bottom='0'";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(jsString);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.className("js-avator-link")).click();
        driver.findElement(By.id("upload")).sendKeys("C:\\Users\\shulin.xu\\Desktop\\picture\\2.jpg");
        driver.findElement(By.className("moco-btn-normal")).click();
    }

    /*
    * 下拉框
    * */
    public void downSelectBox(){
        driver.get("https://www.imooc.com/user/setprofile");
        driver.findElement(By.className("pull-right")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement formElement = driver.findElement(By.id("profile"));
        WebElement jobsl = formElement.findElement(By.id("job"));
        Select downList = new Select(jobsl);
        downList.selectByIndex(17);

        WebElement addressP = formElement.findElement(By.id("province-select"));
        WebElement addressC = formElement.findElement(By.id("city-select"));
        WebElement addressA = formElement.findElement(By.id("area-select"));
        Select addPList = new Select(addressP);
        Select addCList = new Select(addressC);
        Select addAList = new Select(addressA);
        addPList.selectByIndex(1);
        addCList.selectByValue("1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addAList.selectByIndex(5);

        System.out.println(addPList.isMultiple());
        System.out.println(downList.isMultiple());
        System.out.println(downList.getAllSelectedOptions());
        System.out.println(downList.getFirstSelectedOption().getText());
        System.out.println(addPList.getAllSelectedOptions());
        System.out.println(addPList.getFirstSelectedOption().getText());
    }
    /*
    * 鼠标事件
    * */
    public void mouseAction(){
        WebElement loginAc = driver.findElement(By.id("js-signin-btn"));
        WebElement mouseAc = driver.findElement(By.className("menuContent"));
        List<WebElement> item = mouseAc.findElements(By.className("item"));

        Actions action = new Actions(driver);
        action.click(loginAc).perform();
        action.moveToElement(item.get(0)).perform();
        windowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("微服务")).click();
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
    * iframe切换
    * */
    public void iframe(){
        driver.get("https://www.imooc.com/article/publish#");
        WebElement iframeElement = driver.findElement(By.id("ueditor_0"));
        driver.switchTo().frame(iframeElement);
        driver.findElement(By.tagName("body")).sendKeys("hello world");
    }

    /*
    * 窗口
    * */
    public void windowsHandle(){
        Set<String> handles = driver.getWindowHandles();
        for (String s : handles){
            if(s.equals(windowHandle)){
                driver.switchTo().window(s);
                driver.findElement(By.className("rl-close")).click();
                break;
            }
            System.out.println(s);
            driver.switchTo().window(s);
        }
        driver.findElement(By.className("course-card-top")).click();
//        driver.findElement(By.linkText("高级")).click();
    }

    /*
    * 等待
    * */
    public void waitforElements(){
        //隐式等待
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //显示等待
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("test")));
    }
    /*关闭浏览器*/
    public void testClose(){
        driver.quit();
    }
    public static void main(String[] args){
        SeleniumMuke sm = new SeleniumMuke();
        sm.initDriver();
//        sm.webForm();
//        sm.checkBox();
//        sm.testLogin();
//        sm.upHeader();
//        sm.radioBox();
//        sm.downSelectBox();
        sm.mouseAction();
//        sm.iframe();
        sm.windowsHandle();
    }
}
