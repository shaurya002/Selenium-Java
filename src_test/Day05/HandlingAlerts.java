package HandlingCheckBoxesAndAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
	//Handling alerts and Pop-ups: with one cnfrm button, with two cnfrm btn, with data filling and two btns
	//you can inspect these popups and alerts since they aren't web-elements.
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		//Normal Alert with Okay Button
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(5000);
		// driver.switchTo().alert().accept();	//will allows us to accept
		//if we want to perform any operation onto it then we will have to store the value of this into an alert object and then perform operations
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		
		//confirmation alert
		//similar to previous method but we have to use accept() to accept and close it
		//but to reject and close it we will have to call dismiss() method
		
		
		//prompt alert: we can write values inside input box
		
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert alrt = driver.switchTo().alert();
		alrt.sendKeys("Hiiiiiii.......");
		Thread.sleep(5000);
		alrt.accept();
		
	}

}
