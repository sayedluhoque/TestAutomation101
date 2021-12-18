package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {
    public static WebDriver driver;
    public static void main(String[] args) {
        //chrome_launch();
        //open_URL();
        //chrome_close();
        //edge_launch();
       // edge_close();
        opera_launch();
        opera_close();
    }
    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
    }
    public static void edge_launch() {
        System.setProperty("webdriver.edge.driver", "./src/main/resources/Drivers/msedgedriver.exe");
        driver = new EdgeDriver();
    }
    public static void opera_launch() {
        System.setProperty("webdriver.opera.driver", "./src/main/resources/Drivers/operadriver.exe");
        driver = new OperaDriver();
    }
    public static void chrome_close(){
       // driver.close();
        driver.quit();
    }
    public static void edge_close(){
        //driver.close();
        driver.quit();
    }
    public static void opera_close() {
        driver.close();
        //driver.quit();
    }
    public static void open_URL(){
        driver.get("https://google.com");
    }
}
