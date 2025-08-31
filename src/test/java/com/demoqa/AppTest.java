package com.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoqa.factory.DriverFactory;

/**
 * Unit test for simple App.
 */
public class AppTest extends DriverFactory 
{
   WebDriver driver;

     By textBoxButton = By.id("item-0");

@BeforeTest  
public void elementsPage(){
   driver = setup();
    
}

@Test
public void elements(){
    driver.get("https://demoqa.com/elements");
    driver.findElement(textBoxButton).click();
    System.out.println("--------Successfully Done ----------");
}
}
