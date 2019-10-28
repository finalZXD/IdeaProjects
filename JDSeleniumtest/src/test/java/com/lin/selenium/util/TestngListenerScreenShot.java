package com.lin.selenium.util;

import com.lin.selenium.base.DriverBase;
import com.lin.selenium.testCase.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestngListenerScreenShot extends TestListenerAdapter {
    public DriverBase driverBase;

    @Override
    public void onTestSuccess(ITestResult tr){
        super.onTestSuccess(tr);
    }
    @Override
    public void onTestStart(ITestResult result){
        super.onTestStart(result);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        System.out.println("失败");
        takeScreenShot(tr);

    }
    private void takeScreenShot(ITestResult tr){
        TestBase tb = (TestBase) tr.getInstance();
        tb.driver.takeScreenShot();
    }

    @Override
    public void onStart(ITestContext testContext) {
        super.onStart(testContext);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        super.onFinish(testContext);
    }
}
