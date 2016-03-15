package seleniumtasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AuthencationPopup {

	public static void main(String[] args) throws AWTException, IOException {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[contains(@href,'selenium-java-2.51.0.zip')]")).click();
		Runtime.getRuntime().exec("D:\\RedBus Framework\\redbus\\src\\main\\java\\seleniumtasks\\autoit.exe");
	}

}
