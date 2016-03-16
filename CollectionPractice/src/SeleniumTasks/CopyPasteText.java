package SeleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteText {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement ele = driver.findElement(By.name("email"));
	    ele.sendKeys("chinni.munni@gmail.com");
	    WebElement un = driver.findElement(By.id("u_0_1"));
	    Actions action = new Actions(driver);
	    ele.sendKeys(Keys.CONTROL,"a");
	    action.contextClick(ele).sendKeys("C").perform();
	    action.contextClick(un).sendKeys("P").perform();
	    Thread.sleep(1000);
	    //String un = ele.getAttribute("value");
	   //String copyText =  un.substring(0, 3);
	    Thread.sleep(1000);
	   /* WebElement pass = driver.findElement(By.id("pass"));
	    System.out.println(pass.getCssValue("color"));*/
	}
}
