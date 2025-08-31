package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoqa.factory.DriverFactory;


public class elementsPage extends DriverFactory {

    WebDriver driver;

     By textBoxButton = By.id("#item-0");

@BeforeTest  
public void elementsPage(){
    setup();
    this.driver = driver;
}

@Test
public void elements(){
    driver.get("https://demoqa.com/");
    driver.findElement(textBoxButton).click();
}
}
