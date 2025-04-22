package PracticeScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindingPINcode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement data = driver.findElement(By.id("glow-ingress-line1"));
		String dataText = data.getText();  //getting the text of webelement;
		String [] address = dataText.split(" ");
		String pin = address[address.length-1];
		System.out.println(pin.equals("400017"));
	}

}
