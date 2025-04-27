package Utility;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
	WebDriver driver;
	
	public void init_Pages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void launchBrowser(By xpath, String urlPath) throws IOException {
		FileReader f = new FileReader(urlPath);
		Properties p = new Properties();
		p.load(f);
		driver.get(p.getProperty("BaseURL"));
		driver.findElement(xpath).click();
	}
	
	public void implicitWaiting(int t) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
	}
	

}
