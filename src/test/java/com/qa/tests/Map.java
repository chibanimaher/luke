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
import com.qa.pages.PageTestMap;
import com.qa.pages.PagePayement;
import com.qa.pages.PageSummury;
import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class Map extends BaseTest{
	public PageTestMap mapPage;
	public RetryTest retrytest =new RetryTest();
	/**
	 * [Map] Map[DAPP-16468][Hotels List] - Affichage du tarif Accor Privileged Partner
	 */
	@SuppressWarnings("rawtypes")
	@Test(retryAnalyzer = RetryTest.class)
	public void AffichagePriceAccorPrivilegedPartner() {
		mapPage=new PageTestMap((AndroidDriver) getDriver());
		mapPage.mapAffichageTarifAccorPrivilged();
	}
	/**
	 * [Map] Map[DAPP-16473][Hotels List] - Affichage du tarif Accor Plus
	 */
	@SuppressWarnings("rawtypes")
	@Test(retryAnalyzer = RetryTest.class)
	public void AffichagePriceAccorPrivilegedPlus() {
		mapPage=new PageTestMap((AndroidDriver) getDriver());
		mapPage.mapAffichageTarifAccorPlus();
	}
	/**
	 * [Map] Map[DAPP-16474][Hotels List] - Affichage du prix public
	 */
	@SuppressWarnings("rawtypes")
	@Test(retryAnalyzer = RetryTest.class)
	public void AffichagePrixPublic() {
		mapPage=new PageTestMap((AndroidDriver) getDriver());
		mapPage.mapAffichageTarifPrixPublic();
	}
}
