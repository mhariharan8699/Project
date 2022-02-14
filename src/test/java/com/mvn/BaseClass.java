package com.mvn;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void loadUrl(String url) {

		driver.get(url);

	}

	public void type(WebElement element, String data) {

		element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();

	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getUrl(String string) {
		String url = driver.getCurrentUrl();

		return url;
	}

	public String getText(WebElement element) {
		String text = element.getText();

		return text;
	}

	public WebElement findElementById(String attributevalue) {
		WebElement findElement = driver.findElement(By.id(attributevalue));
		return findElement;

	}

	public WebElement findElementName(String attributevalue) {
		WebElement findName = driver.findElement(By.id(attributevalue));
		return findName;
	}

	public void findElementClassName(String attributevalue) {
		WebElement findId = driver.findElement(By.id(attributevalue));

	}

	public WebElement findElementxpath(String xpath) {
		WebElement findxpath = driver.findElement(By.xpath(xpath));
		return findxpath;
	}

	public String getAttribute(WebElement element) {

		String string = element.getAttribute("value");
		return string;

	}

	public String getAttribute(WebElement element, String attributevalue) {
		String attribute = element.getAttribute(attributevalue);

		return attribute;
	}

	public void selectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void typejs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value'" + data + ")", element);
	}

	public void maximise() {
		driver.manage().window().maximize();

	}

	public void quit() {
		driver.quit();

	}

	public void close() {
		driver.close();

	}

	public void navigate() {
		driver.navigate();

	}

	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick().perform();

	}

	public void navigateForward() {
		driver.navigate().forward();

	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateRefresh() {
		driver.navigate().refresh();
	}

	public void alertSendKeys() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("data");
		alert.accept();

	}

	public void alertSendKeys1() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("data");
		alert.dismiss();
	}

	public String alertGetText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();

		return text;
	}

	public void ScreenShot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		ts.getScreenshotAs(OutputType.FILE);
	}

	public void robotClass() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
	}

	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();

	}

	public void getOptions(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();

	}

	public void getAllSelect(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);

	}

	public void deSelect(WebElement element) {
		Select s = new Select(element);
		s.deselectByVisibleText("text");
	}

	public void deSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}

	public void frameByIndex(int index) {
		driver.switchTo().frame(index);

	}

	public void frameByName(String data) {
		driver.switchTo().frame(data);

	}

	public void frameById(String id) {
		driver.switchTo().frame(id);

	}

	public void frameByWebElement(WebElement element) {
		driver.switchTo().frame(element);

	}

	public void updateData(String sheetname, int rownum, int cellnum, String s) throws IOException {

		String data = null;

		File file = new File("C:\\Users\\user\\eclipse-workspace\\ProjectMaven\\excel\\Database.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.createSheet(sheetname);
		Row row = sheet.createRow(rownum);
		Cell cell = row.createCell(cellnum);

		String cellValue = cell.getStringCellValue();

		if (cellValue.equals("Analytic")) {

			cell.setCellValue("java");
		}

		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

	public String getData(String sheetname, int rownum, int cellnum) throws IOException {
		String data = null;

		File file = new File("C:\\Users\\user\\eclipse-workspace\\ProjectMaven\\excel\\Adactin.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType celltype = cell.getCellType();

		switch (celltype) {
		case STRING:
			data = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {

				Date datecellvalue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-mmm-yy");
				dateformat.format(datecellvalue);
			} else {
				double d = cell.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(d);
				data = b.toString();

			}
			break;
		default:
			break;

		}
		return data;
	}
}
