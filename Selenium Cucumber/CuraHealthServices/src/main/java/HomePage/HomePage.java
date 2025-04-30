package HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverManager.DriverInitializer;

public class HomePage {
	
	By path1 = By.xpath("//h1[contains(text(),'CURA Healthcare Service')]");
	By path2 = By.xpath("//a[@id='btn-make-appointment']");
	
	protected WebDriver driver = DriverInitializer.gettingDriver();
	
	public void launchingBrowser(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public String HomePageCnfrm() {
		String txt = driver.findElement(path1).getText();
		return txt;
	}
	
	public void clickingAppointment() {
		driver.findElement(path2).click();
	}
	
	public void navigatingLogin() {
		System.out.println("Navigating to Login..");
	}
}
