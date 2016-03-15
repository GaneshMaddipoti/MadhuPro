package seleniumtasks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authentication {
	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new FirefoxDriver();

	driver.get("http://codecanyon.net/item/responsive-modular-lightbox/full_screen_preview/8860599?ref=jqueryrain&ref=jqueryrain&clickthrough_id=628759284&redirect_back=true%20-Authentication%20popup");
	try{
	Runtime.getRuntime().exec("D:\\RedBus Framework\\redbus\\src\\main\\java\\seleniumtasks\\authentication.exe");
	}
	catch(Exception e){
		System.out.println("not able to close");
	}
	}
}

