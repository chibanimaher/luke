package com.qa.tests;

import java.io.InputStream;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.listeners.RetryTest;
import com.qa.pages.PageHome;
import com.qa.pages.PageTestAccount;
import com.qa.pages.PageTestRoomSelection;
import com.qa.pages.PagePayement;
import com.qa.pages.PageSummury;
import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class RoomSelection extends BaseTest{
	public PageTestRoomSelection roomSelectionPage;
	public RetryTest retrytest =new RetryTest();


	/**
	 * [Room selection][DAPP-12665]Label Insert User-price STAY PLUS Activated
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()	
	public void LabelInsertUserPriceStayPlus() {
		roomSelectionPage=new PageTestRoomSelection((AndroidDriver) getDriver());
		roomSelectionPage.labelInsertUserPriceStayPlus();

	}
	/**
	 * [[Room selection][DAPP-12666][Multiroom]- Room Selection- Do not display Stay Plus
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test(retryAnalyzer = com.qa.listeners.RetryTest.class)	
	public void LabelInsertUserPriceNoStayPlus()  {
		roomSelectionPage=new PageTestRoomSelection((AndroidDriver) getDriver());
		roomSelectionPage.labelInsertUserPriceNoStayPlus();

	}
	
	
	/**
	 * [Room selection][DAPP-14192] Label Insert Price - standard user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test(retryAnalyzer = com.qa.listeners.RetryTest.class)	
	public void LabelInsertUserPriceStandard()  {
		roomSelectionPage=new PageTestRoomSelection((AndroidDriver) getDriver());
		roomSelectionPage.labelInsertUserPriceNoStayPlus();

	}
	/**
	 * [Room selection][DAPP-16475] RoomSelection - Affichage du tarif Accor Plus
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test(retryAnalyzer = com.qa.listeners.RetryTest.class)	
	public void AffichageTarifAccorPlus()  {
		roomSelectionPage=new PageTestRoomSelection((AndroidDriver) getDriver());
		roomSelectionPage.affichageTarifAccorPlus();

	}
	/**
	 * [Room selection][DAPP-16477] RoomSelection - Affichage du prix public (Guest)
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test(retryAnalyzer = com.qa.listeners.RetryTest.class)	
	
	public void AffichagePrixPublicGuest()  {
		roomSelectionPage=new PageTestRoomSelection((AndroidDriver) getDriver());
		roomSelectionPage.affichagePrixPublic();

	}
	/**
	 * [Room selection][DAPP-3999][Multiroom]- iOS - Engine-Add children
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test(retryAnalyzer = com.qa.listeners.RetryTest.class)	
	
	public void EngineAddChildreen()  {
		roomSelectionPage=new PageTestRoomSelection((AndroidDriver) getDriver());
		roomSelectionPage.engineAddChildreen();

	}
	/**
	 * [Room selection][DAPP-9400][Multiroom]iOS - Engine -MaxPax 
	 */
	@SuppressWarnings("rawtypes")
	@Test(retryAnalyzer = com.qa.listeners.RetryTest.class)	
	public void EngineMaxAdultes()  {
		roomSelectionPage=new PageTestRoomSelection((AndroidDriver) getDriver());
		roomSelectionPage.engineMaxAdultes();

	}
}
