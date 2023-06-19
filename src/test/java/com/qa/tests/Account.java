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
import com.qa.pages.PagePayement;
import com.qa.pages.PageSummury;
import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class Account extends BaseTest{
	public PageTestAccount testPage;

/** 
 * @Title [Account][DAPP-13864]Dashbord Silver user
 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DashbordSilverUser() {
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.loginWithSilverAccount();
	}
	/**
	 * @Title [Account][DAPP-13866]Dashbord: Platinum user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DashbordPlatinumuser()  {
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.loginWithPlatiniumAccount();
	}
	
	/**
	 * @Title [Account][DAPP-13870]Dashbord: Gold user
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DashbordGoldUser()  {
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.loginWithGoldAccount();
	}
	
	
	/**
	 * @Title [Account][DAPP-13882] Dashbord Partner Advantage Plus user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DashbordPartnerAdvantagePlusUser()  {
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.loginWithPartnerAccount();
	}
	/**
	 * @Title [Account][DAPP-13883]Dashbord: Classic user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DashbordClassicUser() {
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.loginWithClassicAccount();
		
	}
	/**
	 * @Title [Account][DAPP-13884]Dashbord: Redirectionto My status screen
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DashbordRedirectiontoMyStatusScreen(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.redirectionStatus();
	}
	/**
	 * @Title [Account][DAPP-13887] Dashboard -Display only the Awards number with redeemable status
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DashbordDisplayOnlyTheAwardsNumberWithRedeemableStatus() {
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.awardsNumber();

	}
	/**
	 * @Title [Account][DAPP-13888] Dashboard - Display STAY PLUS indicator only
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DashbordDisplayStayPlusIndicatorOnly() {
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.staysPlus();
	}
	/**
	 * @Title [Account][DAPP-13908]Dashboard Change Currency
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void DashbordChangeCurrency(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());

		testPage.changeCurrency();
	}
	/**
	 * @Title [Account][DAPP-17218]Header Connecte Connected user
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void HeaderConnecteConnectedUser(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.verifyCarteClassicAndPoint();
	}
	/**
	 * @Title [Account][DAPP-2880][BAM]Authentification from the Become a member screen
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test(enabled=false)
	public void AuthentificationFromTheBecomeAMemberScreen(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.authentificationAfterSearch();
	}
	/**
	 * @Title [Account][DAPP-3976]Logout
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void Logout(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.Logout();
	
	}
	/**
	 * @Title [Account] [MyStay][DAPP-13984]Screen display in my stay details
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ScreenDisplayInMyStayDetails() {
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.staysDetails();
	}
	/**
	 * @Title [Account][MyStay][DAPP-13986]Online checkin during the stay
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test(enabled=false)
	public void OnlineCheckinDuringTheStay(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.onlineCheckIn();
	}
	/**
	 * @Title Account] [MyStay][DAPP-13982]Screen display in my stay
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ScreenDisplayInMyStay(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.screenMyStay();
	}
	/**
	 * @Title [Account][Mon Compte][DAPP-11358] Wallet-Add a card
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void WalletAddACard(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.walletAddCard();
	}
	/**
	 * @Title [Account][Mon Compte][DAPP-4119] Wallet choix de la carte
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void WalletChoixDeLaCarteCasNonPassant(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.walletChoixCarteNonPassant();
	}
	/**
	 * @Title [Account][Mon Compte][DAPP-21748] Edit Password Screen Display
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void EditPassword(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.editPassword();
	}
	/**
	 * @Title [Account][Mon Compte][DAPP-20749] Wallet choix de la carte
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void RenewPasswordSucess(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.renewPasswordSuccess();
	}
	/**
	 * @Title [Account][Mon Compte][DAPP-21752] Wallet choix de la carte
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void RenewPasswordFailed(){
		testPage=new PageTestAccount((AndroidDriver) getDriver());
		testPage.renewPasswordFailed();
	}
}
