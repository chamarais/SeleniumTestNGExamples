package chamara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc2.STUDENT\\Desktop\\SeleniumTestNGTraining101-master\\SeleniumTestNGTraining101-master\\lib\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTestNGTraining101-master\\SeleniumTestNGTraining101-master\\lib\\chromedriver_win.exe");
	    WebDriver driver = new ChromeDriver();
//	    driver = new FirefoxDriver();
	    driver.get("http://www.calculator.net/");
	    driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	    driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
	    driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	}

}
