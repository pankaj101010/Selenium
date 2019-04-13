package com.Testing.Class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Software file\\All jar\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.canarabank.in/");
		driver.findElement(By.xpath("//button[starts-with(text(),'Log')]")).click();
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Close widget')]")))).click();
        
	}

}
