package com.qa.pages;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.BasePage;
import com.qa.BaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageTestRateSelection extends BasePage{
	PageHome homepage=new PageHome(driver);
	PageSummury summury=new PageSummury(driver);
	PagePayement payement= new PagePayement(driver);
	public PageTestRateSelection(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Mobile Elements
	public static final By seeRate=By.id("com.accor.appli.hybrid.inhouse:id/roomButtonToRate");
	public static final By removeAdulte=By.xpath("//android.widget.ImageButton[@content-desc=\"− remove one adult per room\"]");
	public static final By removeChildreen=By.xpath("//android.widget.ImageButton[@content-desc=\"− remove one child per room\"]");
	public static final By messagemaxChildreen=By.id("com.accor.appli.hybrid.inhouse:id/mSnackBarMessage");
	public static final By numberchildren=By.xpath("//android.widget.ImageButton[@content-desc=\"+ add one child per room\"]");
	public static final By numberAdulte=By.xpath("//android.widget.ImageButton[@content-desc=\"+ add one adult per room\"]");
	public static final By roomOption=By.id("com.accor.appli.hybrid.inhouse:id/paxTextField");
	public static final By closeHotel=By.xpath("//android.widget.ImageButton[@content-desc=\"go up a level\" or @content-desc=\"Navigate up\"]");
	public static final By publicPrice=By.id("com.accor.appli.hybrid.inhouse:id/referencePriceTextView");
	public static final By book=By.id("com.accor.appli.hybrid.inhouse:id/bookingButton");
	public static final String checkbox="I accept the terms and conditions of service and the booking rate terms and conditions";
	public static final String CSC="CSC";
	public static final String walletCard="wallet";
	public static final String submit="SUBMIT";	
	public static final String legalNotice="LEGAL NOTICES";
	public static final String acceptConditions="I agree to receive news and marketing communications from Accor group brands and the Accor loyalty programme via email.";
	public static final By fromPrice=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final By seeRoom=By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By firstHotel=By.id("com.accor.appli.hybrid.inhouse:id/itemCarouselImageView");
	public static final By search=By.id("com.accor.appli.hybrid.inhouse:id/searchButton");
	public static final By selectedTitle=By.id("com.accor.appli.hybrid.inhouse:id/autoCompleteTextView");
	public static final By loginButton=By.id("com.accor.appli.hybrid.inhouse:id/logInButton");
	public static final By loginToAccount=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button");
	public static final By title=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.Spinner");
	public static final By firstname=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	public static final By surname=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	public static final String continueAsGuest="CONTINUE AS A GUEST";
	public static final By logon=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By account=By.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By okButton=By.id("com.accor.appli.hybrid.inhouse:id/logoutYesButton");
	public static final By email=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	public static final By password=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	public static final By logOnButton=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By confirmDestination=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	public static final By villeDestination=By.id("com.accor.appli.hybrid.inhouse:id/locationEditText");
	public static final By destination=By.id("com.accor.appli.hybrid.inhouse:id/destinationTextField");
	public static final By summuryPage=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
	public static final By labelStay=By.id("com.accor.appli.hybrid.inhouse:id/labelTextView");
	public static final By stayPlusswitch=By.id("com.accor.appli.hybrid.inhouse:id/stayPlusSwitch");
	/**
	 * connexion to account and wi verify if connexion is established
	 * @param get data from JSON File and put in the text
	 */

	public void labelDisplayingAccorPlus() {
		readData("data/rateselection/RateSelectionLabelInserUserPriceAccorPlus.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulte();
		waitAndClick(search);
		scrollToElementAndClick(dataJson.getJSONObject("en").getString("hotelName"));
		homepage.SeeRoom();
		waitAndClick(seeRate);
		isElementPresent(labelStay);

	}
	public void displayingIbisBusiness() {
		readData("data/rateselection/RateSelectionLabelInserUserPriceIbisBusiness.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination); 
		homepage.addNumberAdulte();
		waitAndClick(search);
        waitAndClick(firstHotel);
		homepage.SeeRoom();
		waitAndClick(seeRate);
		isElementPresent(labelStay);

	}
	public void displayingMenmberRate() {
		readData("data/rateselection/RateSelectionLabelInserUserPriceAccorHotelsClub.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
        waitAndClick(firstHotel);
		homepage.SeeRoom();
		waitAndClick(seeRate);
		isElementPresent(labelStay);

	}
	public void displayB2B() {
		readData("data/rateselection/RateSelectionLabelInserUserPriceDedicatedOffer.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		sleep(3000);
		waitAndClick(confirmDestination);
		homepage.addNumberAdulte();
		waitAndClick(search);
        waitAndClick(firstHotel);
		homepage.SeeRoom();
		waitAndClick(seeRate);
		isElementPresent(labelStay);

	}
	public void displayAccorPrivileged() {
		readData("data/rateselection/RateSelectionLabelInserUserPriceAccorPrivilegedPartners.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulte();
		waitAndClick(search);
        waitAndClick(firstHotel);
		homepage.SeeRoom();
		waitAndClick(seeRate);
		isElementPresent(labelStay);

	}
	public void displayBusinessPlus() {
		readData("data/rateselection/RateSelectionLabelInserUserPriceBusinessPlus.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulte();
		waitAndClick(search);
        waitAndClick(firstHotel);
		homepage.SeeRoom();
		waitAndClick(seeRate);
		isElementPresent(labelStay);

	}
}
