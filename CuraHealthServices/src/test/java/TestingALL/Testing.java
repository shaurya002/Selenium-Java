package TestingALL;

import org.testng.annotations.Test;

import AppointmentPage.Appointment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Testing {
	
	Appointment p1 = new Appointment();
	WebDriver driver;
	
  @Test (priority=1)
  public void f() throws IOException {
	  p1.LaunchingBrowserSite();
  }
  
  @Test (priority=2)
  public void loginTest() throws IOException {
	  p1.login();
  }
  
  @Test (priority=3)
  public void BookingAppointment() throws IOException {
	  p1.choosingFacility();
	  p1.choosingReaddmission();
	  p1.choosingHealthCareProgram();
	  p1.choosingVisitDate();
	  p1.writingComment();
	  p1.bookingAppointment();
  
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  p1.init_HomePage(driver);
  }

}
