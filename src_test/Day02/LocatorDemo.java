package Day02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		boolean val = driver.findElement(By.id("gws-output-pages-elements-homepage_additional_languages__als")).isDisplayed();
		System.out.println(val);
		
		
//		driver.findElement(By.linkText("Gmail")).click();	//will lead to the targeted linked text.
		
		List<WebElement> headerLinks = driver.findElements(By.className("gb_X"));  //to locate a group of web elements.		
		System.out.println(headerLinks.size());
		
//		tag name as locator
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
//		finding all images in that webpage
		List<WebElement> imgEle = driver.findElements(By.tagName("img"));
		System.out.println(imgEle.size());
		
	}

}
