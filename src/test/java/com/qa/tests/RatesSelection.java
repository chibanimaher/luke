package com.qa.tests;

import java.io.InputStream;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.listeners.RetryTest;
import com.qa.pages.PageHome;
import com.qa.pages.PageTestAccount;
import com.qa.pages.PageTestRateSelection;
import com.qa.pages.PagePayement;
import com.qa.pages.PageSummury;
import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class RatesSelection extends BaseTest{
	public PageTestRateSelection rateSelectionPage;
	public RetryTest retrytest =new RetryTest();
	/**
	 * [Rates selection][DAPP-12766]Displaying the price label_The Accor Plus
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DisplayingThePriceLabelAccorPlus(){
		rateSelectionPage=new PageTestRateSelection((AndroidDriver) getDriver());
		rateSelectionPage.labelDisplayingAccorPlus();
	}
	/**
	 * [Rates selection][DAPP-12767]Displaying the price label_The Ibis Business
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DisplayingThePriceLabelIbisBusiness(){
		rateSelectionPage=new PageTestRateSelection((AndroidDriver) getDriver());
		rateSelectionPage.displayingIbisBusiness();


	}
	/**
	 * [Rates selection][DAPP-12768]Displaying the price label_The AccorHotels Club
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DisplayingThePriceLabelMembersRate(){
		rateSelectionPage=new PageTestRateSelection((AndroidDriver) getDriver());
		rateSelectionPage.displayingMenmberRate();


	}
	/**
	 * [Rates selection][DAPP-18560]Displaying the B2B price label_Dedicated Offer
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DisplayingB2BPriceLabelDedicatedOffer(){
		rateSelectionPage=new PageTestRateSelection((AndroidDriver) getDriver());
		rateSelectionPage.displayB2B();


	}
	/**
	 * [Rates selection][DAPP-18776]Displaying the price label_Accor Privileged Partners
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DisplayingPriceLabelAccorPrivilegedPartners(){
		rateSelectionPage=new PageTestRateSelection((AndroidDriver) getDriver());
		rateSelectionPage.displayAccorPrivileged();


	}
	/**
	 * [[Rates selection][DAPP-18777]Displaying the price label_The Business Plus
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DisplayingPriceLabelTheBusinessPlus(){
		rateSelectionPage=new PageTestRateSelection((AndroidDriver) getDriver());
		rateSelectionPage.displayBusinessPlus();
	}

}
