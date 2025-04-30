package LoginPage;

import org.openqa.selenium.By;

import HomePage.HomePage;

public class LoginPage extends HomePage{
	By path1 = By.xpath("//p[@class='lead']");
	By usr = By.xpath("//input[@placeholder='Username' and @id='txt-username']");
	By pass = By.xpath("//input[@placeholder='Password' and @id='txt-password']");
	By btn = By.xpath("//button[@id='btn-login']");
	
	public String loginCnfrm() {
		String txt = driver.findElement(path1).getText();
		return txt;
	}
	
	public void username() {
		driver.findElement(usr).sendKeys("John Doe");
	}
	
	public void password() {
		driver.findElement(pass).sendKeys("ThisIsNotAPassword");
		
	}
	public void logging() {
		driver.findElement(btn).click();
		
	}
	
	public void navigatingToAppointment() {
		System.out.println("Navigating to Appointment Page...");
	}
}
