package com.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	 AppiumDriver driver;

	@BeforeMethod
	  public void beforeMethod() throws Exception {
		File apkFile = new File("apk"+File.separator+"eribank.apk");
    	String apkFilePath = apkFile.getAbsolutePath();
        
    	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    	desiredCapabilities.setCapability(MobileCapabilityType.APP, apkFilePath);
    	desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    	desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
    	desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
    	desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
    	URL url = new URL("http://127.0.0.1:4723/wd/hub");
    	driver = new AndroidDriver(url, desiredCapabilities);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	  
	
  
	 
	 @Test
  public void testcase() throws InterruptedException {
		 //login to the system
		 driver.findElement(By.xpath("//android.widget.EditText[@text='Username']")).sendKeys("company");
         driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.experitest.ExperiBank:id/passwordTextField']")).sendKeys("company");
         driver.findElement(By.xpath("//android.widget.Button[@text='Login']")).click();
         
         //Navigate to mortgage request
         driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.experitest.ExperiBank:id/mortageRequestButton']")).click();
         
         //enter data
         driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.experitest.ExperiBank:id/nameTextField']")).sendKeys("kasun");
         driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.experitest.ExperiBank:id/lastNameTextField']")).sendKeys("lakmal");
         driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.experitest.ExperiBank:id/ageTextField']")).sendKeys("25");
         driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.experitest.ExperiBank:id/addressOneTextField']")).sendKeys("456");
         driver.hideKeyboard();
         driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.experitest.ExperiBank:id/addressTwoTextField']")).sendKeys("123");
         driver.hideKeyboard();
         driver.findElement(By.xpath("//android.widget.Button[@text='Select']")).click();
         driver.scrollTo("Argentina");
         driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
         driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click();
         
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
