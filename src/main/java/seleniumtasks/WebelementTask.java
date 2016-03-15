package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebelementTask {
	
	public static void main(String[] args) {
		 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.giftcardsindia.in/pages/gift-cards");
		WebElement ele = driver.findElement(By.xpath("//a[contains(@href,'/pages/corporate/more/offers')]"));
		WebElement parent = ele.findElement(By.xpath("./ancestor::ul[@class='small-block-grid-2 large-block-grid-5 footer-lnks']"));
		System.out.println(parent.getText());
	}

}
