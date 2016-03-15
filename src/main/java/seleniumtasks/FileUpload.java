package seleniumtasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/basic.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{
		driver.findElement(By.id("fileupload")).sendKeys("D:\\index.jpg");
		//driver.findElement(By.id("fileupload")).sendKeys("D:\\index1.jpg");
		}
		catch(Exception e){
			System.out.println("not able to send file");
		}

	}
}
