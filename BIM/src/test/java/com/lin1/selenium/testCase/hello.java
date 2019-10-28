package com.lin1.selenium.testCase;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class hello {
    public WebDriver openBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        return driver;
    }
    public Object[][] TestDataFeed() throws IOException {
        File file = new File("C:\\Users\\shulin.xu\\IdeaProjects\\BIM\\target\\testData.xls");
        InputStream src = new FileInputStream(file);
        Workbook wb = new XSSFWorkbook(src);
        Sheet sh1 = wb.getSheetAt(0);
        int numberrow = sh1.getPhysicalNumberOfRows();
        Object [][] testData = new Object[numberrow][3];
        for(int i=0; i<numberrow; i++){
            testData [i][0] = sh1.getRow(i).getCell(0).getStringCellValue();
            testData [i][1] = sh1.getRow(i).getCell(1).getStringCellValue();
            testData [i][2] = sh1.getRow(i).getCell(2).getStringCellValue();
        }
        return testData;
    }
    public static void main(String[] args){
        Object[][] maps = null;
        hello h = new hello();
        h.openBrowser();
        try {
            maps = h.TestDataFeed();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(maps);
    }
}
