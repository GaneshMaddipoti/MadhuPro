package SeleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterDate {
	public static WebDriver driver;

	public static void main(String[] args) {

		String date = "12";
		
		

		driver = new FirefoxDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtReturnCalendar")).click();
		Lib lib = new Lib();
		WebElement takeDate = lib.pickDate(date);
		String className = takeDate.getAttribute("class");
		System.out.println(className);
		switch (className) {
		case "past day":
			System.out.println("Date is disabled");
			driver.findElement(By.id("txtOnwardCalendar")).sendKeys("abc");
			break;
		case "current day":
			lib.pickDate(date).click();
			break;
		case "wd day":
			lib.pickDate(date).click();
			break;
		case "we day":
			lib.pickDate(date).click();
			break;
		}
	}
}
