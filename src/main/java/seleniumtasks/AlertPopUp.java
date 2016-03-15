package seleniumtasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUp {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
	driver.get("http://t4t5.github.io/sweetalert/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='showcase normal']/button[text()='Show error message']")).click();
	driver.switchTo().alert().accept();
}
}
