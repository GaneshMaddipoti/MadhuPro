package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lib {
	
	public static String className;
	public WebElement pickDate(String date){		
			
		WebElement takeDate =  EnterDate.driver.findElement(By.xpath("//div[@id='rbcal_txtReturnCalendar']/table[1]//td[contains(text(),'"+date+"')]"));
		
		return takeDate;
		
		
	}

}
