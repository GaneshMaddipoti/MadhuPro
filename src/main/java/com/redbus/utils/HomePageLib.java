package com.redbus.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.redbus.pageobjects.BasePage;
import com.redbus.pageobjects.HomePage;
import com.redbus.scripts.SuperTestNG;

public class HomePageLib {
	public static String from;
	public static String to;
	private HomePage home = new HomePage(SuperTestNG.driver);

	public boolean verifyTitle(String title) {

		System.out.println(title);

		System.out.println(home.getTitleHome().getText());

		if (title.equals(home.getTitleHome().getText())) {

			Reporter.log("title verified", true);
		}

		return true;

	}

	public void enterTextIntoFromAndToTextField() {
		home.getFromTextField().sendKeys("bang");
		SuperTestNG.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		home.getAutoComplete().click();
		home.getToTextField().sendKeys("chennai");
	}

	public void enterDateIntoTextField() {
		home.getCalenderTxtField().click();
		home.getCurrentDate().click();
	}
	public void enterFromDateTextField(){
		home.getCalenderReturnTextField().click();
		home.getReturnCurrentDate().click();
	}

	public void verifyTextFields() {
		from = home.getFromTextField().getAttribute("value");
		to = home.getToTextField().getAttribute("value");
		if (from.equals("Bangalore") && to.equals("chennai")) {
			enterDateIntoTextField();
		}

	}

	public BasePageLib clickOnSearchButton() {
		home.getSearchBtn().click();
		return PageFactory.initElements(SuperTestNG.driver, BasePageLib.class);
	}
}
