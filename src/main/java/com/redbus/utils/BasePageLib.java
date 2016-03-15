package com.redbus.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.redbus.pageobjects.BasePage;
import com.redbus.scripts.SuperTestNG;

public class BasePageLib {
	
	BasePage b = new BasePage(SuperTestNG.driver);
	
	public boolean verifyFilters(){
		for(WebElement e : b.getFilters()){
			System.out.println(e.getText());
			e.isDisplayed();
		}
		return true;
	}
	
	public BookTicketPageLib clickOnTravels(String travelsName){
		b.getFilters().get(0).click();
		for(WebElement travel : b.getTravels()){
		if(travelsName.contains(travel.getText())){
			travel.click();
		}
		}
		return PageFactory.initElements(SuperTestNG.driver, BookTicketPageLib.class);
	}


}
