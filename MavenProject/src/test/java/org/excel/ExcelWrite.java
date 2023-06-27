package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Acer\\eclipse-workspace\\MavenProject\\src\\test\\resources\\ExcelFile\\frame1.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("test");
		Row row = sheet.createRow(0);
		Cell cell = row.getCell(0);
		cell.setCellValue("framework");
		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);
		System.out.println("excel write completed");
	}

}
