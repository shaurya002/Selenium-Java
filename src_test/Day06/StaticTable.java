import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Always choose xpath because there can be multiple table in same page
		
		//Task 1: Finding the number of rows available in first table		
		By rows = By.xpath("//table[@class='ws-table-all']/tbody/tr");
		List<WebElement> listRows = driver.findElements(rows);
		System.out.println("Number of Rows: " +listRows.size());
		
		//Task 2: Finding the number of the columns available in first table
		By cols = By.xpath("//table[@class='ws-table-all']/tbody//th");
		List<WebElement> listCols = driver.findElements(cols);
		System.out.println("Number of Cols: " +listCols.size());
		
		//Task 3: Extracting the data from second row first col
		By dataPath1 = By.xpath("//table[@class='ws-table-all']/tbody/tr[2]/td[1]");
		String dataVal1 = driver.findElement(dataPath1).getText();
		System.out.println("Value of 2nd Row and 1st col cell: " +dataVal1);
		
		//Task 4: Extracting the data from last row second col
		By dataPath2 = By.xpath("//table[@class='ws-table-all']/tbody/tr[7]/td[2]");
		String dataVal2 = driver.findElement(dataPath2).getText();
		System.out.println("Value of 7nd Row and 2st col cell: " +dataVal2);
		
		//if the number of rows is being continuously changed then u have to store the number of
		//rows in a variable and use it to get the value in case of dynamic [ its a guess only:) ]
		driver.quit();
	}

}
