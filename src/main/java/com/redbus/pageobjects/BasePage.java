package com.redbus.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	@FindBy(xpath="//span[@class='filterType']")
	private List<WebElement> filters;
	
	@FindBy(xpath="//div[@class='filter Travels opened']//ul/li")
	private List<WebElement> travelList;
	
	
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public List<WebElement> getFilters(){
		return filters;
	}
	
	public List<WebElement> getTravels(){
		return travelList;
	}
}
