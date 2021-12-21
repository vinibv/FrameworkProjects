package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Sony\\eclipse-workspace\\ProjectFramework\\Excel\\EmployeeDetails.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook  w = new XSSFWorkbook(fin);
		
		Sheet s=w.getSheet("Sheet1");
		  
		Row row = s.getRow(2);
				
		Cell cell = row.getCell(3);		
				
		cell.setCellValue("Germany");
				
		
		// Update the sheet
		
			FileOutputStream fo=new FileOutputStream(f);
			
			w.write(fo);
			
			System.out.println("Done");
				
				
				
				
				
				
				
				
				
			
		
	
		
		
		
	}
}
