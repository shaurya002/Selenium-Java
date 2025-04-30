package StepDefinitions;

import static org.testng.Assert.assertEquals;

import ConfirmationPage.Confirmation;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class ConfirmationPageSteps {
	
	Confirmation c1;
	
	@Before
    public void setUp() {
//    	driver = DriverInitializer.gettingDriver();
        c1 = new Confirmation();
    }
	
	
	@Given("Browser launching")
	public void browserLaunching() {
		c1.launchingBrowser("https://katalon-demo-cura.herokuapp.com/");
	}
	
	@And("user is on Homepage")
	public void HomePageCnfrm() {
		String exp = c1.HomePageCnfrm();
		assertEquals(exp, "CURA Healthcare Service");
	}
	
	@When("I click on make appointment")
	public void MakingAppointment() {
		c1.clickingAppointment();
	}
	
	@Then("user is navigated to login page")
	public void navigatingToLogin() {
		c1.navigatingLogin();
	}
	
	
	@Given("user is at Login page")
	public void loginpageCnfrm() {
		String actual = "Please login to make appointment.";
		String exp = c1.loginCnfrm();
		assertEquals(exp, actual);
	}
	
	@When("user enters username")
	public void username() {
		c1.username();
	}
	@When("user enters password")
	public void password() {
		c1.password();
	}
	@When("user clicks login")
	public void login() {
		c1.logging();
	}
	
	@Then("user is navigated to appointment site")
	public void navigationToAppointment() {
		c1.navigatingToAppointment();
	}
	
	@Given("user is at Appointment Page")
	public void appointmentPageConfirmation() {
		c1.appointmentCnfrmation();
	}
	
	@When("user selects facility")
	public void selectingFacility() {
		c1.choosingFacility();
	}
	@When("user chooses for readmission")
	public void choosingReadmision() {
		c1.choosingReaddmission();
	}
	@When("user chooses healthcare program")
	public void choosingHealthcareProgram() {
		c1.choosingHealthCareProgram();
	}
	@When("user enters the date")
	public void enteringDate() {
		c1.choosingVisitDate();
	}
	@When("user enters the comment")
	public void enteringComment() {
		c1.writingComment();
	}
	@When("user clicks on booking")
	public void booking() {
		c1.bookingAppointment();
	}
	@Then("user is navigated to Confirmation Page")
	public void navigationToConfirmationPage() {
		c1.navigationtoCnfrm();
	}
	
	@Given("user is at confirmation page")
	public void cnfrmPage() {
		String exp = c1.cnfrmPage();
		String actual = "Appointment Confirmation";
		assertEquals(exp, actual);
	}

}
