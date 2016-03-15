package com.redbus.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.redbus.generics.DriverLib;
import com.redbus.pageobjects.BookTicketPage;
import com.redbus.scripts.SuperTestNG;

public class BookTicketPageLib {

	private BookTicketPage btp = new BookTicketPage(SuperTestNG.driver);

	public boolean clickOnSeatsAndVerify(String btnText) {

		WebDriverWait wait = new WebDriverWait(SuperTestNG.driver, 10);
		wait.until(ExpectedConditions.visibilityOf(btp.getViewSeatsBtn()));

		System.out.println(btp.getViewSeatsBtn().getText());
		if (btp.getViewSeatsBtn().getText().equals(btnText)) {
			btp.getViewSeatsBtn().click();
			btp.getSeatLayout().isDisplayed();
			btp.getBoardingPoint().isDisplayed();
		}
		return true;
	}
	
	public BookTicketPageLib bookingTicket(String inputBusNo) {

		for (WebElement seat : btp.getAvailableSleeper()) {
			String s = seat.getAttribute("title");
			String p = "\\d{2} ";

			Pattern pt = Pattern.compile(p);
			Matcher match = pt.matcher(s);

			while (match.find()) {
				String busNo = match.group();
				// System.out.println(busNo);
				if (inputBusNo.equalsIgnoreCase(busNo.trim())) {
					System.out.println("bus no's are equal");
					seat.click();
					break;
				}
			}
			System.out.println(s);
		}

		Select s = new Select(btp.getBoardingPoint());

		s.selectByVisibleText("Madiwala - 11:30 PM  ");

		btp.getContinueBtn().click();

		/*if (btp.getCheckMsg().isDisplayed()) {
			btp.getNotNowBtn().click();
		}*/

		return this;

	}

	/*
	 * To verify Yes I would like to div and click on Not Now
	 */
	public void verifyMsg(){

		if (btp.getCheckMsg().isDisplayed()) {
			btp.getNotNowBtn().click();
		}
	}
	/*
	 * Get the confirmation to click yes for booking 
	 * return ticket as well.
	 */
	public void clickOnYesButton(){
		btp.getYesButton().click();
	}
	/*
	 * Click on any one of the bus viewseats button to
	 * book a return ticket
	 */
	public void bookReturnTicket(String btnText){
		DriverLib.waitLoad(btp.getHerbonTranvels());
		if(btp.getHerbonTranvels().isDisplayed()){
			clickOnSeatsAndVerify(btnText);
		}
		
	}

}
