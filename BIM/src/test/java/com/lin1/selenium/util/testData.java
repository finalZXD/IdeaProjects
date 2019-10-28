package com.lin1.selenium.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class testData {
    public static Object[][] Data(String file) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
/*            File f = new File(file);
            FileInputStream out = new FileInputStream(f);*/

/*            File f = new File("target/testData.xls");
            InputStream out = new FileInputStream(f);*/
/*            @SuppressWarnings("resource")
            XSSFWorkbook workbook = new XSSFWorkbook(out);*/
            Workbook workbook = testData.getWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            //获取总行数
            int rowTotalNum = sheet.getLastRowNum() + 1;
            //获取总列数
            int columns = sheet.getRow(0).getPhysicalNumberOfCells();
//            System.out.println(columns+":"+rowTotalNum);
            HashMap[][] map = new HashMap[rowTotalNum - 1][1];
            //对数组中所有元素hashmap进行初始化
            if (rowTotalNum > 1) {
                for (int i = 0; i < rowTotalNum - 1; i++) {
                    map[i][0] = new HashMap<>();
                }
            } else {
                System.out.println("测试的Excel" + ":" + "中没有数据");
            }
            //获取首行的列名，作为hashmap的key值
            for (int c = 0; c < columns; c++) {
                String cellValue = sheet.getRow(0).getCell(c).getStringCellValue();
//                System.out.println(cellValue);
                arrayList.add(cellValue);
            }
//            System.out.println("arrayList:"+arrayList);
            // 遍历所有的单元格的值添加到hashmap中
            for (int r = 1; r < rowTotalNum; r++) {
                for (int c = 0; c < columns; c++) {
                    String cellvalue = String.valueOf(sheet.getRow(r).getCell(c).getNumericCellValue());

//                    String cellvalue = sheet.getRow(r).getCell(c).getStringCellValue();
//                    System.out.println("getCVVV"+cellvalue);
                    map[r - 1][0].put(arrayList.get(c), cellvalue);
//                    System.out.println("getC"+arrayList.get(c)+"  "+map);
                }
            }
            return map;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static Workbook getWorkbook(String filePath) {
        Workbook workbook = null;
        try {
            if (filePath.endsWith(".xls")) {
                File f = new File(filePath);
                FileInputStream out = new FileInputStream(f);
                workbook = new XSSFWorkbook(out);;
            } else if (filePath.endsWith(".xlsx") || filePath.endsWith(".xlsm")) {
                workbook = new XSSFWorkbook(filePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return workbook;
    }


}
