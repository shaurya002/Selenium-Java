package Day04;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		
		//xpath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Avinash");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		WebElement data = driver.findElement(By.xpath("//p[@style='color: red;']"));
		String res = data.getText();
		String exp = "Email Address already exist!";
		System.out.println(res.equals(exp));
		
		// if multiple attributes are available then use indexing [index(indexing here starts with 1 not 0)] in xpath.
		// driver.findElement(By.xpath("//input[@placeholder='Name'] [@value='']")).sendKeys("Avinash");
		
		//xpath with text()
		driver.get("https://automationexercise.com/login");
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		//it will find the text with innerText as Products and since we know that its an link text we can click on it.
		
		//xpath with contains=> //tagName[contains(@attribute, 'value')]
		driver.findElement(By.xpath("//input[contains(@id,'search_product')]")).sendKeys("Tshirt");
		driver.findElement(By.xpath("//button[@id='submit_search']")).click();
		
	}

}
