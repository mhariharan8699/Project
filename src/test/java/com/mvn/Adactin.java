package com.mvn;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		    BaseClass baseclass=new BaseClass();
		   
			baseclass.getDriver();
			
			baseclass.loadUrl("https://adactinhotelapp.com/");
			
			WebElement id = baseclass.findElementById("username");
			String data = baseclass.getData("Adactin", 1, 0);
			baseclass.type(id,data);
			
			WebElement txtpass = baseclass.findElementById("password");
			String pass = baseclass.getData("Adactin", 1, 1);
			baseclass.type(txtpass,pass);
			
			WebElement btnlogin = baseclass.findElementById("login");
			baseclass.click(btnlogin);

			WebElement txtlocation = baseclass.findElementById("location");
			baseclass.selectByIndex(txtlocation, 3);
			
			WebElement hotels = baseclass.findElementById("hotels");
			baseclass.selectByIndex(hotels, 2);
			
			WebElement num = baseclass.findElementById("room_nos");
			baseclass.selectByIndex(num,2);
			
			WebElement roomtype = baseclass.findElementById("room_type");
			baseclass.selectByIndex(roomtype, 3);
			
			WebElement adultroom = baseclass.findElementById("adult_room");
			baseclass.selectByIndex(adultroom, 2);
			
			WebElement submitbtn = baseclass.findElementById("Submit");
			baseclass.click(submitbtn);
			
			WebElement radio = baseclass.findElementById("radiobutton_0");
			baseclass.click(radio);
			
			WebElement conbtn = baseclass.findElementById("continue");
			baseclass.click(conbtn);
			
			WebElement frstname= baseclass.findElementById("first_name");
			String frst = baseclass.getData("Adactin", 1, 2);
			baseclass.type(frstname,frst);
			
			WebElement lastname= baseclass.findElementById("last_name");
			String last = baseclass.getData("Adactin", 1, 3);
			baseclass.type(lastname,last);
			
			WebElement address= baseclass.findElementById("address");
			String add = baseclass.getData("Adactin", 1, 4);
			baseclass.type(address,add);
			
			WebElement cardnum= baseclass.findElementById("cc_num");
			String card = baseclass.getData("Adactin", 1, 5);
			baseclass.type(cardnum,card);
			
			WebElement cctype= baseclass.findElementById("cc_type");
			baseclass.selectByIndex(cctype, 3);
			
			WebElement expmonth= baseclass.findElementById("cc_exp_month");
			baseclass.selectByIndex(expmonth, 6);
			
			WebElement year= baseclass.findElementById("cc_exp_year");
			baseclass.selectByIndex(year, 3);
			
			WebElement cvvnum= baseclass.findElementById("cc_cvv");
			String data5= baseclass.getData("Adactin", 1, 6);
			baseclass.type(cvvnum,data5);
			
			WebElement book= baseclass.findElementById("book_now");
			baseclass.click(book);
			
			Thread.sleep(5000);
			
			WebElement order = baseclass.findElementById("order_no");
			String s = baseclass.getAttribute(order);
			baseclass.updateData("Adactin", 1, 7,s);
			System.out.println(s);
			
			
			
			
			
			
			
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
