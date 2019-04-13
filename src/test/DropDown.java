package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software file\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement p = driver.findElement(By.xpath("//div[@class='_2CU_']/input"));
             p.clear();
             p.sendKeys("voda");
            // Thread.sleep(5000);
             p.sendKeys(Keys.ARROW_DOWN);
             p.sendKeys(Keys.ENTER);
           //  driver.close();
             WebDriverWait d=new WebDriverWait(driver, 7);
             d.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[3]//div[1]//div[1]//input[1]"))));
             WebElement q= driver.findElement(By.xpath("//li[3]//div[1]//div[1]//input[1]"));
             q.click();
             q.clear();
             q.sendKeys("Maha");
             q.sendKeys(Keys.ARROW_DOWN);
             q.sendKeys(Keys.ENTER);     
	}

}
