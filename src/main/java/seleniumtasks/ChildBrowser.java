package seleniumtasks;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowser {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://rip747.github.io/popupwindow/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//dd[contains(text(),'windowNotNew')]/..//a[text()='Example 2']")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> s = handle.iterator();
		
		String childWindow = s.next();
		String child = s.next();
		
		driver.switchTo().window(child);
		driver.switchTo().window(child).manage().window().maximize();
		driver.manage().window().maximize();
		driver.findElement(By.name("s")).sendKeys("ui plugin");
		
	}

}
