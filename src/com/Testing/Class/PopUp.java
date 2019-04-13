package com.Testing.Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software file\\All jar\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://durgasoft.com/");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		//Thread.sleep(20000);
		wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//img[@src='close.png']"))));
		driver.findElement(By.xpath("//img[@src='close.png']")).click();
		//a.click();
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Close widget')]")))).click();
        
	}

}
