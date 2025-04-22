package Day04;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
/*		GET METHODS using Driver instances
		System.out.println(driver.getTitle());
		System.out.println();		
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		System.out.println(driver.getPageSource());
		System.out.println();
		System.out.println(driver.getWindowHandle());	// RETURNS STRING THAT DEPENDS ON RUNTIME SO IT MAY CHANGE DYNAMICALLY		

		driver.findElement(By.xpath("//a[@aria-label='Search for Images ']")).click();
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds); //reference of set's memory
		System.out.println(windowIds.size());
*/
		
/*		
		WebElement Methods: first get the webelement using driver instances and findelement/findelements then use this methods using dot operator
			returns boolean values
			1. isDisplayed() - checks element is dislayed or not
			2. isEnabled() - checks element is Enabled or not (mostly used for input boxes, check boxes, btns and dropdown options)
			3. isSelected() - checks element is Selected or not (mostly used in cases of radio btns and checkboxes)
*/
		
/*		
		Browser Methods:
			1. close() - close single browser windows
			2. quit() - closes multiple browser windows at the same time
*/						
	}

}
