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
import com.qa.pages.PageTestHotelCard;
import com.qa.pages.PagePayement;
import com.qa.pages.PageSummury;
import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class HotelCard extends BaseTest{
	public PageTestHotelCard hotelcardPage;
	public RetryTest retrytest =new RetryTest();

	/**
	 * [Hotel Card][DAPP-10128] - AllSafe Global Hotel - Show logo and label - logged in with an account
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void AllSafeGlobalHotel() {
		hotelcardPage=new PageTestHotelCard((AndroidDriver) getDriver());
		hotelcardPage.allSafeGlobalHotel();

	}
	/**
	 * [Hotel Card][DAPP-12762]Label Insert User-price Toggle STAY PLUS Activated
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void LabelInsertPriceToggleStayPlus()  {
		hotelcardPage=new PageTestHotelCard((AndroidDriver) getDriver());
		hotelcardPage.labelInsertUserPrice();

	}
	/**
	 * [Hotel Card][[DAPP-13366]Intégration Encart Price Screen Price Public
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void IntegrationEncartPriceScreenPricePublic()  {
		hotelcardPage=new PageTestHotelCard((AndroidDriver) getDriver());
		hotelcardPage.integrationEncartPrice();

	}
	/**
	 * [Hotel Card][DAPP-13367] Affichage de la composition de la chambre
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void AffichageCompositionChambre()  {
		hotelcardPage=new PageTestHotelCard((AndroidDriver) getDriver());
		hotelcardPage.affichageCompositionRoom();

	}
	/**
	 * [Hotel Card][DAPP-13368] Affichage de la map
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void AffichageMap()  {
		hotelcardPage=new PageTestHotelCard((AndroidDriver) getDriver());
		hotelcardPage.affichageMap();

	}
	/**
	 * [[Hotel Card][DAPP-13369] Affichage du descriptif de l’hôtel
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void AffichageDescriptifHotel()  {
		hotelcardPage=new PageTestHotelCard((AndroidDriver) getDriver());
		hotelcardPage.affichageDescriptifHotel();

	}
	/**
	 * [Hotel Card][DAPP-13374]Intégration Encart Prix_ Libellé Accor Plus
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void IntegrationPriceAccorPlus()  {
		hotelcardPage=new PageTestHotelCard((AndroidDriver) getDriver());
		hotelcardPage.integrationEncartPriceAccorPlus();

	}
}
