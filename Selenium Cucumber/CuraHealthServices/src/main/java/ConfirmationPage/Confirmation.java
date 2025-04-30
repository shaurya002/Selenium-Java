package ConfirmationPage;

import org.openqa.selenium.By;

import AppointmentPage.Appointment;

public class Confirmation extends Appointment{
	By pathcnfrm = By.xpath("//h2[contains(text(), 'Appointment Confirmation')]");

	public String cnfrmPage() {
		String txt = driver.findElement(pathcnfrm).getText();
		return txt;
	}
}
