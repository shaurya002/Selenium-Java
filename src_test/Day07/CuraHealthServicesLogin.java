package DDT;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utilities.ExcelUtils;

public class CuraHealthServicesLogin {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		String passedUrl = "https://katalon-demo-cura.herokuapp.com/#appointment";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
		String filePath = System.getProperty("user.dir") + "\\testData\\CuraHealthServicesData.xlsx";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		for(int i=1; i<rows; i++) {
			//reading data from excel
			String userName = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String password = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);

			//passing the data to the page
			driver.findElement(By.xpath("//input[@placeholder='Username' and @id='txt-username']")).sendKeys(userName);
			driver.findElement(By.xpath("//input[@placeholder='Password' and @id='txt-password']")).sendKeys(password);
			driver.findElement(By.xpath("//button[@id='btn-login']")).click();
			//validation
			String expUrl = driver.getCurrentUrl();
			if(expUrl.equals(passedUrl)) {
				System.out.println("Test Passed!!");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 3, "Passed");
				driver.navigate().to("https://katalon-demo-cura.herokuapp.com/profile.php#login");
				driver.findElement(By.xpath("//a[@href=\"https://katalon-demo-cura.herokuapp.com/authenticate.php?logout\"]")).click();
				driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
			}else {
				System.out.println("Test Failed!!");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 3, "Failed");
			}	
		}
		driver.quit();
	}

}
