package LogInPage;
import org.openqa.selenium.By;

import HomePage.Homepage;
import Utility.CommonMethods;


public class Login extends Homepage {
	By usrPath = By.xpath("//input[@placeholder='Username' and @id='txt-username']");
	By passPath = By.xpath("//input[@placeholder='Password' and @id='txt-password']");
	By logPath = By.xpath("//button[@id='btn-login']");
	
	public void login() {
		m1.implicitWaiting(5);
		driver.findElement(usrPath).sendKeys("John Doe");
		driver.findElement(passPath).sendKeys("ThisIsNotAPassword");
		driver.findElement(logPath).click();
		
	}
	
}
