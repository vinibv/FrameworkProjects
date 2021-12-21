package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {

	public static WebDriver driver;
	
	public static void browserLaunch() {

		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		
		public static void loadUrl(String url) {

		driver.get(url);
		
		}
		
		public static void windowsmax() {

		
		driver.manage().window().maximize();
		}
		
		
		public static void currenturl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			

		}
	
		public static void fill(WebElement ele,String value) {
	   ele.sendKeys(value);

		}
	
       public static void clickbtn(WebElement ele) {
    	   ele.click();
       }
       
       
       public static void cleardata(WebElement ele) {
    	   ele.clear();
       }
       
       public static String  getData(int rowNumber ,int cellNumber) throws IOException {
		
    	   
      File f=new File("C:\\Users\\Sony\\eclipse-workspace\\ProjectFramework\\Excel\\EmployeeDetails.xlsx");
   		
   		FileInputStream fin=new FileInputStream(f);
   		
   		Workbook  w = new XSSFWorkbook(fin);
   		
   		Sheet s=w.getSheet("Sheet1");
   		  
   		Row row = s.getRow(rowNumber);
   				
   		Cell cell = row.getCell(cellNumber);	
   		
   		int cellType = cell.getCellType();
   		
   			String value="";
   			
   				
   			if (cellType==1) {
   				
   			value = cell.getStringCellValue();
   				
   		
   			}	
   			
   			else if (cellType==0) {
   				
   				if (DateUtil.isCellDateFormatted(cell)) {
   					
   					Date d = cell.getDateCellValue();
   					
   					SimpleDateFormat sdf=new SimpleDateFormat("dd,MMMM,yyyy");
   					
   				 value = sdf.format(d);
   					
   				}
   				
   				else {
   					
   					double d = cell.getNumericCellValue();
   					
   					long l= (long) d;
   					
   					 value = String.valueOf(l);
   					
   				
   				}
   			}
   				
   		return value;		
   				
   		
   
	
	}

	public static void closingChrome() {
		
		driver.close();
		
	}

}
