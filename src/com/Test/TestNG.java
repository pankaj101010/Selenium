package com.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNG {
	public WebDriver driver;
  @Test
  public void main() {
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("javatpoint");
	 driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Software file\\All jar\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
