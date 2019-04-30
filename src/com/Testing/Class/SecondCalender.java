package com.Testing.Class;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondCalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software file\\All jar\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("notification-frame-~2514428c7");
		driver.findElement(
				By.xpath("//*[@id='webklipper-publisher-widget-container-notification-container']/descendant::*[1]"))
				.click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
		// driver.findElement(By.xpath("//div[@id='fare_20190430']/descendant::*[4]")).click();
		List<WebElement> entirecalendar = driver.findElements(By.xpath("//div[@aria-disabled='false']"));
		// System.out.println(entirecalendar.size());
		int minAmount = 10000;
		for (int i = 1; i <= entirecalendar.size(); i++) {
			String amount = driver.findElement(By.xpath("//div[@aria-disabled='false'][" + i + "]/descendant::*[5]"))
					.getText();
			// System.out.println(amount);
			int p = Integer.parseInt(amount);
			if (p < minAmount) {
				minAmount = p;
			}
		}
		System.out.println(minAmount);
		for (int i = 1; i <= entirecalendar.size(); i++) {
			String a = Integer.toString(minAmount);
			String b = driver.findElement(By.xpath("//div[@aria-disabled='false'][" + i + "]/descendant::*[5]"))
					.getText();
			if (a.equals(b)) {
				driver.findElement(By.xpath("//div[@aria-disabled='false'][" + i + "]/descendant::*[5]")).click();
				break;
			}
		}
		//driver.close();

	}

}
