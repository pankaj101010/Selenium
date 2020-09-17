package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstseleniumtest {

	public static void main(String[] args) throws InterruptedException {
	  // System.setProperty("webdriver.chrome.driver", "E:\\Software file\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "E:\\Software file\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		//driver.findElement(By.cssSelector("input[type*='text']")).sendKeys("hifbshd");
		//driver.findElement(By.cssSelector("input[name*='btnK']")).click();
		//driver.get("https://www.amazon.in");
//		Select ak=new Select(driver.findElement(By.cssSelector("#day")));
//		ak.selectByValue("12");
//		Select ak1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
//		ak1.selectByVisibleText("Apr");
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		/*
		driver.findElement(By.cssSelector("a[id*='a-autoid-0-announce']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("abcd@gmail.com");
		driver.findElement(By.cssSelector("input[id*='continue']")).click();
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("pankaj");
		driver.findElement(By.cssSelector("input[type*='submit']")).click();
		driver.findElement(By.cssSelector("a[id*='ap-account-fixup-phone-skip-link']")).click();
		//	Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.close();
		*/
		
//        driver.findElement(By.cssSelector("input#username.input.r4.wide.mb16.mt8.username")).sendKeys("aljbfd");
//        driver.findElement(By.id("password")).sendKeys("jhdf");
//        driver.findElement(By.id("Login")).click();
//       System.out.println(driver.findElement(By.id("error")).getText());
//       driver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]")).click();
//        WebDriverWait wait = new WebDriverWait(driver,5);
		//driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("wifistudy");
		//driver.findElement(By.id("search-icon-legacy")).click();
		//driver.findElement(By.cssSelector("a#endpoint.yt-simple-endpoint.style-scope.ytd-guide-entry-renderer")).click();
		//driver.findElement(By.cssSelector("a[title='Trending']")).click();
        //driver.findElement(By.id("text")).click();
		//driver.findElement(By.cssSelector("a.yt-simple-endpoint style-scope ytd-guide-entry-renderer")).click();
		
	}

}
