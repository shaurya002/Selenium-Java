package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverInitializer {
	
	static WebDriver driver;
	
	public static WebDriver gettingDriver() {
		if(driver==null) {
			driver = new EdgeDriver();	
		}
		return driver;
	}

}
