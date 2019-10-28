package javaBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driverTest {
    public static void main(String[] args){
        WebDriver d = new ChromeDriver();
        WebDriver ie = new InternetExplorerDriver();
        WebDriver firefox = new FirefoxDriver();

    }

}
