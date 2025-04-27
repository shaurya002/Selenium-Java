package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAndNavigateMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//accepts url in string format
		driver.get("url"); // either this will navigate to required site
		//accepts url in string format as well as URL object
		driver.navigate().to("url"); //or this will navigate to required site
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		//getWindowHandle && getWindowHandles
		//Practice link:- https://testautomationpractice.blogspot.com/
		

	}

}
