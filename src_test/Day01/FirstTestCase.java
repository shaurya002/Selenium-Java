package Day01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1. Launch Browser
 2. Open a URL (https://www.google.com)
 3. validate the title -> Google
 4. close the browser.
 */

public class FirstTestCase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actTitle = driver.getTitle();
		if(actTitle.equals("Google")) {
			System.out.println("Test Passes");
		}else {
			System.out.println("Test Failed");
		}
		driver.close();
		
	}

}
