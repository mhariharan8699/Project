package com.mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\user\\eclipse-workspace\\MavenSample\\excel\\eclipse path.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook wrkbook=new XSSFWorkbook(stream);
		
		Sheet sheet = wrkbook.getSheet("Data");
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				CellType type = cell.getCellType();
				String str = type.toString();
				
				if (str.equals("STRING")) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				if (str.equals("NUMERIC")) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date cellvalue = cell.getDateCellValue();
						SimpleDateFormat date=new SimpleDateFormat("dd-mmm-yy");
						String strdate = date.format(cellvalue);
						System.out.println(strdate);
						}
					else {
					double d = cell.getNumericCellValue();
					BigDecimal b=new BigDecimal(d);
					String s = b.toString();
					System.out.println(s);
					}
					
				}
			}
			
		}
	
	}

	}

