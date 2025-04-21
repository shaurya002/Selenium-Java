package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CSS_Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//tags are optional...
		
		//tag#id
//		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("T-Shirts");
		
		//tag.className
//		driver.findElement(By.cssSelector("input.nav-input")).sendKeys("T-Shirts for Men");
		
		//tag[attribute="values"]
//		driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("T-Shirts for Kids");
		
		//tag.className[attribute="values"]
		driver.findElement(By.cssSelector("input.nav-input[placeholder='Search Amazon.in']")).sendKeys("Gym Equipments");
		
	}

}
