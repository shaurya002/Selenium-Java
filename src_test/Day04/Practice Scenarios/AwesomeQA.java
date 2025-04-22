package PracticeScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AwesomeQA {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
		
		WebElement ele = driver.findElement(By.xpath("//input[@name='newsletter'] [@value='1']"));
		ele.click();
		boolean isEnable = ele.isEnabled();
		System.out.println(isEnable);
	}

}
