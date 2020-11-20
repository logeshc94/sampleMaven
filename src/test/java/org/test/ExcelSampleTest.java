package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSampleTest {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\GreensTech\\Maven\\sampleMaven\\excelLoc\\DataDriven.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sh = wb.getSheet("Sheet1");
//		Row row = sh.getRow(2);
//		Cell cell = row.getCell(0);
//		String scv = cell.getStringCellValue();
//		System.out.println(scv);

		// to print all values in cell
//		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
//			Row row = sh.getRow(i);
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//				Cell cell = row.getCell(j);
//				String scv = cell.getStringCellValue();
//				System.out.println(scv);
//			}
//		}

		// to print numbers
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int ct = cell.getCellType();
				// 0 and 1 ---> 0--> number and 1--> value
//				System.out.println(ct); 

//				if (ct == 1) {
//					String scv = cell.getStringCellValue();
//					System.out.println(scv);
//				} else if (ct == 0) {
//					double ncv = cell.getNumericCellValue();
//					long l = (long) ncv;
//					System.out.println(l);
//				}

				// to print data in format
				if (ct == 1) {
					String scv = cell.getStringCellValue();
					System.out.println(scv);
				}
//				} else if (DateUtil.isCellDateFormatted(cell)) {
//					java.util.Date dcv = cell.getDateCellValue();
//					SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
//					String fr = sf.format(dcv);
//					System.out.println(fr);
//				} 
				else {
					double ncv = cell.getNumericCellValue();
					long l = (long) ncv;
//					System.out.println(l);
					// to change long to string format
					String sv = String.valueOf(l);
					System.out.println(sv);
				}
			}
		}

	}

}
