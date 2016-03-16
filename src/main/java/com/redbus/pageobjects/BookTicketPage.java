package com.redbus.pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Factory;

import com.redbus.generics.DriverLib;
import com.redbus.scripts.SuperTestNG;

public class BookTicketPage {
	
	@FindBy(xpath="(//div[contains(@class,'tripView') and not(contains(@style,'display: none;'))]//button)[1]")
	private WebElement viewSeatsBtn;
	
	@FindBy(xpath="//div[@class='seatLayoutHolder clearfix']")
	private WebElement seatLayout;
	
	@FindBy(xpath="(//div[@class='clearfix']//select)[1]")
	private WebElement boardingPoint;
	
	@FindBy(xpath="//a[@class='available seat']")
	private List<WebElement> availableSleeper;
	
	@FindBy(xpath="//button[@class='continueBtn']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//div[@class='question XXCN']")
	private WebElement checkMsg;
	
	@FindBy(linkText="No. Not Now")
	private WebElement notNowBtn;
	
	@FindBy(xpath="(//div[@id='returnTrip']//h4[@title='Parveen  Travels'])[1]")
	private WebElement herbronTransports;
	
	@FindBy(xpath="//a[@class='yes XCN ancLink XXBMargin']")
	private WebElement yesButton;
	
	public WebElement getViewSeatsBtn() {
		//DriverLib.waitToClick(viewSeatsBtn);
		return viewSeatsBtn;
	
	}

	public WebElement getSeatLayout() {
		return seatLayout;
	}

	public WebElement getBoardingPoint() {
		return boardingPoint;
	}

	public List<WebElement> getAvailableSleeper() {
		DriverLib.waitToLoad(availableSleeper);
		return availableSleeper;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCheckMsg() {
		return checkMsg;
	}

	public WebElement getNotNowBtn() {
		return notNowBtn;
	}
	
	public WebElement getYesButton(){
		return yesButton;
	}
	public WebElement getHerbonTranvels(){
		return herbronTransports;
	}
	
	public BookTicketPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	

}
