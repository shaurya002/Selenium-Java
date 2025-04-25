package PracticeScenarios;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BigBasketCase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		
		driver.findElement(By.id("headlessui-menu-button-:R5bab6:")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/cl/fruits-vegetables/?nc=nb'])[2]"))).click();
//		wd.findElement(By.id("//a[@href='/cl/fruits-vegetables/?nc=nb']")).click();
//		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@pattern='outline'])[1]"))).click();

	}

}
