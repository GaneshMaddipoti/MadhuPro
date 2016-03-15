package com.redbus.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.redbus.pageobjects.BasePage;
import com.redbus.pageobjects.HomePage;
import com.redbus.utils.BasePageLib;
import com.redbus.utils.BookTicketPageLib;
import com.redbus.utils.HomePageLib;

public class VerifyHomePage_Test extends SuperTestNG {
	HomePageLib homePage;

	BookTicketPageLib bookTicket;

	@BeforeTest
	public void initVars() {
		homePage = new HomePageLib();

		bookTicket = new BookTicketPageLib();

	}

	@Test(enabled=false)
	@Parameters({ "title" })
	public void VerifyTitle(String title) throws InterruptedException {

		Assert.assertTrue(homePage.verifyTitle(title));

		homePage.enterTextIntoFromAndToTextField();
		Reporter.log("entered text into  to and from text filed", true);
		homePage.enterDateIntoTextField();
		Reporter.log("selected date", true);
		BasePageLib b = homePage.clickOnSearchButton();
		Reporter.log("search button clicked");
		/*
		 * After click on search button should navigate to BasePageLib to verify
		 * all the bus filters.
		 */
		b.verifyFilters();
		/*
		 * Select any one bus travel
		 */
		b.clickOnTravels("AHMED EXPRESS");
		Reporter.log("verified", true);
		Assert.assertTrue(bookTicket.clickOnSeatsAndVerify("View Seats"));
		/*
		 * Book bus seat number 10
		 */
		bookTicket.bookingTicket("35");

		bookTicket.verifyMsg();
	}

	@Test
	@Parameters({ "title" })
	public void VerifyReturnJourny(String title) throws InterruptedException {
		Assert.assertTrue(homePage.verifyTitle(title));
		homePage.enterTextIntoFromAndToTextField();
		homePage.enterDateIntoTextField();
		homePage.enterFromDateTextField();
		BasePageLib b = homePage.clickOnSearchButton();
		b.verifyFilters();
		b.clickOnTravels("Parveen  Travels");
		Reporter.log("verified", true);
		Assert.assertTrue(bookTicket.clickOnSeatsAndVerify("View Seats"));
		bookTicket.bookingTicket("35");
		bookTicket.clickOnYesButton();
		bookTicket.bookReturnTicket("View Seats");
	}

}
