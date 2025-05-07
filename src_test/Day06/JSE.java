package JSExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		WebElement ele2 = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		WebElement click = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		
		//passing the text to input-box
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','Aditya')", ele1);
		js.executeScript("arguments[0].setAttribute('value','aadi121@abc.com')", ele2);
		
		//clicking on element
		js.executeScript("arguments[0].click()", click);
		
//scrolling the page using javascriptExecutor
		
		driver.manage().window().maximize();
		
		//1. scrolling down by pixel number
		js.executeScript("window.scrollBy(0, 1000)", ""); //down by 1000 pixels
		System.out.println(js.executeScript("return window.pageYOffset;")); //checking pixels are correct or not
		
		//2. scrolling down till visibility of an element
		WebElement ele = driver.findElement(By.xpath("//input[@data-qa='state']")); //locate the element
		js.executeScript("arguments[0].scrollIntoView();", ele);	//make it view
		System.out.println(js.executeScript("return window.pageYOffset"));  //will print the pixel where element is located
		js.executeScript("arguments[0].setAttribute('value','Uttar Pradesh')", ele); //enter or pass the value
		
		//3. scrolling till the end of the page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

		//4. scrolling back to start of page
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
//		driver.quit();
	}

}
