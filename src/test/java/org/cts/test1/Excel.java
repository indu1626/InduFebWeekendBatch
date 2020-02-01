package org.cts.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Gokularaja\\eclipse-workspace\\Testng\\Excel\\Sheet1.xlsx");
		FileInputStream str = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(str);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		System.out.println(c);		
	}

}
