package SelectClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Methods {
	
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.id("searchDropdownBox"));
		Select sel = new Select(ele);
//		sel.selectByVisibleText("Amazon Devices");
		
		
		List<WebElement> list = sel.getOptions();
		List<String> itemList = new ArrayList<>();
		for(WebElement item: list) {
			itemList.add(item.getText());
		}		
		System.out.println(itemList.size());
		boolean isContaining = itemList.contains(itemList);
		System.out.println(isContaining);
	}
}
