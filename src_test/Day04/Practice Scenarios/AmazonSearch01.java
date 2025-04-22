package PracticeScenarios;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("DSA with C++");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		List<String> list1= new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			list1.add(list.get(i).getText());
		}
		
		boolean cont = list1.contains("dsa made easy in c++");
		System.out.println(cont);

	}

}
