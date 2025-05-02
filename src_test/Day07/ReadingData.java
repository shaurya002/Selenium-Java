//apache poi

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//excel file -> workbook -> sheets -> rows -> cells
//FileInputStream - Reading Purpose
//FileOutputStream - Writing Purpose

public class ReadingData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("/Users/shauryapratapsingh/eclipse-workspace/Training/testData/PracticeBook1.xlsx");
		try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int totalRows = sheet.getLastRowNum();
			int totalCells = sheet.getRow(1).getLastCellNum();
			
			System.out.println("Total Number of Rows: "+ totalRows); //counting from 0
			System.out.println("Total Number of cells in each Row: "+totalCells);// counting from 1
			
			for(int r = 0; r<=totalRows; r++) {
				
				XSSFRow currRow = sheet.getRow(r);
				
				for(int c=0; c<totalCells; c++) {
					XSSFCell cell = currRow.getCell(c);
					System.out.print(cell.toString() +" \t ");
				}
				System.out.println();
			}
			workbook.close();
			file.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
