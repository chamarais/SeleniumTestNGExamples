package com.selenium.pageobjects;

import org.openqa.selenium.*;
 
public class PageObjectsPercCalc 
{
   private static WebElement element = null;
 
   // Math Calc Link
   public static WebElement lnk_math_calc(WebDriver driver)
   {
      element = driver.findElement(By.linkText("Percentage"));
      return element;
   }
    
   //Percentage Calc Link
   public static WebElement lnk_percent_calc(WebDriver driver)
   {
      element = driver.findElement(By.linkText("Percentage"));
      return element;
   }
    
   //Number 1 Text Box
   public static WebElement txt_num_1(WebDriver driver)
   {
      element = driver.findElement(By.id("cpar1"));
      return element;
   }
    
   //Number 2 Text Box  
   public static WebElement txt_num_2(WebDriver driver)
   {
      element = driver.findElement(By.id("cpar2"));
      return element;
   }
    
   //Calculate Button   
   public static WebElement btn_calc(WebDriver driver) throws Exception
   {
	   Thread.sleep(1000);
      element = driver.findElement(By.cssSelector("input[type=\"image\"]")); 
      return element;
   }    
    
   // Result    
   public static WebElement web_result(WebDriver driver)
   {
      element = driver.findElement(By.xpath("//div[@id='content']/p[2]/font/b"));
      return element;
   }    
}