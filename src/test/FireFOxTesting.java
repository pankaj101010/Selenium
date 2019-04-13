package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFOxTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Software file\\All jar\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
           driver.get("https://www.facebook.com");
           driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pankaj");
          driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jhsbd");
          driver.findElement(By.xpath("//input[@value='Log In']")).click();
           // driver.close();
	}

}
