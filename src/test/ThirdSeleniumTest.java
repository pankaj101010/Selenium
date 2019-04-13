package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdSeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Software file\\\\chromedriver_win32\\\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         driver.get("https://www.facebook.com/");
         driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/form/table/tbody/tr[2]/td/input")).sendKeys("pankjadevgade");
        // driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("nayan");
//         driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mohod");
//         driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kjadgjga@gmail.com");
//         driver.findElement(By.cssSelector("#u_0_v")).sendKeys("fkjsdf");
//        Select day =  new Select(driver.findElement(By.xpath("//select[@id='day']")));
//         day.selectByIndex(8);
//         Select month =  new Select(driver.findElement(By.xpath("//select[@id='month']")));
//         month.selectByIndex(8);
//         Select year =  new Select(driver.findElement(By.xpath("//select[@id='year']")));
//         year.selectByIndex(8);
//         
//         WebElement radio= driver.findElement(By.xpath("//input[@value='1']"));
//                 radio.click();
//                 driver.findElement(By.name("websubmit")).click();
//         //driver.close();
	}

}
