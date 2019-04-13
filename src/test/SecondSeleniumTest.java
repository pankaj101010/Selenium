package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;


public class SecondSeleniumTest {

	public static void main(String[] args) throws InterruptedException,  Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Software file\\akshay java soft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("kajsdvh");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		java.io.File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(srcFile, destFile);.copyFile(screenshotFile, new File("F:\\SoftwareTestingMaterial.png"));
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("javatpoint");
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		
//		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
//		driver.findElement(By.cssSelector("input[id*='login1']")).sendKeys("hello");
//		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("bye");
//		driver.findElement(By.cssSelector("input[type*='submit']")).click();
		driver.close();
	}

}
