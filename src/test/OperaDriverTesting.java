package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaDriverTesting {

	public static void main(String[] args) {
		System.getProperty("webdriver.opera.driver", "E:\\Software file\\All jar\\operadriver_win64\\operadriver_win64\\operadriver.exe");
        OperaDriver driver = new OperaDriver();
	}

}
