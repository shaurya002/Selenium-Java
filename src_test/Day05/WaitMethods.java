package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {
	
	public static void main() {
		WebDriver driver = new ChromeDriver();
		driver.get(""); //url to reach the site u want
		//implicit wait:- written once, will work for whole of script
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//explicit wait:- will have to call again and again targeting specific xpaths with required conditions we want
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(null)); //enter the webelement here
		ele.sendKeys(""); //perform actions here
		
		
	}

}
