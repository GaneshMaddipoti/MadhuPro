package com.redbus.pageobjects;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SuppressForbidden;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;

import com.redbus.scripts.SuperTestNG;

public class HomePage {
	
	@FindBy(linkText = "Home")
	private WebElement titleHome;

	@FindBy(id = "txtSource")
	private WebElement fromTextField;

	@FindBy(id = "txtDestination")
	private WebElement toTextField;

	@FindBy(id = "txtOnwardCalendar")
	private WebElement calenderTxtField;
	
	@FindBy(id="txtReturnCalendar")
	private WebElement calenderReturnTextField;

	@FindBy(xpath="//div[@id='rbcal_txtReturnCalendar']//td[@class='current day']")
	private WebElement returnCurrentDate;

	@FindBy(xpath = "//li[text()='Bangalore']")
	private WebElement autoComplete;

	@FindBy(xpath = "//div[@id='rbcal_txtOnwardCalendar']//td[@class='current day']")
	private WebElement currentDate;
	
	@FindBy(id="searchBtn")
	private WebElement searchBtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
			}

	public WebElement getTitleHome() {
		return titleHome;
	}

	public WebElement getFromTextField() {
		return fromTextField;
	}

	public WebElement getToTextField() {
		return toTextField;
	}

	public WebElement getCalenderTxtField() {
		return calenderTxtField;
	}

	public WebElement getAutoComplete() {
		return autoComplete;
	}

	public WebElement getCurrentDate() {
		return currentDate;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public WebElement getReturnCurrentDate() {
		return returnCurrentDate;
	}
	
	public WebElement getCalenderReturnTextField() {
		return calenderReturnTextField;
	}

	
}
