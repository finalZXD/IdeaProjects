package com.test.code.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ProUtil {
    private String url;
    private ResourceBundle bundle;

    @BeforeTest
    public void beforeClass(){
        bundle = ResourceBundle.getBundle("Url", Locale.CHINA);
        url = bundle.getString("testerhome_url");
    }

    @Test
    public void testGetCookies(){
        String result;
//        String uri = bundle.getString("param_url");
//        String testUrl = this.url+uri;
        CookieStore cookieStore = new BasicCookieStore();
        HttpGet get = new HttpGet(url);
        HttpClient client = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
        try {
            HttpResponse response = client.execute(get);
            result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(cookieStore.getCookies());
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("失败");
        }
    }
}
