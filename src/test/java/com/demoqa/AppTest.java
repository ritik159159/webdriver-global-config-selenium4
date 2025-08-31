package com.demoqa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.demoqa.factory.DriverFactory;

/**
 * Unit test for simple App.
 */
public class AppTest extends DriverFactory 
{
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
