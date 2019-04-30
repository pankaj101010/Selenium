package com.Testing.Class;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MultiWindowOpen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software file\\All jar\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://qaclickacademy.com/practice.php");
		//driver.navigate().to("http://qaclickacademy.com/practice.php");
		//driver.get("http://qaclickacademy.com/practice.php");
		WebElement p = driver.findElement(By.xpath("//td[1]//ul[1]"));
		int c = p.findElements(By.tagName("a")).size();
		System.out.println(c);
		for (int i = 0; i < c; i++) {
			String onClick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			p.findElements(By.tagName("a")).get(i).sendKeys(onClick);
			String d = driver.getWindowHandle();
			driver.switchTo().window(d);
			Thread.sleep(5000);
		}
		System.out.println(driver.getWindowHandles());
		
		driver.findElement(By.xpath("//td[1]//ul[1]"));
		for (String handle : driver.getWindowHandles()) {
			 
		    driver.switchTo().window(handle);
		    }
		
		
//		Set<String> k = driver.getWindowHandles();
//		Iterator<String> it = k.iterator();
//		while (it.hasNext()) {
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
//		}

	}

}
