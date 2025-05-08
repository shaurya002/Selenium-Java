import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicWritingData {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"//testData//Book3.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet 1");
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the totalRows: ");
		int totalRows = s.nextInt();
		
		System.out.print("Enter the totalCols: ");
		int totalCols = s.nextInt();
		
		
		for(int r=0; r<totalRows; r++) {
			
			XSSFRow row = sheet.createRow(r);
			
			for(int c=0; c<totalCols; c++) {
				System.out.println("Enter the value of Row"+r+" Cell"+c+": ");
				row.createCell(c).setCellValue(s.next());
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File Created and work done...!!");
	}

}

/*
Enter the totalRows: 3
Enter the totalCols: 4
Enter the value of Row0 Cell0: 
Shaurya
Enter the value of Row0 Cell1: 
Pratap
Enter the value of Row0 Cell2: 
Singh
Enter the value of Row0 Cell3: 
SIST Chennai
Enter the value of Row1 Cell0: 
Shailesh
Enter the value of Row1 Cell1: 
Kr.
Enter the value of Row1 Cell2: 
Singh 
Enter the value of Row1 Cell3: 
SIST Chennai
Enter the value of Row2 Cell0: 
Dilip
Enter the value of Row2 Cell1: 
Kr.
Enter the value of Row2 Cell2: 
Yadav
Enter the value of Row2 Cell3: 
SIST Chennai
File Created and work done...!!

  */
