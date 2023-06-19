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
import com.qa.pages.PageTestBooking;
import com.qa.pages.PageTestHotelList;
import com.qa.pages.PagePayement;
import com.qa.pages.PageSummury;
import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class HotelList extends BaseTest{
	public PageTestHotelList hotelListPage;
	public RetryTest retrytest =new RetryTest();
	/**
	 * @Title [Hotel List] [DAPP-14188] Integration Encart Prix affichage du libelle -Gestion de la devise
	 * @throws 
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void AuthenticationLCAHAccount() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.integrationEncart();
		
	}
	
	/**
	 * [Hotel List][DAPP-13370]Integration Insert Price_label Partner Privilege
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void IntegrationInsertPriceLabelPartnerPrivilege() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.integrationEncartPriceAccorPlus();
		
	}
	/**
	 * [Hotel List][DAPP-12760]Label Insert User-price Toggle STAY PLUS Activated
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void LabelInsertUserPriceToggleStayPlusActived() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.labelInsertUserPrice();
		
	}
	/**
	 * Hotel List][DAPP-12769] Label Insert price Business plus
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void LabelInsertPriceBusinessPlus() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.statusBusinessPlus();
		
	}
	/**
	 * [Hotel List][DAPP-13050]Sort By Price High to low
	 */
	@SuppressWarnings("rawtypes")	
	@Test()
	public void SortByPriceHighToLow() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.sortByPriceHioghTolow();
		
	}
	/**
	 *  [Hotel List][DAPP-13051]Sort By Tripadvisor high to low
	 */
	@SuppressWarnings("rawtypes")	
	@Test()
	public void SortByTarpAdvisorRating() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.sortByPricetripAdvisor();
		
	}
	/**
	 *  [Hotel List][DAPP-13052]Sort By Price low to High
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void SortByPriceLowToHigh() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.sortByPriceLowToHigh();
		
	}
	/**
	 *  [Hotel List][DAPP-14187] Label Intégration Encart Prix_ Libellé Accor Priviliged Partner
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void LabelIntegrationEncartprixLibelleAccorPriviligedPartner() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.integrationEncartAccorPlusPartener();
		
	}
	/**
	 *  [Hotel List][DAPP-14191]Integration Encart Prix affichage du prix BAR
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void LabelIntegrationEncartPrixAffichageBar() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.integrationEncartAccorPrixBar();
		
	}
	/**
	 *  [Hotel List][DAPP-2646]Back depuis la FH
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void BackDepuisFH() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.backDepuisFH();
		
	}
	/**
	 *  [Hotel List][DAPP-3791]Expand your search
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ExpandSearch() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.expandSearch();
		
	}
	/**
	 *  [Hotel List][DAPP-3969]Affichage du Bloc hôtel Vue Map
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void BlocHotel() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.blocHotel();
		
	}
	/**
	 * [Hotel List][DAPP-8387]Appel d'un hôtel depuis la FH
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void AppelHotelFromFH() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.appelHotel();
		
	}
	/**
	 * [Hotel List][DAPP-12760]Envoi d'un e-mail à un hôtel depuis la FH
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void EnvoiEmailDepuisFH() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.emailHotel();
		
	}
	/**
	 * [Hotel List] [DAPP-21739] Change Currency
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ChangeCurrency() {
		hotelListPage=new PageTestHotelList((AndroidDriver) getDriver());
		hotelListPage.changeCurrency();
		
	}
}
