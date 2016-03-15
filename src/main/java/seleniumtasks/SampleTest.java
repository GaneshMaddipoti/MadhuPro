package seleniumtasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SampleTest {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.giftcardsindia.in/pages/gift-cards#/page/1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String expected = driver.findElement(By.xpath("//img[@title='Amazon.in Gift Card']")).getText();
		
		driver.findElement(By.xpath("//img[@title='Amazon.in Gift Card']/ancestor::div[@class='product-container']/descendant::div[@id='variation_id_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='4000']")).click();
		try{
		WebElement addToCart = driver.findElement(By.xpath("//img[@title='Amazon.in Gift Card']/ancestor::div[@class='product-container']/descendant::a[text()='Add To Cart' and contains(@onclick,'addItem')]"));
		addToCart.click();
		}
		catch(Exception e){
			System.out.println("ele not found");
		}
		
		driver.findElement(By.id("mycart")).click();
		
		String actual = driver.findElement(By.xpath("//a[contains(.,'Amazon.in E -')]")).getText();
		
		if(expected.equals(actual)){
			System.out.println("both are equal");
		}
		else{
			System.out.println("item added is wrong");
		}
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", addToCart);
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		try{
		wait.until(ExpectedConditions.visibilityOf(addToCart));
		}
		catch(Exception e){
			System.out.println("element not found");
		}
		addToCart.click();*/
		/*driver.findElement(By.xpath("//a[text()='Next']")).click();
		System.out.println("clicked");
		driver.findElement(By.xpath("//img[contains(@title,' Valentine')]")).click();
		driver.findElement(By.xpath("//img[@title='Landmark Gift Card']")).click();*/
	}

}
