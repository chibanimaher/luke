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
import com.qa.pages.PageTestSummury;
import com.qa.pages.PagePayement;
import com.qa.pages.PageSummury;
import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class Summury extends BaseTest{
	public PageTestSummury summuryPage;
	public RetryTest retrytest =new RetryTest();

	
	/**
	 * [Summary][DAPP-13380] Passage direct depuis Rates Selection
	 */
	@SuppressWarnings("rawtypes")
	@Test()	
	public void PassageDirectDepuisratesSelection() {
		summuryPage=new PageTestSummury((AndroidDriver) getDriver());	
        summuryPage.verifyTitlePageSummury();
	}
	/**
	 *  [Summary][DAPP-13381] Affichage de la page Summary
	 */
	@SuppressWarnings("rawtypes")
	@Test()	
	public void AffichagePageSummury()  {
		summuryPage=new PageTestSummury((AndroidDriver) getDriver());	
        summuryPage.affichagePageSummury();
	}
	/**
	 *  [Summary][DAPP-21753] Commentaire de la page Summary
	 */
	@SuppressWarnings("rawtypes")
	@Test()	
	public void CommentPageSummury()  {
		summuryPage=new PageTestSummury((AndroidDriver) getDriver());	
        summuryPage.commentPageSummury();
	}
	/**
	 *  [Summary][DAPP-21753] Commentaire de la page Summary
	 */
	@SuppressWarnings("rawtypes")
	@Test(enabled=false)	
	public void RestrictionCommentPageSummury()  {
		summuryPage=new PageTestSummury((AndroidDriver) getDriver());	
        summuryPage.restrictionCommentPageSummury();
	}
	/**
	 *  [Summary][DAPP-21759] Gestion du contexte SC Contrat - avec adresse de facturation
	 */
	@SuppressWarnings("rawtypes")
	@Test(enabled=false)	
	public void GestionContextFacturationPageSummury()  {
		summuryPage=new PageTestSummury((AndroidDriver) getDriver());	
        summuryPage.adresseFacturationPageSummury();
	}
}
