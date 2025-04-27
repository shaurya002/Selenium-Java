package HandlingCheckBoxesAndAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//select specific check-box -> locate the element and click on it.
		//select all the check-boxes -> capture all check-box element and store it and along with traversal click them
		//similarly if u want to check certain check-boxes then u can do it through indexing of stored element and clicking on them

	}

}
