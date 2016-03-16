package SeleniumTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.in");

		// To get the focus on the searchbox (NOT ENTERING ANYTHING)
		// driver.findElement(By.id("lst-ib")).sendKeys("");

		/* TO use Robot class to send text into into textfield */

		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		 * robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		 * robot.keyPress(KeyEvent.VK_H); robot.keyRelease(KeyEvent.VK_H);
		 * robot.keyPress(KeyEvent.VK_E); robot.keyRelease(KeyEvent.VK_E);
		 * robot.keyPress(KeyEvent.VK_L); robot.keyRelease(KeyEvent.VK_L);
		 * robot.keyPress(KeyEvent.VK_L); robot.keyRelease(KeyEvent.VK_L);
		 * robot.keyPress(KeyEvent.VK_O); robot.keyRelease(KeyEvent.VK_O);
		 * robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		 * robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		 */
		/* TO get the button text */
		System.out.println(driver.findElement(By.name("btnI")).getAttribute("value"));
		System.out.println(driver.findElement(By.name("btnI")).getCssValue("font-size"));
		System.out.println(driver.findElement(By.name("btnI")).getCssValue("color"));
		WebElement ele = driver.findElement(By.name("btnI"));
		/* To get the button size */
		Dimension d = ele.getSize();
		System.out.println(d.height);
		System.out.println(d.width);

		/* Click on button using keys class to enter button */
		ele.sendKeys(Keys.ENTER);

		/* Click on the button using javascript exectutor */
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

}
