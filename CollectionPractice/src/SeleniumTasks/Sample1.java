package SeleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("lst-ib"));
		ele.sendKeys("selenium");	
		
		/*
		 * Deleting textbox value using delete and backspace keys.
		 */
		
		ele.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		ele.sendKeys(Keys.chord(Keys.BACK_SPACE)); 
		
		/*
		 * Fetching the value from textbox
		 */
		String text = ele.getAttribute("value");
		System.out.println(text);
		
		
	
	}
}
