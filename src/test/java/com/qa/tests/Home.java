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
import com.qa.pages.PageTestHome;
import com.qa.pages.PagePayement;
import com.qa.pages.PageSummury;
import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class Home extends BaseTest{
	public PageTestHome homePage;
	public RetryTest retrytest =new RetryTest();

	/**
	 * [Home Page][DAPP-17221] Search Engine: Validation de la recherche
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void SearchEngine()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.searchEngine();

	}
	/**
	 * [Home Page][DAPP-17222] Search Engine: Validation de la recherche
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void SearchEngineValidation()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.searchEngineValidation();

	}

	/**
	 * [Home Page][DAPP-17224] Loyalty Card: Affichage du QR code Gold
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void AffichageQRCode()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.affichageQrCode();

	}
	/**
	 * Home Page][DAPP-17229]Reset le moteur par défaut apres un logout
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ResetSearch()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.resetSearchEngine();

	}
	/**
	 * [Home Page][DAPP-17234] Expiration date_Silver user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ExpirationDateSilverUser()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.expirationDateSilver();

	}
	/**
	 * [Home Page][DAPP-17237] Expiration date_Gold user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ExpirationDateGolduser()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.expirationDateGold();

	}
	/**
	 * [Home Page][DAPP-17264] Expiration date_Platinum user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ExpirationDatePlatinumUser()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.expirationDatePlatinum();

	}
	/**
	 * [Home Page][DAPP-17264] Expiration date_Classic user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ExpirationDateClassicUser()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.expirationDateClassic();

	}
	/**
	 * [Home Page][DAPP-17267]Expiration date_Diamond user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ExpirationDateDiamond()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.expirationDateDiamond();

	}
	/**
	 * [Home Page][DAPP-17268] Expiration date_Limitless user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ExpirationDateLimitless()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.expirationDateLimitlesss();

	}
	/**
	 * [Home Page][DAPP-21696] Search Engine - Ecran Destination
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void EcranDestination()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.ecranDestination();

	}
	/**
	 * [Home Page][DAPP-21736] Search Engine - Header du champ Destination
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void HeaderDestination()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.headerDestination();

	}
	/**
	 * [Home Page][DAPP-21743] Prepare your stay:Logos Brands
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void LogosBrands()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.logosBrands();

	}
	/**
	 * [Home Page][DAPP17229]Reset le moteur par d�faut apres un logout
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ResetMoteurRechercheAndLogOut()  {
		homePage=new PageTestHome((AndroidDriver) getDriver());
		homePage.resetMoteurRecherche();

	}
}
