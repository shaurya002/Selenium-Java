import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {
	
	public static void main(String[]args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\Book2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();  //creating a new workbook
		XSSFSheet sheet = workbook.createSheet("Sheet 4");  //creating a new sheet
    
		XSSFRow row1 = sheet.createRow(0);  //creating first row indexed as 0 and then creating cells and putting some values statically...
		row1.createCell(0).setCellValue("Row1 Cell1");
		row1.createCell(1).setCellValue("Row1 Cell2");
		row1.createCell(2).setCellValue("Row1 Cell3");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Row2 Cell1");
		row2.createCell(1).setCellValue("Row2 Cell2");
		row2.createCell(2).setCellValue("Row2 Cell3");
		
		XSSFRow row3 = sheet.createRow(1);
		row3.createCell(0).setCellValue("Row3 Cell1");
		row3.createCell(1).setCellValue("Row3 Cell2");
		row3.createCell(2).setCellValue("Row3 Cell3");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		
	}

}
