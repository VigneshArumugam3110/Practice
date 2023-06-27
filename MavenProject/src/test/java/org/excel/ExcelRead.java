package org.excel;

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

public class ExcelRead {
	public static void main(String[] args) throws IOException {
File file = new File("C:\\Users\\Acer\\eclipse-workspace\\MavenProject\\src\\test\\resources\\Excelfile\\frame.xlsx");
    FileInputStream input = new FileInputStream (file);
    Workbook workbook = new XSSFWorkbook(input);
    Sheet sheet = workbook.getSheet("TestData");
    Row  row= sheet.getRow(0);
    Cell cell = row.getCell(0);
     // to take the cell value from single row
	for(int i = 0;i<row.getPhysicalNumberOfCells();i++) {
		Cell cell2 = row.getCell(i);
		System.out.println(cell2);
	}
	// to get all the values
	//for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
	//	Row rowall = sheet.getRow(i);
	//	for (int j = 0; j < rowall.getPhysicalNumberOfCells(); j++) {
	//		Cell cellall = rowall.getCell(j);
	//		System.out.println(cellall);
	//	}
	//		}
	//Using get cell type&get string 
	for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
	Row rowall2 = sheet.getRow(i);
	for (int j = 0; j < rowall2.getPhysicalNumberOfCells(); j++){
		Cell cellall2 = rowall2.getCell(j);
		int cellType = cellall2.getCellType();
		System.out.println(cellType);
		if(cellType==1) {
			String stringCellValue = cellall2.getStringCellValue();
			System.out.println(stringCellValue);
		}
		if(cellType==0) {
			if(DateUtil.isCellDateFormatted(cellall2))
			{
				Date dateCellValue = cellall2.getDateCellValue();
			SimpleDateFormat Dateformat =new SimpleDateFormat("DD-MMM-YYYY");
	String format = Dateformat.format(dateCellValue);
				System.out.println(Dateformat);
			}
			else {
			double db = cellall2.getNumericCellValue();
			long l =(long) db;
			String valueOf = String.valueOf(l);
			System.out.println(valueOf);
		}
		
	}
	
}
}

	}
}

