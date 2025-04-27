package HomePage;
import Utility.CommonMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	protected CommonMethods m1 = new CommonMethods();
	protected WebDriver driver;
	
	String path = "./ConfigFiles/data.properties";
	By path1 = By.xpath("//a[@id='btn-make-appointment']");
	
	public void init_HomePage(WebDriver driver) {
		this.driver = driver;
		m1.init_Pages(driver);
	}
	
	public void LaunchingBrowserSite() throws IOException {
		m1.launchBrowser(path1, path);
		m1.implicitWaiting(5);
	}
	
	

}
