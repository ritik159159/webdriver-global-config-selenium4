package com.demoqa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {

    public static WebDriver driver;

    public void setup(){
         driver = new ChromeDriver();
         driver.get("https://demoqa.com/");
         driver.manage().window().maximize();
         String title = driver.getTitle();
         System.out.println(title);
    }
    
    public void teardown(){
        driver.quit();
    }


}
