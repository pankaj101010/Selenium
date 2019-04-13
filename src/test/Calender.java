package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Software file\\All jar\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody1/tr1/td/a"));
		int date = dates.size();
		for (int i = 0; i < date; i++) {
			String s = dates.get(i).getText();
			if (s.equals("15")) {
				dates.get(i).click();
				break;
			}
		}
		//driver.close();
	}

}
