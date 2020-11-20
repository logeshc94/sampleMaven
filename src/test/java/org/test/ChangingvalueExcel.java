package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ChangingvalueExcel {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\GreensTech\\Maven\\sampleMaven\\excelLoc\\DataDriven.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(1);
//		cell.setCellValue("Hotel");
		String scv = cell.getStringCellValue();
//		System.out.println(scv);
		if (scv.equals("Number")) {
			cell.setCellValue("Mobile");
			System.out.println(cell);
		}
		FileOutputStream w = new FileOutputStream(f);
		wb.write(w);
		System.out.println("done");
	}

}
