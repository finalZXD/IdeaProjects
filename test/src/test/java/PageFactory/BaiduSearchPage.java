package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaiduSearchPage {
    WebDriver driver;

    @FindBy(id = "content_left")
    WebElement result;

    public String getResut(){
        return result.getText();
    }
    public BaiduSearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void Wait(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
}
