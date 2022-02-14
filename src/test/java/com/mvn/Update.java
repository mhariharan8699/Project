package com.mvn;



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Update {
	public static void main(String[] args) throws IOException {
		      
	         WebDriverManager.chromedriver().setup();
		     WebDriver driver=new ChromeDriver();
		     
		     File file=new File("C:\\Users\\user\\eclipse-workspace\\ProjectMaven\\excel\\Database.xlsx");
		     Workbook workbook=new XSSFWorkbook();
		     Sheet Sheet = workbook.createSheet();
		     
		     
	         driver.get("http://demo.automationtesting.in/Register.html");
	         WebElement element = driver.findElement(By.id("Skills"));
	    
	         
	         Select select=new Select(element);
	         List<WebElement> list = select.getOptions();
	         
	         for (int i = 0; i < list.size(); i++) {
	        	 WebElement e= list.get(i);
	        	 String text = e.getText();
	        	 
	        	 Row row = Sheet.createRow(i);
	        	 Cell cell = row.createCell(0);
	        	 cell.setCellValue(text);
	        	 FileOutputStream o=new FileOutputStream(file);
	        	 workbook.write(o);
	        	 
	        	 
	   }
	        }
}
