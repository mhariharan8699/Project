package com.mvn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Unit {
	static WebDriver driver;
	@BeforeClass
	public  static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@Before
	public void beforeMethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);
		}
	@Test
	public void login() {
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("Santhosh0806");
		
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("HSAZT2");
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		
		}
	@After
	public void afterMethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);
		}
	@AfterClass
	public void afterClass() {
		driver.quit();
		

	}
	
	

}
