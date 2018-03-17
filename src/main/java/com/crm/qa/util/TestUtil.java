package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long  IMPLICIT_WAIT = 60;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
//	public static String TESTDATA_SHEET_PATH = "C:\\selenium_projects\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\FreeCRMTestData.xlsx";
//	
//	static Workbook book;
//	static Sheet sheet; 
//	
//	
//	
//	public static Object[][] getTestData(String sheetName){
//		FileInputStream file = null;
//		try {
//			file = new FileInputStream(TESTDATA_SHEET_PATH);
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			book = WorkbookFactory.create(file);
//		}catch(InvalidFormatException e) {
//			e.printStackTrace();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		
//		bb
//		sheet = book.getSheet(sheetName);
//		Object[][] data = new Object[sheet.]
//		
//		
//		
//	}
}
