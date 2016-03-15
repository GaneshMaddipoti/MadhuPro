package com.redbus.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class SuperTestNG {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		driver = new FirefoxDriver();
			driver.get("https://www.redbus.in/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}

}
