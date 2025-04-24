package PracticeScenarios;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationUsingWait {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Mumbai");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        WebElement city = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul//li[contains(., 'Mumbai')]"))
	        );
	        
	        city.click();
	        WebElement movie = driver.findElement(By.xpath("//a[@class='bwc__sc-1shzs91-0 jLahQd']"));
	        movie.click();
	        
	        List<WebElement> list = driver.findElements(By.xpath("//div[@class='sc-dv5ht7-0 hexaHF']"));
	        List<String> str = new ArrayList<>();
	        for(WebElement ele: list) {
	        	str.add(ele.getText());
	        }
	        System.out.println(str.toString());
	}

}
