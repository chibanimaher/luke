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
import com.qa.pages.PageTestConfirmation;
import com.qa.pages.PagePayement;
import com.qa.pages.PageSummury;
import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class Confirmation extends BaseTest{
	public PageTestConfirmation loginPage;
	public RetryTest retrytest =new RetryTest();
	/**
	 * [Confirmation][DAPP-6111] Modal Cancellation Conditions - Display Conditions - descriptions
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ModalCancellation(){
		loginPage=new PageTestConfirmation((AndroidDriver) getDriver());
		loginPage.modalCancellation();
	}
	/**
	 * [Confirmation][DAPP-6114] Modal Cancellation Conditions - Display Conditions - descriptions
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ModalCancellationAdulteRoom() {
		loginPage=new PageTestConfirmation((AndroidDriver) getDriver());
		loginPage.modalCancellationAdulteRoom();
	}
	/**
	 *  [Confirmation][DAPP-21746] Paiement en ligne_Total_ user connecté_ booking OK_
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void PaiementEnLigne() {
		loginPage=new PageTestConfirmation((AndroidDriver) getDriver());
		loginPage.paiementEnLigne();
	}
}
