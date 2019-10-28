package learnTest;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

@Listeners({TestngListennerScreenShot.class})
public class Login extends baseDriver {
//    public WebDriver driver;
    public String loginUrl = "https://www.imooc.com";
//    public String userElement = "email";
//    public String userBy = "name";
//    public String btElement = "js-signin-btn";
//    public String btBy = "id";
//    public String psElement = "password";
//    public String psBy = "name";
//    public String loginBtElement = "moco-btn";
//    public String loginBtBy = "className";
//    public String username = "13060641219";
//    public String userpass = "L13250218817";
//    public String headElement = "header-avator";
//    public String headBy = "id";
//    public String userInfoElement = "name";
//    public String userInBy = "className";


    public String idname = "weixin_慕婉清5435972";

    private void sleep() {          //隐性等待时间3秒
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void InitDriver(){
//        driver = new ChromeDriver();
        driver.get(loginUrl);
        driver.manage().window().maximize();
        this.element(this.byStr("button")).click();
        this.sleep();
    }

   public void loginScript(String username,String userpass){
        this.InitDriver();
        WebElement user = this.element(this.byStr("username"));
        user.isDisplayed();
        WebElement password = this.element(this.byStr("userpass"));
        password.isDisplayed();
        WebElement loginBt = this.element(this.byStr("loginbutton"));
        loginBt.isDisplayed();
        user.sendKeys(username);
        password.sendKeys(userpass);
        loginBt.click();
        this.sleep();
        WebElement headerAv = this.element(this.byStr("header"));
        headerAv.isDisplayed();
        Actions actions = new Actions(driver);
        actions.moveToElement(headerAv).perform();
        String userInfo = this.element(this.byStr("nameInfo")).getText();
        System.out.println(userInfo);
        if(userInfo.equals(idname)){
            System.out.println("登录成功");
            this.takeScreenShot();
        }else{
            System.out.println("登录失败");
        }
        driver.close();
    }
    /*
    * By by 封装
    * */
    public By byStr(String username){
        learnTest.ProUtil properties = new learnTest.ProUtil("target/element.properties");
        String locator = properties.getPro(username);
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
        } else if (locatorType.equals("linkText")) {
            return By.linkText(locatorValue);
        }else if(locatorType.equals("xpath")){
            return By.xpath(locatorValue);
        }else if(locatorType.equals("cssSelector")){
            return By.cssSelector(locatorValue);
        }else{
            return By.partialLinkText(locatorValue);
        }
    }

    /*
    * 封装Element
    * */
    public WebElement element(By by){
        WebElement ele = driver.findElement(by);
        return ele;
    }

        @Test
        public void loginpag(){
            this.loginScript("13060641219","L13250218817");
        }


//    public static void main(String[] args) throws Exception{
//        learnTest.Login login = new learnTest.Login();
//
//        /*
//        * key-value
//        * username-password
//        * */
//        HashMap<String,String> user = new HashMap<String,String>();
//        user.put("13060641219","L13250218817");
//        user.put("1807509350@qq.com","L13250218817");
//        Iterator<Map.Entry<String, String>> us = user.entrySet().iterator();
//        while (us.hasNext()){
//            Map.Entry entry = (Map.Entry) us.next();
//            String username = entry.getKey().toString();
//            String password = entry.getValue().toString();
//            login.loginScript(username,password);
//        }
//    }

}
