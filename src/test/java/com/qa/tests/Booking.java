package com.qa.tests;


import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.listeners.RetryTest;
import com.qa.pages.PageTestBooking;


import io.appium.java_client.android.AndroidDriver;

public class Booking extends BaseTest{
	public PageTestBooking loginPage;
	public RetryTest retrytest =new RetryTest();
	/**
	 * @Title [[Booking][Classic user][DAPP-3074] Authentication LCAH account
	 * @throws 
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void AuthenticationLCAHAccount() {
		loginPage=new PageTestBooking((AndroidDriver) getDriver());
		loginPage.authentificationLCAH();
		
	}
	/**
	 * @Title [Booking][Connected User][DAPP-11766] Multi-room
	 * @throws 
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void MultiRoom(){
		loginPage=new PageTestBooking((AndroidDriver) getDriver());
		loginPage.multiRoom();
	}
	
	/**
	 * @Title [Booking][Guest user][DAPP-11454]Login in from the join screen
	 * @throws 
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void LoginInFromTheJoinScreen()  {
		loginPage=new PageTestBooking((AndroidDriver) getDriver());
		loginPage.loginInFromJoinScreen();

	}
	
	/**
	 * @Title [Booking][Guest user][DAPP-11419] Having children and adults in the room
	 * @throws 
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void HavingChildrenAndAdultsInTheRoom()  {
		loginPage=new PageTestBooking((AndroidDriver) getDriver());
		loginPage.havingChildrenAndAdultes();
	}
	
	/**
	 * @Title [Booking] [Guest user] [DAPP-11451] Only adults booking
	 * @throws 
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void OnlyAdultsBooking()  {
		loginPage=new PageTestBooking((AndroidDriver) getDriver());
		loginPage.onlyAdultes();
		
	}
	/**
	 * @Title [Booking][User logged][DAPP-11845] BWP- Booking With Points- payment at the hotel
	 * @throws 
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void BWPBookingWithPointsPaymentAtTheHotel()  {
		loginPage=new PageTestBooking((AndroidDriver) getDriver());
		loginPage.pointPayementAtHotel();
	}
	
	/**
	 * @Title [Booking][OnlineCheckin][DAPP-13985]: check if the link is displayed (Customer has not yet checked in)
	 * @throws 
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void CheckIfTheLinkIsDisplayed ()  {
		loginPage=new PageTestBooking((AndroidDriver) getDriver());
		loginPage.checkIfLinkDisplayed();
	}
}
