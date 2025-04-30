package AppointmentPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import LoginPage.LoginPage;

public class Appointment extends LoginPage{
	
	By pagecnfrm = By.xpath("//h2[contains(text(),'Make Appointment')]");
	By facility = By.xpath("//select[@name='facility']");
	By reAdd = By.xpath("//input[@id='chk_hospotal_readmission']");
	By healthCare = By.xpath("(//label[@class='radio-inline'])[3]");
	By visitDate = By.xpath("//input[@placeholder='dd/mm/yyyy']");
	By commentPath = By.xpath("//textarea[@id='txt_comment']");
	By btn = By.xpath("//button[@id='btn-book-appointment']");
	
	public void appointmentCnfrmation() {
		System.out.println("On appointment page..");
	}
	
	public void choosingFacility() {
		WebElement facilty = driver.findElement(facility);
		Select slct = new Select(facilty);
		slct.selectByIndex(2);
	}
	
	public void choosingReaddmission() {
		driver.findElement(reAdd).click();
	}
	
	public void choosingHealthCareProgram() {
		driver.findElement(healthCare).click();
	}
	
	public void choosingVisitDate() {
		WebElement date = driver.findElement(visitDate);
		date.sendKeys("30/04/2025");
	}
	
	public void writingComment() {
		WebElement cmt = driver.findElement(commentPath);
		cmt.sendKeys("Its an Appointment");
	}
	
	public void bookingAppointment() {
		driver.findElement(btn).click();
	}
	
	public void navigationtoCnfrm() {
		System.out.println("Navigating to confirmation page...");
	}

}
