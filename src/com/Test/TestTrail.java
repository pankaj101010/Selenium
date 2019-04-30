package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestTrail {
 public WebDriver driver;
 
 @Test 
 public void googleTitleTest() {
	  String title = driver.getTitle();
	  System.out.println(title);
 }
 
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Software file\\All jar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

 @AfterMethod
 public void logout() {
	 driver.close();
 }
 
 
}
