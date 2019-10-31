package com.test.code;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.CharsetUtils;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.Charset;

public class MyHttpClientTest {
    @Test
    public void test1(){
        String result ;
        HttpGet get = new HttpGet("https://www.baidu.com");
        HttpClient client = HttpClientBuilder.create().build();
        try {
            HttpResponse response = client.execute(get);
            result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
