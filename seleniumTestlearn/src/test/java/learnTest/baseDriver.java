package learnTest;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class baseDriver {
    WebDriver driver;
    public baseDriver(){
        driver = new ChromeDriver();
    }
    /*
     *截图
     * */
    public void takeScreenShot(){
        long date = System.currentTimeMillis();
        String path = String.valueOf(date);
        String curPath = System.getProperty("user.dir");
        path = path +".png";
        String screenPath = curPath + "/" + path;
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try{
            Files.copy(screen,new File(screenPath));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
