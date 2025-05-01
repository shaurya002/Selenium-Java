import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendersAndDatePickers {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		
		//switching the frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
			
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //open the date-picker
		String yr= "2024";
		String mnth = "August";
		String day = "05";
		
		//selecting month-years
		HashMap<String, Integer> map = new HashMap<>();
		map.put("January", 1);map.put("February", 2);map.put("March", 3);map.put("April", 4);
		map.put("May", 5);map.put("June", 6);map.put("July", 7);map.put("August", 8);
		map.put("September", 9);map.put("October", 10);map.put("November", 11);map.put("December", 12);
		while(true) {
			String currMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();			
			int yearInput = Integer.parseInt(yr);
			int yearCurrent = Integer.parseInt(currYear);
			if(yearInput==yearCurrent){
				if(currMonth.equals(mnth)) {
					break;
				}
				if(map.get(mnth)<map.get(currMonth)) {
					driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
				}else {
					driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
				}
			}
			else if(yearInput<yearCurrent) {
				driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
			}
			else {
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			}
			
		}
		
		//selecting date
		int date = Integer.parseInt(day);
		driver.findElement(By.xpath("//a[@class='ui-state-default' and contains(text(), "+date+")]")).click();
		
	}

}
