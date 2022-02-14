package com.mvn;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenRevision {

	File file=new File("C:\\Users\\user\\eclipse-workspace\\ProjectMaven\\excel\\Database.xlsx");
	FileInputStream stream =new FileInputStream(file);
	Workbook wrkbook=new XSSFWorkbook(stream);
	Sheet sheet=wrkbook.getSheet("Adactin");
	
}
