package com.lin.selenium.testCase;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.business.AddCartPro;
import com.lin.selenium.business.SearchPro;
import com.lin.selenium.handle.BaseHandle;
import com.lin.selenium.util.ProUtil;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.io.IOException;

public class TestBase extends CaseBase {
    public DriverBase driver;
    //    public String firstWindow;
//    public Set<String> allWindows;
    public BaseHandle bh;
    public SearchPro sp;
    public AddCartPro acp;
    public ProUtil proUtil;
    String Url;
    @BeforeClass
    public void BeforeClass() throws IOException {
        this.driver = InitDriver("chrome");
        proUtil = new ProUtil("target/URL.properties");
        bh = new BaseHandle(driver);
        sp = new SearchPro(driver);
        acp = new AddCartPro(driver);
        driver.get(proUtil.getPro("JDUrl"));
        Url= driver.getNowUrl();
        Assert.assertEquals(Url,proUtil.getPro("JDUrl"),"访问网站不正确");
        bh.WindowsMaximum();
        driver.timeOut(2);
//        firstWindow = driver.getWindow();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }


}
