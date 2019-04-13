package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YoutubeTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Software file\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Boht Hard song");
        Actions s = new Actions(driver);    
        //driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Boht Hard song");
       // driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
       // Thread.sleep(5000);
        //driver.findElement(By.partialLinkText("BOHT HARD - EMIWAY X")).click();
	}

}
