package com.demoqa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;


public class DriverFactory {

    public static WebDriver driver;

    public WebDriver  setup(){
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--headless=new")  ;
         driver = new ChromeDriver();
        //  driver.get("https://demoqa.com/");
         driver.manage().window().maximize();
        //  String title = driver.getTitle();
        //  System.out.println(title);
        return driver;
    }
    
    @AfterSuite
    public void teardown(){
        driver.quit();
    }


}
