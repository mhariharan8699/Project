package com.mvn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Sample {
	public static void main(String[] args) throws InterruptedException {
		
	BaseClass baseclass=new BaseClass();
		
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\SeleniumAmazon\\Driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		baseclass.getDriver();
		//driver.get("https://adactinhotelapp.com/");
		baseclass.loadUrl("https://adactinhotelapp.com/");
		
	
		
		//WebElement txtlogin = driver.findElement(By.id("username"));
		WebElement id = baseclass.findElementById("username");
		
		 //txtlogin.sendKeys("Santhosh0806");
		
		String data = baseclass.getData("Test", 0, 1);
		baseclass.type(id,data);
		
    	//	WebElement txtpass= driver.findElement(By.id("password"));
		baseclass.findElementById("password");
		//txtpass.sendKeys("HSAZT2");
		baseclass.getData("Test", 0, 2);
		
		//WebElement txtlog= driver.findElement(By.id("login"));
		WebElement btnlogin = baseclass.findElementById("login");
		//txtlog.click();
		baseclass.click(btnlogin);
		
		//WebElement location = driver.findElement(By.id("location"));
		WebElement txtlocation = baseclass.findElementById("location");
		
		//Select select=new Select(location);
		//select.selectByIndex(3);
		baseclass.selectByIndex(txtlocation, 3);
		
	
		
		
		//WebElement FromDate = driver.findElement(By.id("datepick_in"));
		WebElement fromdate = baseclass.findElementById("datepick_in");
		
		//JavascriptExecutor executor=(JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].setAttribute('value','24/03/21')", FromDate);
		baseclass.typejs(fromdate, "22-03-2021");
		
		//WebElement toDate = driver.findElement(By.id("datepick_out"));
		WebElement todate = baseclass.findElementById("datepick_out");
//		JavascriptExecutor executor1=(JavascriptExecutor)driver;
//		executor1.executeScript("arguments[0].setAttribute('value','25/03/21')", toDate);
		baseclass.typejs(todate, "24-03-2021");
		
		//WebElement search = driver.findElement(By.id("Submit"));
		WebElement search = baseclass.findElementById("submit");
		//search.click();
		baseclass.click(search);
		
		//WebElement radiobutton = driver.findElement(By.id("radiobutton_1"));
		WebElement radiobutton = baseclass.findElementById("radiobutton_1");
		//radiobutton.click();
		baseclass.click(radiobutton);
		
		//WebElement con = driver.findElement(By.id("continue"));
		WebElement con = baseclass.findElementById("continue");
		//con.click();
		baseclass.click(con);
		
		//WebElement frstname = driver.findElement(By.id("first_name"));
		WebElement frstname = baseclass.findElementById("first_name");
		//frstname.sendKeys("hari");
		String data1 = baseclass.getData("Test", 0, 1);
		baseclass.type(id,data1);
		
		
		
		
		//WebElement last = driver.findElement(By.id("last_name"));
		WebElement last = baseclass.findElementById("last_num");
		//last.sendKeys("santhosh");
		String data2 = baseclass.getData("Test", 0, 1);
		baseclass.type(id,data2);
		
		//WebElement add = driver.findElement(By.id("address"));
		WebElement add = baseclass.findElementById("address");
		//add.sendKeys("chennai");
		String data3 = baseclass.getData("Test", 0, 1);
		baseclass.type(id,data3);
		
		
		
		//WebElement num = driver.findElement(By.id("cc_num"));
		WebElement num = baseclass.findElementById("cc_num");
		//num.sendKeys("9876543212341234");
		String data4 = baseclass.getData("Test", 0, 1);
		baseclass.type(id,data4);
		
		
		
		
		//WebElement card= driver.findElement(By.id("cc_type"));
		WebElement card = baseclass.findElementById("cc_type");
		//Select select3=new Select(card);
		//select3.selectByIndex(3);
		baseclass.selectByIndex(txtlocation, 3);
		
		
		
		
		
		//WebElement type = driver.findElement(By.id("cc_exp_month"));
		WebElement type= baseclass.findElementById("cc_exp_month");
		//Select select1=new Select(type);
		//select1.selectByIndex(6);
		baseclass.selectByIndex(txtlocation, 3);
		
		
		//WebElement year = driver.findElement(By.id("cc_exp_year"));
		WebElement year= baseclass.findElementById("cc_exp_year");
		
		//Select select2=new Select(year);
		//select2.selectByIndex(2);
		baseclass.selectByIndex(txtlocation, 3);
		
		
		//WebElement cvvnum = driver.findElement(By.id("cc_cvv"));
		WebElement cvvnum= baseclass.findElementById("cc_cvv");
      //cvvnum.sendKeys("2345");
		String data5= baseclass.getData("Test", 0, 1);
		baseclass.type(id,data5);
		
		
		
		
		//WebElement book = driver.findElement(By.id("book_now"));
		WebElement book= baseclass.findElementById("cc_exp_year");
		
		
		//book.click();
		baseclass.click(con);
		
		
		//Thread.sleep(8000);
		
		//WebElement orderno = driver.findElement(By.id("order_no"));
		//String s = orderno.getAttribute("value");
		//System.out.println(s);
		

		
		
		
		
		
		
		
		 
		
		 
		 
		 
		 
		
	}
		
}
