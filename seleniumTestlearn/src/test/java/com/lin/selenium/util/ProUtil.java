package com.lin.selenium.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class ProUtil {
    private Properties prop;
    private String filePath;
    /*
     * 构造方法
     * */
    public ProUtil(String filePath) throws IOException {
        this.filePath = filePath;
        this.prop = readProperties();
    }
/*
* 读取配置文件
* */
    private Properties readProperties() throws IOException {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            InputStream in = new BufferedInputStream(inputStream);
            BufferedReader bf = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
            properties.load(bf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return properties;
    }
    public String getPro(String key) {
        if(prop.containsKey(key)){
            String username = prop.getProperty(key);
            return username;
        }else {
            System.out.println("你获取的key值不对！");
            return "";
        }
    }
}
