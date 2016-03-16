package com.redbus.generics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.redbus.scripts.SuperTestNG;
import com.thoughtworks.selenium.Wait;

public class DriverLib {
	
	static WebDriver driver = new FirefoxDriver();
	
	public static void waitEnable(WebElement ele){

		WebDriverWait wait = new WebDriverWait(SuperTestNG.driver, 60);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("selectedData prev inactive")));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("selectedData prev inactive")));
		wait = (WebDriverWait) new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).
										ignoring(NoSuchElementException.class);
		
		 		

		
		
		
	}
	public static void waitToLoad(List<WebElement> availableSleeper){
		
		WebDriverWait wait = new WebDriverWait(SuperTestNG.driver, 60);
		wait.until(ExpectedConditions.visibilityOfAllElements(availableSleeper));
		
	}
	
	public static void waitLoad(WebElement ele){
		WebDriverWait wait = new WebDriverWait(SuperTestNG.driver, 40);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
}
