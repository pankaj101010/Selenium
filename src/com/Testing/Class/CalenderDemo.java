package com.Testing.Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderDemo {
     public static void testCase01() throws InterruptedException {
    	 WebDriverManager.chromedriver().setup();
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("https://www.goibibo.com/");
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 
    	 driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys("Hyderabad");
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys(Keys.ARROW_DOWN);
    	 driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys(Keys.ENTER);
    	 driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys("Mumbai");
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys(Keys.ARROW_DOWN);
    	 driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys(Keys.ENTER);
    	 Thread.sleep(2000);
    	String amount=   driver.findElement(By.xpath("//div[@id='fare_20190430']/descendant::*[5]")).getText();
    	System.out.println(amount);
    	Thread.sleep(1000);
    	 driver.findElement(By.xpath("//div[@id='fare_20190430']/descendant::*[4]")).click();
     }
	public static void main(String[] args) throws InterruptedException {
		testCase01();
		
	}
	
	
}
