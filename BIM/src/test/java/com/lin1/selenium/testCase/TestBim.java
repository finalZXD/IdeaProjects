package com.lin1.selenium.testCase;

import com.lin1.selenium.base.DriverBase;
import com.lin1.selenium.business.BimPro;
import com.lin1.selenium.util.ProUtil;
import com.lin1.selenium.util.testData;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.HashMap;

public class TestBim extends CaseBase{
    public DriverBase driver;
    public ProUtil proUtil;
    public BimPro bimPro;

    @BeforeMethod
    public void BeforeTest(){
        this.driver = InitDriver("chrome");
        proUtil = new ProUtil("target/URL.properties");
        driver.get(proUtil.getPro("Bim"));
        System.out.println("开始");
    }

    @DataProvider(name = "testData")
    public Object[][] data() throws IOException {
        testData td = new testData();
        return td.Data("target/testData.xls");
    }

    @Test(dataProvider = "testData")
    public void test(HashMap<String, String> data){
//        int height = Integer.parseInt(data.get("height"));
/*        double height = Double.parseDouble(String.valueOf(data.get("height")));
        double weight = Double.parseDouble(String.valueOf(data.get("weight")));
        double hopeResult = Double.parseDouble(String.valueOf(data.get("hopeResult")));*/
        String height = data.get("height");
        String weight = data.get("weight");
        String hopeResult = data.get("hopeResult");
        System.out.println(height+":"+weight+":"+hopeResult);
        bimPro.bim(height,weight,hopeResult);
    }
    @AfterMethod
    public void AfterTest(){
        driver.quit();
    }
}
