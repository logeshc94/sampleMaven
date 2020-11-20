package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelSheet {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\GreensTech\\Maven\\sampleMaven\\excelLoc\\DataDriven.xlsx");
		FileInputStream str = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(str);
		Sheet sh = wb.createSheet("DDf");
		Row cr = sh.createRow(0);
		Cell cc = cr.createCell(0);
		cc.setCellValue("Location");
		FileOutputStream fout = new FileOutputStream(f);
		wb.write(fout);
	}

}
