import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Automation Testing");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		for(WebElement ele: list) {
			System.out.println(ele.getText());
		}
		driver.quit();
	}

}
