package com.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
 public WebDriver driver;
  @Test
	  public void googleTitleTest() {
		  String title = driver.getTitle();
		  System.out.println(title);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Software file\\All jar\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
