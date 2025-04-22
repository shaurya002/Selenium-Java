package PracticeScenarios;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://automationexercise.com/");
		
		List<WebElement> list = driver.findElements(By.xpath("//a[@href='/view_cart']"));
		WebElement firstLink = list.get(0);
		firstLink.click();
	}

}
