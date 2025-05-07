package ScrnshotsEtc;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
/*		//1. full page screenshot
		TakesScreenshot ts  = (TakesScreenshot) driver;
		
		File scFile = ts.getScreenshotAs(OutputType.FILE);	//screenshot is being taken by TakesScreenshot Interface
		File targetFile = new File("/Users/shauryapratapsingh/eclipse-workspace/Training/screenshot/fullPage.png");
		scFile.renameTo(targetFile); //copies the source file to target file
*/
		
		//2. specific area of page
		WebElement ele = driver.findElement(By.xpath("//section[@id='slider']//div[@class='item active']//div[1]"));
		File scFile = ele.getScreenshotAs(OutputType.FILE);	//screenshot of element is being taken by web-element interface
		File targetFile = new File(System.getProperty("user.dir")+"/screenshot/targetSection.png");
		scFile.renameTo(targetFile);

		
		driver.quit();

	}

}
