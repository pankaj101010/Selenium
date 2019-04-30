package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IntenetExplorerTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "E:\\Software file\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
	}

}
