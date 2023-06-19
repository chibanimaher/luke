package com.qa.pages;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.BasePage;
import com.qa.BaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageTestConfirmation extends BasePage{
	PageHome homepage=new PageHome(driver);
	PageSummury summury=new PageSummury(driver);
	PagePayement payement= new PagePayement(driver);
	PageConfiguration pageConf= new PageConfiguration(driver);
	public PageTestConfirmation(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//public static final By logon=By.xpath(readProperties("logon"));
	//public static final By loginButt = By.id(readProperties("acceptConditions"));
	public static final By firstHotel=By.id("com.accor.appli.hybrid.inhouse:id/itemCarouselImageView");
	public static final By search=By.id("com.accor.appli.hybrid.inhouse:id/searchButton");
	public static final By confirmDestination=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	public static final By villeDestination=By.id("com.accor.appli.hybrid.inhouse:id/locationEditText");
	public static final By destination=By.id("com.accor.appli.hybrid.inhouse:id/destinationTextField");
	public static final String submit="SUBMIT";	
	public static final String acceptConditions="I agree to receive news and marketing communications from Accor group brands and the Accor loyalty programme via email.";
	public static final By loginButton=By.id("com.accor.appli.hybrid.inhouse:id/logInButton");
	public static final By loginToAccount=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button");
	public static final By logon=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By account=By.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By okButton=By.id("com.accor.appli.hybrid.inhouse:id/logoutYesButton");
	public static final By email=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	public static final By password=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	/**
	 * connexion to account and we continue until booking page and try to cancell reservation
	 * @param get data from JSON File and put in the text
	 */

	public void modalCancellation() {
		pageConf.accessEnvWithoutToggle();
		readData("data/confirmation/ConfirmationDisplayCancellationConditions.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		homepage.searchHotels();
		homepage.chooseHotel();
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
	}
	/**
	 * connexion to account and we continue until booking page and try to cancell reservation
	 * @param get data from JSON File and put in the text
	 */
	public void modalCancellationAdulteRoom() {
		pageConf.accessEnvWithoutToggle();
		readData("data/confirmation/ConfirmationDisplayCancellationConditions.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		homepage.searchHotels();
		homepage.addNumberAdulteAndRoom();
		homepage.chooseHotel();
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
	}
	public void paiementEnLigne() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/LogosBrands.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.chooseHotel();
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		payement.PayementSpecialSamsungS10();
		
	}
}
