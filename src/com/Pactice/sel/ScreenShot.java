package com.Pactice.sel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.FileUtils;

public class ScreenShot {
 static WebDriver driver;
 public static void takescreenshot(String filename) throws IOException {
	 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 org.apache.commons.io.FileUtils.copyFile(file, new File("E:\\test\\SampleWS\\test\\Seleniumtest\\src\\com\\Pactice\\sel"+filename+".jpg"));
 }
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Software file\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

}
