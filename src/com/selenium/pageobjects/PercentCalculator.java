package com.selenium.pageobjects;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

@Test
public class PercentCalculator {

    private static WebDriver driver = null;

    //To convert this code into TestNG code we remove main method & add void method by adding @test
    //public static void main(String[] args) throws Exception {
    @BeforeMethod
    public void set()
    {
    	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTestNGTraining101-master\\SeleniumTestNGTraining101-master\\lib\\chromedriver_win.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    
    public void PercentageCalculationTest() throws Exception {
    	
        driver.get("http://www.calculator.net");

        // Use page Object library now
        //PageObjectsPercCalc.lnk_math_calc(driver).click();
        PageObjectsPercCalc.lnk_percent_calc(driver).click();

        PageObjectsPercCalc.txt_num_1(driver).clear();
        PageObjectsPercCalc.txt_num_1(driver).sendKeys("10");

        PageObjectsPercCalc.txt_num_2(driver).clear();
        PageObjectsPercCalc.txt_num_2(driver).sendKeys("50");
        Thread.sleep(3000);
        PageObjectsPercCalc.btn_calc(driver).click();

		

        String result = PageObjectsPercCalc.web_result(driver).getText();

        Thread.sleep(3000);
        Assert.assertEquals(result,"5");
        /*if (result.equals("5")) {
            System.out.println(" The Result is Pass");
        } else {
            System.out.println(" The Result is Fail");

        }*/
        Assert.assertEquals(result, "6", "failed due to: ");
        
       
    }
    @AfterMethod
    public void  teardown() {
    	
    	 driver.close();
    	 driver.quit();
	}
}
